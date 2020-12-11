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
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.FactorContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.LvalueContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.MinorarithContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.NumexpbracketContext;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser.NumexpressionContext;
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

                for (ParseTree[] entry : reverse(TreeUtil.chunker(ctx.children, 2))) {
                    TreeTuple left = nodes.get(ctx);
                    TreeTuple right = nodes.get(entry[1]);
                    nodes.put(ctx, new TreeTuple(entry[0].getText(), left, right));
                    out.println("Syntax tree for expression in line " + ctx.start.getLine());
                    print_tree(nodes.get(ctx), out);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exitTerm(TermContext ctx) {
        nodes.put(ctx, nodes.get(ctx.unaryexpr()));

        for (ParseTree[] entry : reverse(TreeUtil.chunker(ctx.children, 2))) {
            TreeTuple left = nodes.get(ctx);
            TreeTuple right = nodes.get(entry[1]);
            nodes.put(ctx, new TreeTuple(entry[0].getText(), left, right));
        }
    }

    @Override
    public void exitUnaryexpr(UnaryexprContext ctx) {
        if (ctx.minorarith() != null) {
            if (ctx.minorarith().MINUS() != null) {
                nodes.put(ctx, new TreeTuple("-", nodes.get(ctx.factor())));
            } else if (ctx.minorarith().PLUS() != null) {
                nodes.put(ctx, new TreeTuple("+", nodes.get(ctx.factor())));
            } else {
                nodes.put(ctx, nodes.get(ctx.factor()));
            }
        }
    }

    @Override
    public void exitFactor(FactorContext ctx) {
        if (ctx.INT_CONSTANT() != null) {
            nodes.put(ctx, new TreeTuple(ctx.INT_CONSTANT().getText()));
        } else if (ctx.FLOAT_CONSTANT() != null) {
            nodes.put(ctx, new TreeTuple(ctx.FLOAT_CONSTANT().getText()));
        } else if (ctx.STRING_CONSTANT() != null) {
            nodes.put(ctx, new TreeTuple(ctx.STRING_CONSTANT().getText()));
        } else if (ctx.NULL() != null) {
            nodes.put(ctx, new TreeTuple(ctx.NULL().getText()));
        } else if (ctx.IDENT() != null) {
            nodes.put(ctx, new TreeTuple(ctx.IDENT().getText()));
        } else if (ctx.numexpression() != null) {
            nodes.put(ctx, nodes.get(ctx.numexpression()));
        }
    }

    @Override
    public void exitLvalue(LvalueContext ctx) {
        Optional<ScopeToken> optional = table.findSymbol(ctx.IDENT().getText());
        if (optional.isPresent()) {
            ScopeToken token = optional.get();
            System.out.println(token.getLexValue());
            nodes.put(ctx, new TreeTuple(token.getLexValue(), false));

            if (ctx.numexpbracket().numexpression() != null) {
                TreeTuple left = nodes.get(ctx);
                TreeTuple right = nodes.get(ctx.numexpbracket().numexpression());
                nodes.put(ctx, new TreeTuple("arrayAccess", left, right));
            }
        }

    }
}
