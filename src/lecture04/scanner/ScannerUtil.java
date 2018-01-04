package lecture04.scanner;

import java.util.Scanner;

public class ScannerUtil {
	public static int inputNumber() {
		int number = 0;
		System.out.println("Enter number greater then zero:");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			number = scanner.nextInt();
		}
		scanner.close();
		return number;
	}
}
