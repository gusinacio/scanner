package br.ufsc.grad.compilator.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

import br.ufsc.grad.compilator.antlr.ConvCCC20201Lexer;
import br.ufsc.grad.compilator.error.LexicalErrorException;
import br.ufsc.grad.compilator.error.SyntaxError;
import br.ufsc.grad.compilator.error.SyntaxErrorListener;

@SuppressWarnings("deprecation")
public class LexicalAnalysis {

    private File file;
    private SymbolTable symbolTable;

    private List<? extends Token> tokenList;
    private String[] tokenTypeNames;

    public LexicalAnalysis(File file) {
        this.file = file;
        symbolTable = new SymbolTable();
        assert (this.file.exists() && !this.file.isDirectory());
    }

    /**
     * Anaylses the provided `file` searching for all tokens and populating the
     * symbol table
     * 
     * @throws Exception
     */
    public void analyse() throws LexicalErrorException, FileNotFoundException, IOException {
        // We open a input stream from file
        try (FileInputStream is = new FileInputStream(this.file)) {

            // Create lexer in ANTLR
            ANTLRInputStream antlrIs = new ANTLRInputStream(is);
            ConvCCC20201Lexer lexer = new ConvCCC20201Lexer(antlrIs);
            this.tokenTypeNames = lexer.getRuleNames();
            // Create our own error listener
            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            lexer.removeErrorListeners();
            lexer.addErrorListener(errorListener);

            // List all tokens from file
            tokenList = lexer.getAllTokens();

            // If error, stop now and print line
            if (errorListener.getSyntaxErrors().size() > 0) {
                for (SyntaxError error : errorListener.getSyntaxErrors()) {
                    System.out.printf("line %d:%d %s\n", error.getLine(), error.getCharPositionInLine(),
                            error.getMessage());
                }
                throw new LexicalErrorException("Error in syntax");
            }

            // ID Table
            // Stream<? extends Token> idListStream = new ArrayList<>(this.tokenList).stream()
            //         .filter((token) -> token.getType() == ConvCCC20201Lexer.IDENT);
            // idListStream.forEach((token) -> symbolTable.addEntry(token));
        }
    }

    /**
     * Prints all items in the symbol table
     */
    public void printSymbolTable() {
        // this.symbolTable.print();
    }

    /**
     * Prints the token list
     */
    public void printTokenList() {
        System.out.println("Lista de Tokens:");
        Stream<? extends Token> tokenStream = new ArrayList<>(this.tokenList).stream();
        System.out.println(tokenStream.map((token) -> this.tokenTypeNames[token.getType() - 1])
                .collect(Collectors.joining(", ")).toString());
        System.out.println();
    }

    public File getFile() {
        return file;
    }
}
