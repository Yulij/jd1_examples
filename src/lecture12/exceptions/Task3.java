package lecture12.exceptions;

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
        } catch (IllegalArgumentException e) {
            throw new MyException("It's not my fault!", e);
        }
    }

    public static void throw2() {
        throw new IllegalArgumentException();
    }
}
