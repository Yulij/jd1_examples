package lecture04.clonedemo.simple;

/**
 * Class StudentDemo
 *
 * Created by yslabko on 12/01/2017.
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(10);
        Student clonedStudent = (Student) student.clone();
        System.out.println(student);
        System.out.println(clonedStudent);
        System.out.println(clonedStudent==student);
        System.out.println(clonedStudent.equals(student));
    }
}
