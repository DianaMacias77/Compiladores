from util.exceptions import *
from antlr.coolListener import coolListener
from antlr.coolParser import coolParser


class SemanticListener(coolListener):
    def __init__(self):
        self.main = False

    def enterAttribute(self, ctx: coolParser.AttributeContext):
        if ctx.ID().getText() == 'self':
            raise BadAttributeName()

    def enterKlass(self, ctx: coolParser.KlassContext):
        if ctx.TYPE(1) and ctx.TYPE(1).getText() == 'String':
            raise InvalidInheritance()