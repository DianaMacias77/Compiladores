from antlr.coolListener import coolListener
from antlr.coolParser import coolParser
from util.asm import *
from util.structure import allClasses, lookupClass

"""
Los tipos quedarán así:
object 0
IO 1
Int 2
String 3
Boolean 4"""


class Literales(coolListener):
    def __init__(self):
        self.idx = 0
        self.result = ""

    def enterInt(self, ctx:coolParser.IntContext):
        self.result += cTplInt.substitute(idx=self.idx, tag=2, value=ctx.getText())
        ctx.constantIdx = self.idx
        self.idx = self.idx + 1


    def enterStr(self, ctx:coolParser.StrContext):
        strValue = ctx.getText()[1:-1]
        self.result += cTplInt.substitute(idx=self.idx, tag=2, value=len(strValue()))
        self.idx = self.idx + 1

        self.result += cTplStr.substitute(idx=self.idx, tag=3, size=4+(len(strValue())+1)%4,
                                          sizeIdx=(self.idx-1), value=strValue())
        ctx.constantIdx = self.idx
        self.idx = self.idx + 1



class CodeGen():
    def __init__(self, walker, tree):
        self.result = ""
        self.tree = tree
        self.walker = walker
        self.idx = 0

    def generar(self):
        self.segDatos()
        self.segTexto()

    def segDatos(self):
        literales = Literales()
        self.walker.walk(literales, self.tree)

        # nombre de todas las clases, #direccion de objetos modelo como template, itera sobre lista de clases y el init, #itera sobre las clases y después por cada nombre de metodos que hay en la clase incluyendo herencia, #itera sobre cada objeto y cada
        self.result = literales.result +\
                      self.tablaNombres(literales.idx) +\
                      self.tablaModelosConstructores() +\
                      self.tablaMetodos() +\
                      self.objetosModelos()

    def tablaNombres(self,idx):
        r = "class_nameTab:\n"
        for k in allClasses().values():
            self.result += cTplInt.substitute(idx=idx, tag=2, value=len(k.name))
            idx = idx + 1

            self.result += cTplStr.substitute(idx=idx, tag=3, size=4 + (len(k.name) + 1) % 4,
                                              sizeIdx=(idx - 1), value=k.name)
            r += "    .word str_const{}\n".format(idx)
            idx = idx + 1
        return r

    def tablaModelosConstructores(self):
    #no se ha generado, se debe generar la tabla class_objTab y conctatenar protObj y Init
    # LISTOOOO :D
        r = "class_objTab:\n"
        for k in allClasses().values():
            r += k.name + "_protObj:\n"
            r += "  .word {}.{}\n".format(k.name, k)
            r += k.name + "_init:\n"
            r += "  .word {}.{}\n".format(k.name, k)
        return r

    def tablaMetodos(self):
        r = ""
        for k in allClasses().values():
            r += k.name + "_dispTab:\n"
            for k1 in k.methods:
                #indices y encontrar los valores por herencia
                #iterar sobre cada clase y luego sobres sus métodos, INCLUYENDO HERENCIA
                r += "    .word {}.{}\n".format(k.name, k1)
            k = lookupClass(k.inherits)
        return r

    def objetosModelos(self):
        r = "_protObj:\n"
        idx=0
        for k in allClasses().values():
            if k.name != "Main":
                r += k.substitute(name="{}_protObj".format(k.name),tag=idx, size=3 +len(k.attributes), name_dispTab="{}_dispTab".format(k.name))
            #imprimirlos y que cambien acorde a sus atributos, conteo de atributos o features (así se llaman) y se ponen ceros para cada clase
            r+= "    .word 0\n"
        return r

    def segTexto(self):
        pass

"""
    Segmento de Datos:



Algunas etiquetas son fijas y obligatorias, las requiere el runtime

Constantes
    1. Determinar literales string
        1.1 Obtener lista de literales (a cada una asignar un índice) + nombres de las clases
        1.2 Determinar constantes numéricas necesarias
        1.3 Reemplazar en la plantilla:
            - tag
            - tamaño del objeto: [tag, tamaño, ptr al dispTab, ptr al int, (len(contenido)+1)%4] = ?
                (el +1 es por el 0 en que terminan siempre)
            - índice del ptr al int
            - valor (el string)
    2. Determinar literales enteras
        2.1 Literales necesarias en el punto 1
        2.2 + constantes en el código fuente
        2.3 Remplazar en la plantilla:
            - tag
            - tamaño del objeto: [tag, tamaño, ptr al dispTab y contenido] = 4 words
            - valor

Tablas que requiere el runtime
    1. class_nameTab: tabla para los nombres de las clases en string
        1.1 Los objetos ya fueron generados arriba
        1.2 El tag de cada clase indica el desplazamiento desde la etiqueta class_nameTab
    2. class_objTab: prototipos (templates) y constructores para cada objeto
        2.1 Indexada por tag: en 2*tag está el protObj, en 2*tag+1 el init
    3. dispTab para cada clase
        3.1 Listado de los métodos en cada clase considerando herencia

Objetos para copiar cuando se ejecuta new
    El prototipo o plantilla para cada objeto (es decir, de donde new copia al instanciar)
    1. Para cada clase generar un objeto, poner atención a:
        - nombre
        - tag
        - tamaño en words [tag, tamaño, dispTab, atributos ... ] = ?
            Es decir, el tamaño se calcula en base a los atributos + 3, por ejemplo
                Int tiene 1 atributo (el valor) por lo que su tamanio es 3+1
                String tiene 2 atributos (la longitud y el valor (el 0 al final)) por lo que su tamaño es 3+2
        - dispTab
        - atributos
"""


"""
Segmento de Texto:
Código de cada método de acuerdo al dispTab. Debe existir un Main.main
"""