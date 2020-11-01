package br.ufsc.grad.compilator.error;

public class SyntaxErrorException extends CompilationException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    

    public SyntaxErrorException(String cause) {
        super(cause);
    }
}
