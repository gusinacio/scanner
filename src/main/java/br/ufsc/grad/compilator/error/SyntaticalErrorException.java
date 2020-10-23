package br.ufsc.grad.compilator.error;

public class SyntaticalErrorException extends CompilationException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    

    public SyntaticalErrorException(String cause) {
        super(cause);
    }
}
