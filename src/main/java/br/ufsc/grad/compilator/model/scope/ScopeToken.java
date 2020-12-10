package br.ufsc.grad.compilator.model.scope;

public class ScopeToken {
    

    private String lexValue;
    private TokenType type;


    public ScopeToken(String lexValue, TokenType type) {
        this.lexValue = lexValue;
        this.type = type;
    }

    public String getLexValue() {
        return lexValue;
    }

    public TokenType getType() {
        return type;
    }
}
