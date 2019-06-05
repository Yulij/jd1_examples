package lecture12_exceptions.exceptions;

import java.io.IOException;

public class Task3 {

    public static void main(String[] args) {
        try {
            throw1();
        } catch (MyException | IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Всегда выполняется");
        }
        System.out.println("Continue");
    }

    public static void throw1() {
        try {
            throw2();
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IllegalArgumentException e) {
            throw new MyException("It's not my fault!", e);
        }
    }

    public static void throw2() {
        throw new IllegalArgumentException();
    }
}
