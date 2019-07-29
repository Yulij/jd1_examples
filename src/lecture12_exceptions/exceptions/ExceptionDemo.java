package lecture12_exceptions.exceptions;

import org.apache.log4j.Logger;

public class ExceptionDemo {

    private static final Logger LOGGER = Logger.getLogger(ExceptionDemo.class);

    public static void main(String[] args) {
        String word = "Fucker";
        try {
            say(word);
        } catch (MyBadPhraseException e) {
            e.printStackTrace();
            LOGGER.info("Start exception handling ---------------");
            LOGGER.error("Bad word:" + e.getWord(), e);
            LOGGER.info("End exception handling ---------------");
            System.out.println(e.getMessage());
        }

    }

    private static void say(String word) throws MyBadPhraseException {
        if ("Fucker".equals(word))
            throw new MyBadPhraseException("You said bad word", word);
    }
}
