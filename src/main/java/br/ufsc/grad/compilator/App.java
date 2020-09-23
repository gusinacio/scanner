/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.ufsc.grad.compilator;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

import br.ufsc.grad.compilator.error.SyntaxError;
import br.ufsc.grad.compilator.error.SyntaxErrorListener;
import dnl.utils.text.table.TextTable;

@SuppressWarnings("deprecation")
public class App {

    public static void main(String[] args) {
        // Check for args
        if (args.length != 1) {
            System.out.println("Você precisa passar o destino do arquivo.");
            return;
        }

        // Check for file
        File f = new File(args[0]);
        
        if ((!f.exists() || f.isDirectory()) || !f.getName().toLowerCase().endsWith(".ccc")) {
            System.out.println("Arquivo invalido. Necessário ser <arquivo>.ccc");
            return;
        }

        try {
            // We open a input stream from file
            try (FileInputStream is = new FileInputStream(f)) {

                // Create lexer in ANTLR
                ANTLRInputStream antlrIs = new ANTLRInputStream(is);
                CCC20201Lexer lexer = new CCC20201Lexer(antlrIs);

                // Create our own error listener
                SyntaxErrorListener errorListener = new SyntaxErrorListener();
                lexer.removeErrorListeners();
                lexer.addErrorListener(errorListener);

                // List all tokens from file
                List<? extends Token> tokens = lexer.getAllTokens();

                // If error, stop now and print line
                if (errorListener.getSyntaxErrors().size() > 0) {
                    for (SyntaxError error : errorListener.getSyntaxErrors()) {
                        System.out.printf("line %d:%d %s\n", error.getLine(), error.getCharPositionInLine(),
                                error.getMessage());
                    }
                    throw new Exception("Error in syntax");
                }

                // Token list
                System.out.println("Lista de Tokens:");
                Stream<? extends Token> tokenStream = new ArrayList<>(tokens).stream();
                tokenStream.map((token) -> lexer.getRuleNames()[token.getType() - 1])
                        .forEach((token) -> System.out.println(token));

                // ID Table
                Stream<? extends Token> idTokens = new ArrayList<>(tokens).stream()
                        .filter((token) -> token.getType() == CCC20201Lexer.IDENT);
                idTokens.forEach((token) -> System.out.println(token.getText()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
