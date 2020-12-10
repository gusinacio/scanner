package br.ufsc.grad.compilator.model;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Optional;
// import java.util.ArrayList;
// import java.util.List;
import java.util.Stack;

import br.ufsc.grad.compilator.App;
import br.ufsc.grad.compilator.Constants;
import br.ufsc.grad.compilator.model.scope.Scope;
import br.ufsc.grad.compilator.model.scope.ScopeToken;
import br.ufsc.grad.compilator.model.scope.ScopeType;
import br.ufsc.grad.compilator.model.scope.TokenType;

// import org.antlr.v4.runtime.Token;

// import dnl.utils.text.table.TextTable;

public class SymbolTable {
    // private List<Token> tokenTable;
    private Stack<Scope> stack;

    public SymbolTable() {
        // tokenTable = new ArrayList<>();
        stack = new Stack<>();
    }

    public void enterScope(ScopeType type, int line) {
        stack.push(new Scope(type, line));
    }

    public void addSymbol(String symbol, TokenType type) {
        stack.lastElement().addSymbol(new ScopeToken(symbol, type));
    }

    public boolean checkScope(String symbol) {
        return stack.lastElement().containsSymbol(symbol);
    }

    public boolean isInside(ScopeType type) {
        return stack.stream().filter(scope -> scope.getType() == type).findAny().isPresent();
    }

    public Optional<ScopeToken> findSymbol(String symbol) {
        return stack.stream().map(scope -> scope.getVariables()).flatMap(Collection::stream)
                .filter(token -> token.getLexValue().equals(symbol)).findAny();
    }

    public void exitScope() {
        Scope scope = stack.pop();
        try {
            File outputFile = new File(Constants.SYMBOL_TABLE_OUTPUT_PATH);
            if (!outputFile.exists())
                outputFile.createNewFile();
            try (FileWriter fw = new FileWriter(outputFile, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw)) {
                out.println("Symbol Table[" + scope.getType() + ":" + scope.getLine() + "]");
                for (ScopeToken token : scope.getVariables()) {
                    out.println("Value: " + token.getLexValue() + " | Type: " + token.getType());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public void print() {
    // System.out.println("Tabela de símbolos:");
    // String[][] textStrings = new String[tokenTable.size()][4];
    // for (int i = 0; i < tokenTable.size(); i++) {
    // Token token = tokenTable.get(i);
    // textStrings[i] = new String[] { i + "", token.getText(), token.getLine() +
    // "",
    // token.getCharPositionInLine() + "" };
    // }

    // TextTable table = new TextTable(new String[] { "ID", "Lexema", "Linha",
    // "Coluna" }, textStrings);
    // table.printTable();
    // System.out.println();
    // }

}
