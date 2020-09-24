package br.ufsc.grad.compilator.error;

public class CompilationException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public CompilationException(String cause) {
        super(cause);
    }

}
