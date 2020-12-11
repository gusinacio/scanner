package br.ufsc.grad.compilator.model;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import br.ufsc.grad.compilator.antlr.ConvCCC20201Lexer;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser;
import br.ufsc.grad.compilator.error.SyntaxErrorException;
import br.ufsc.grad.compilator.error.SyntaxError;
import br.ufsc.grad.compilator.error.SyntaxErrorListener;
import br.ufsc.grad.compilator.listeners.ScopeListener;
import br.ufsc.grad.compilator.listeners.SymbolListener;
import br.ufsc.grad.compilator.listeners.TreePrinter;

@SuppressWarnings("deprecation")
public class SyntaxAnalysis {

    private LexicalAnalysis lexer;

    public SyntaxAnalysis(LexicalAnalysis lexer) {
        this.lexer = lexer;
    }

    /**
     * Call the parser inside ANTLR Class for Syntatical Analysis
     * 
     * On success: print successful parsing
     * 
     * On error: print the line and what error
     */
    public void analyse() throws SyntaxErrorException, IOException {
        try (FileInputStream is = new FileInputStream(this.lexer.getFile())) {
            ANTLRInputStream antlrIs = new ANTLRInputStream(is);
            ConvCCC20201Lexer lexer = new ConvCCC20201Lexer(antlrIs);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            ConvCCC20201Parser parser = new ConvCCC20201Parser(tokenStream);
            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            SymbolTable table = new SymbolTable();
            parser.addParseListener(new ScopeListener(table));
            parser.addParseListener(new SymbolListener(table));
            parser.addParseListener(new TreePrinter(table));
            parser.program();
            
            // If error, stop now and print line
            if (errorListener.getSyntaxErrors().size() > 0) {
                for (SyntaxError error : errorListener.getSyntaxErrors()) {
                    System.out.printf("line %d:%d %s\n", error.getLine(), error.getCharPositionInLine(),
                            error.getMessage());
                }
                throw new SyntaxErrorException("Error parsing");
            } else {
                System.out.println("All expressions valid!");
                System.out.println("All declarations valid!");
                System.out.println("Every break is inside a for!");
            }
        }
    }
}
