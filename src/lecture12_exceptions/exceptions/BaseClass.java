package lecture12_exceptions.exceptions;

import org.junit.runners.model.InitializationError;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BaseClass {

    public void calculate(int i) throws IOException, InitializationError {
        throw new IOException();
    }
}
