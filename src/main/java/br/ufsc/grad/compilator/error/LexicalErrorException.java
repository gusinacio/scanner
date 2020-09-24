package br.ufsc.grad.compilator.error;

public class LexicalErrorException extends CompilationException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    

    public LexicalErrorException(String cause) {
        super(cause);
    }
}
