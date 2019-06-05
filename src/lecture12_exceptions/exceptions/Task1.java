package lecture12_exceptions.exceptions;

import org.junit.runners.model.InitializationError;

import java.io.IOException;

public class Task1 {

    public static void main(String[] args) throws IOException, InitializationError {
        BaseClass baseClass = new BaseClass();
        baseClass.calculate(10);
        String s = null;
        try {
            s.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
