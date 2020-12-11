package br.ufsc.grad.compilator.listeners;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ParserRuleContext;

import br.ufsc.grad.compilator.Constants;
import br.ufsc.grad.compilator.antlr.ConvCCC20201BaseListener;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.Factor1Context;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.FactorContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.LvalueContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.MinorarithContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.NumexpbracketContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.Numexpression1Context;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.NumexpressionContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.Term1Context;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.TermContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.UnaryexprContext;
import br.ufsc.grad.compilator.listeners.util.TreeUtil;
import br.ufsc.grad.compilator.model.SymbolTable;
import br.ufsc.grad.compilator.model.scope.ScopeToken;

public class TreePrinter extends ConvCCC20201BaseListener {

    public SymbolTable table;
    public HashMap<ParserRuleContext, TreeTuple> nodes;

    public TreePrinter(SymbolTable table) {
        this.table = table;
        nodes = new HashMap<>();
    }

    private static <T> List<T> reverse(List<T> t) {
        Collections.reverse(t);
        return t;
    }

    public static void print_tree(TreeTuple tuple, PrintWriter out) {
        print_tree(tuple, out, "", true);
    }

    public static void print_tree(TreeTuple tuple, PrintWriter out, String prefix, boolean last) {
        if (tuple.isTuple()) {
            out.println(prefix + (last ? "`-" : "|- ") + tuple.getText());
            prefix += (last ? "   " : "|  ");
            if (tuple.left != null) {
                print_tree(tuple.left, out, prefix, tuple.right == null);
            }
            if (tuple.right != null) {
                print_tree(tuple.left, out, prefix, true);
            }
        } else {
            out.println(prefix + (last ? "`-" : "|- ") + tuple.getText());
        }
    }

    @Override
    public void exitNumexpression(NumexpressionContext ctx) {
        try {
            File outputFile = new File(Constants.TREE_OUTPUT_PATH);
            if (!outputFile.exists())
                outputFile.createNewFile();
            try (FileWriter fw = new FileWriter(outputFile, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw)) {
                nodes.put(ctx, nodes.get(ctx.term()));

                Numexpression1Context n1ctx = ctx.numexpression1();
                if (n1ctx.minorarith() != null){
                    TreeTuple left = nodes.get(ctx);
                    TreeTuple right = nodes.get(n1ctx.term());
                    nodes.put(ctx, new TreeTuple(n1ctx.minorarith().getText(), left, right));
                }
                out.println("Syntax tree for expression in line " + ctx.start.getLine());
                print_tree(nodes.get(ctx), out);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitTerm(TermContext ctx) {
        nodes.put(ctx, nodes.get(ctx.unaryexpr()));

        Term1Context t1ctx = ctx.term1();
        while (t1ctx.priorarith() != null) {
            TreeTuple left = nodes.get(ctx);
            TreeTuple right = nodes.get(t1ctx.unaryexpr());
            nodes.put(ctx, new TreeTuple(t1ctx.priorarith().getText(), left, right));
            t1ctx = t1ctx.term1();
        }
    }

    @Override
    public void exitUnaryexpr(UnaryexprContext ctx) {
        if (ctx.minorarith() != null) {
            nodes.put(ctx, new TreeTuple(ctx.minorarith().getText(), nodes.get(ctx.factor())));
        } else {
            nodes.put(ctx, nodes.get(ctx.factor()));
        }
    }

    @Override
    public void exitFactor(FactorContext ctx) {
        if (ctx.numexpression() != null) {
            System.out.println(ctx.getText());
            nodes.put(ctx, nodes.get(ctx.numexpression()));
        } else if (ctx.factor1() != null) {
            nodes.put(ctx, nodes.get(ctx.factor1()));
        } else {
            System.out.println(ctx.getText());
            nodes.put(ctx, new TreeTuple(ctx.getText()));
        }
    }

    @Override
    public void exitFactor1(Factor1Context ctx) {
        nodes.put(ctx, new TreeTuple(ctx.getText()));
    }
    
    @Override
    public void exitNumexpbracket(NumexpbracketContext ctx) {
        nodes.put(ctx, nodes.get(ctx.numexpression()));
    }

    @Override
    public void exitLvalue(LvalueContext ctx) {
        Optional<ScopeToken> optional = table.findSymbol(ctx.IDENT().getText());
        if (optional.isPresent()) {
            ScopeToken token = optional.get();
            nodes.put(ctx, new TreeTuple(token.getLexValue(), false));

            TreeTuple left = nodes.get(ctx);
            TreeTuple right = nodes.get(ctx.numexpbracket().numexpression());
            nodes.put(ctx, new TreeTuple("arrayAccess", left, right));
        }

    }
}
