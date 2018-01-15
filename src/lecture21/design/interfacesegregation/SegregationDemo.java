package lecture21.design.interfacesegregation;

/**
 * @author yslabko
 */
public class SegregationDemo {

    public static void main(String[] args) {
        RadioClock radioClock = new RadioClock();

        Programmer programmer = new Programmer(radioClock);
        programmer.listenToRadio();

        Student student = new Student(radioClock);
        student.wakeUp();
    }
}
