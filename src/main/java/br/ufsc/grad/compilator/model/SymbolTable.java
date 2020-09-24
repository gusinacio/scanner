package br.ufsc.grad.compilator.model;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import dnl.utils.text.table.TextTable;

public class SymbolTable {
    private List<Token> tokenTable;

    public SymbolTable() {
        tokenTable = new ArrayList<>();
    }

    public void addEntry(Token token) {
        tokenTable.add(token);
    }

    public void print() {
        System.out.println("Tabela de símbolos:");
        String[][] textStrings = new String[tokenTable.size()][4];
        for (int i = 0; i < tokenTable.size(); i++) {
            Token token = tokenTable.get(i);
            textStrings[i] = new String[] { i + "", token.getText(), token.getLine() + "",
                    token.getCharPositionInLine() + "" };
        }

        TextTable table = new TextTable(new String[] { "ID", "Lexema", "Linha", "Coluna" }, textStrings);
        table.printTable();
        System.out.println();
    }

}
