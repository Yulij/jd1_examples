package lecture12_exceptions.exceptions;

public class MyBadPhraseException extends Exception {
    private String word;

    public MyBadPhraseException(String message) {
        super(message);
    }
    public MyBadPhraseException(String message, String word) {
        super(message);
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
