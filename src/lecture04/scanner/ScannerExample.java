package lecture04.scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int inputNumber = ScannerUtil.inputNumber();
        if (inputNumber > 0) {
            System.out.println("Input number = " + inputNumber);
        } else {
            System.out.println("Invalid input number");
        }
    }
}
