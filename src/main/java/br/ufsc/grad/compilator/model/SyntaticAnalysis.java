package br.ufsc.grad.compilator.model;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRInputStream;

import br.ufsc.grad.compilator.antlr.ConvCCC20201Lexer;
import br.ufsc.grad.compilator.antlr.ConvCCC20201Parser;
import br.ufsc.grad.compilator.error.SyntaticalErrorException;
import br.ufsc.grad.compilator.error.SyntaxError;
import br.ufsc.grad.compilator.error.SyntaxErrorListener;

@SuppressWarnings("deprecation")
public class SyntaticAnalysis {

    private LexicalAnalysis lexer;

    public SyntaticAnalysis(LexicalAnalysis lexer) {
        this.lexer = lexer;
    }

    public void analyse() throws SyntaticalErrorException, IOException {
        try (FileInputStream is = new FileInputStream(this.lexer.getFile())) {
            ANTLRInputStream antlrIs = new ANTLRInputStream(is);
            ConvCCC20201Lexer lexer = new ConvCCC20201Lexer(antlrIs);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            ConvCCC20201Parser parser = new ConvCCC20201Parser(tokenStream);
            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);
            parser.program();

            // If error, stop now and print line
            if (errorListener.getSyntaxErrors().size() > 0) {
                for (SyntaxError error : errorListener.getSyntaxErrors()) {
                    System.out.printf("line %d:%d %s\n", error.getLine(), error.getCharPositionInLine(),
                            error.getMessage());
                }
                throw new SyntaticalErrorException("Error parsing");
            } else {
                System.out.println("Successful parsing!");
            }
        }
    }
}
