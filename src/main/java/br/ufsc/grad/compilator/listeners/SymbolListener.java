package br.ufsc.grad.compilator.listeners;

import br.ufsc.grad.compilator.antlr.ConvCCC20201BaseListener;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.ParamlistContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.VardeclContext;
import br.ufsc.grad.compilator.model.SymbolTable;
import br.ufsc.grad.compilator.model.scope.TokenType;

public class SymbolListener extends ConvCCC20201BaseListener {

    public SymbolTable table;

    public SymbolListener(SymbolTable table) {
        this.table = table;
    }

    @Override
    public void exitParamlist(ParamlistContext ctx) {
        if (ctx.children != null) {
            String type = ctx.children.get(0).getText();
            String name = ctx.children.get(1).getText();
            table.addSymbol(name, TokenType.fromString(type));
        }
    }

    @Override
    public void exitVardecl(VardeclContext ctx) {
        String varType = ctx.children.get(0).getText();
        String varName = ctx.children.get(1).getText();
        int line = ctx.getStart().getLine();

        if (table.checkScope(varName)){
            throw new RuntimeException("Declaration error in line " + line + ": '" + varName + "' already declared.");
        } else {
            table.addSymbol(varName, TokenType.fromString(varType));
        }
    }
}
