package br.ufsc.grad.compilator.listeners;

import java.util.HashMap;
import java.util.Optional;

import org.antlr.v4.runtime.ParserRuleContext;

import br.ufsc.grad.compilator.antlr.ConvCCC20201BaseListener;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.AllocexpressionContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.AtribstatContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.ExpressionContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.LvalueContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.NumexpressionContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.ParamlistContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.VardeclContext;
import br.ufsc.grad.compilator.model.SymbolTable;
import br.ufsc.grad.compilator.model.scope.ScopeToken;
import br.ufsc.grad.compilator.model.scope.TokenType;

public class SymbolListener extends ConvCCC20201BaseListener {

    public SymbolTable table;
    public HashMap<ParserRuleContext, String> types;

    public SymbolListener(SymbolTable table) {
        this.table = table;
        this.types = new HashMap<>();
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

    @Override
    public void exitAtribstat(AtribstatContext ctx) {
        String varName = ctx.lvalue().IDENT().getText();
        Optional<ScopeToken> optional = table.findSymbol(varName);
        if (optional.isEmpty()) {
            throw new RuntimeException("Error: " + varName + " not declared.");
        } else {
            ScopeToken token = optional.get();
            if (token.getType().getWord().equals(ctx.children.get(2).getText())) {

            }
        }
    }

    @Override
    public void exitLvalue(LvalueContext ctx) {
        Optional<ScopeToken> optional = table.findSymbol(ctx.IDENT().getText());
        if(optional.isEmpty()) {
            throw new RuntimeException("Error: variable '" + ctx.IDENT().getText() + "' not declared in line " + ctx.start.getLine());
        }

    }

    @Override
    public void exitAllocexpression(AllocexpressionContext ctx) {
        types.put(ctx, ctx.children.get(1).getText());
    }

    @Override
    public void exitExpression(ExpressionContext ctx) {
        if (ctx.expression1().numexpression() != null) {
            if (types.get(ctx.numexpression()) != types.get(ctx.expression1().numexpression()))
                throw new RuntimeException("Error: Incompatible types in expression in line " + ctx.start.getLine());
            types.put(ctx, "int");
        } else {
            types.put(ctx, types.get(ctx.numexpression()));
        }
    }

    @Override
    public void exitNumexpression(NumexpressionContext ctx) {
        
    }
}
