package lecture21.design.interfacesegregation;

/**
 * @author yslabko
 */
public class Student implements Alarm {

    private Alarm alarm;

    public Student(Alarm alarm) {
        this.alarm = alarm;
    }

    public void wakeUp() {
        alarm.alarm();
    }

    @Override
    public void alarm() {
        alarm.alarm();
    }
}
