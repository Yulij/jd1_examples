package lecture12_exceptions.exceptions;

public class Task1 {

    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
