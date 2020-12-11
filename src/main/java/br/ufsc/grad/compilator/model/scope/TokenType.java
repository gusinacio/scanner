package br.ufsc.grad.compilator.model.scope;

public enum TokenType {
    
    INT("int", 4), FLOAT("float", 8), STRING("string", 8);

    private int width;
    private String word;

    private TokenType(String reservedWord, int width) {
        this.width = width;
        this.word = reservedWord;
    }

    public int getWidth() {
        return width;
    }

    public String getWord() {
        return word;
    }

	public static TokenType fromString(String word) {
        for (TokenType type : values())
            if(type.word.equals(word))
                return type;
		return null;
	}

}
