package br.ufsc.grad.compilator.model.scope;

import java.util.ArrayList;
import java.util.List;

public class Scope {

    private ScopeType type;
    private int line;
    private List<ScopeToken> variables;

    public Scope(ScopeType type, int line) {
        this.type = type;
        this.line = line;
        variables = new ArrayList<>();
    }

    public ScopeType getType() {
        return type;
    }

    public int getLine() {
        return line;
    }

    public void addSymbol(ScopeToken token) {
        variables.add(token);
    }

    public boolean containsSymbol(String symbol) {
        return variables.stream().filter(token -> token.getLexValue().equals(symbol)).findFirst().isPresent();
    }

    public List<ScopeToken> getVariables() {
        return variables;
    }

}
