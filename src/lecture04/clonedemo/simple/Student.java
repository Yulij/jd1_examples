package lecture04.clonedemo.simple;

/**
 * Class Student
 *
 * Created by yslabko on 12/01/2017.
 */
public class Student implements Cloneable {
/*включение интерфейса */
	private int id = 71;
	public int getId() {
	return id;
	}
	public void setId(int value) {
		id = value;
	}
	public Object clone() {//переопределение метода
 		try {
			return super.clone(); //вызов базового метода
		} catch (CloneNotSupportedException e) {
			throw new AssertionError("невозможно!");
		}
	}
}