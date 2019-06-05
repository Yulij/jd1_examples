package lecture02;

public class Lab3_4 {
	public int i = 111;
	public static void main(String[] args) {
		int dayNumber = 13;
		switch (dayNumber) {
		case 1:
			System.out.println("Понедельник");
		case 2:
			System.out.println("Вторник");
			break;
		case 3:
			System.out.println("Среда");
			break;
		case 4:
			System.out.println("Четверг");
			break;
		case 5:
			System.out.println("Пятница");
			break;
		case 6:
			System.out.println("Суббота");
			break;
		case 7:
			System.out.println("Воскресенье");
			break;
		default:
			System.out.println("День не определен");
		}
	}
}
