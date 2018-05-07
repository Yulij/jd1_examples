package lecture02;

public class Lab3_1 {
	public static void main(String[] args) {
		int s = 3045;
		int sec = s % 60;
		int m = (s - sec) / 60;
		int min = m % 60;
		int h = (m - min) / 60;
		System.out.println(h + " часов " + min + " минут " + sec
				+ " секунд");
	}
}
