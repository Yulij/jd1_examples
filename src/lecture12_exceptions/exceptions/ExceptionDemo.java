package lecture12_exceptions.exceptions;

public class ExceptionDemo {

    public static void main(String[] args) {
        String word = "Fucker";
        try {
            say(word);
        } catch (MyBadPhraseException e) {
            e.printStackTrace();
        }
    }

    private static void say(String word) throws MyBadPhraseException {
        if ("Fucker".equals(word))
            throw new MyBadPhraseException("You said bad word");
    }
}
