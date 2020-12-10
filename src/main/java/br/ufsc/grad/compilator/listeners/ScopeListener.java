package br.ufsc.grad.compilator.listeners;

import java.io.File;
import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;

import br.ufsc.grad.compilator.Constants;
import br.ufsc.grad.compilator.antlr.ConvCCC20201BaseListener;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.BreakstatContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.ElsestatContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.ForstatContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.FuncdefContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.IfstatContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.OpenclosestatContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.ProgramContext;
import br.ufsc.grad.compilator.model.SymbolTable;
import br.ufsc.grad.compilator.model.scope.ScopeType;

public class ScopeListener extends ConvCCC20201BaseListener {

    public SymbolTable table;
    public HashMap<ParserRuleContext, HashMap<String, String>> customValues;

    public ScopeListener(SymbolTable table) {
        this.table = table;
        customValues = new HashMap<>();
    }

    @Override
    public void enterProgram(ProgramContext ctx) {
        customValues.putIfAbsent(ctx, new HashMap<>());
        customValues.get(ctx).putIfAbsent("nextStmt", "END");

        try {
            File outputFile = new File(Constants.SYMBOL_TABLE_OUTPUT_PATH);
            if (outputFile.exists())
                outputFile.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }


        table.enterScope(ScopeType.PROGRAM, ctx.start.getLine());
    }

    @Override
    public void exitProgram(ProgramContext ctx) {
        table.exitScope();
    }


    @Override
    public void enterOpenclosestat(OpenclosestatContext ctx) {
        table.enterScope(ScopeType.STATELIST, ctx.start.getLine());
    }

    @Override
    public void exitOpenclosestat(OpenclosestatContext ctx) {
        table.exitScope();
    }

    @Override
    public void exitBreakstat(BreakstatContext ctx) {
        if (!table.isInside(ScopeType.FOR)) {
            throw new RuntimeException("Error: Break outside FOR LOOP line: " + ctx.start.getLine());
        }
    }

    @Override
    public void enterFuncdef(FuncdefContext ctx) {
        table.enterScope(ScopeType.FUNCTION, ctx.start.getLine());
    }

    @Override
    public void exitFuncdef(FuncdefContext ctx) {
        table.exitScope();
    }

    @Override
    public void enterIfstat(IfstatContext ctx) {
        table.enterScope(ScopeType.IF, ctx.start.getLine());
    }

    @Override
    public void enterElsestat(ElsestatContext ctx) {
        table.exitScope(); // EXIT IF SCOPE
        table.enterScope(ScopeType.ELSE, ctx.start.getLine());
    }

    @Override
    public void exitElsestat(ElsestatContext ctx) {
        table.exitScope();
    }

    @Override
    public void enterForstat(ForstatContext ctx) {
        table.enterScope(ScopeType.FOR, ctx.start.getLine());
    }

    @Override
    public void exitForstat(ForstatContext ctx) {
        table.exitScope();
    }

}
