package br.ufsc.grad.compilator.listeners;

public class TreeTuple {
    
    private String text;
    public TreeTuple left;
    public TreeTuple right;

    private boolean tuple;

    private TreeTuple(String text, TreeTuple left, TreeTuple right, boolean tuple) {
        this.text = text;
        this.right = right;
        this.left = left;
        this.tuple = tuple;
    }

    public TreeTuple(String text, TreeTuple left) {
        this(text, left, null, true);
    }

    public TreeTuple(String text, TreeTuple left, TreeTuple right) {
        this(text, left, right, true);
    }
    public TreeTuple(String text, boolean tuple) {
        this(text, null, null, tuple);
    }

    public TreeTuple(String text) {
        this(text, true);
    }

    public String getText() {
        return text;
    }

    public boolean isTuple() {
        return tuple;
    }
    
}
