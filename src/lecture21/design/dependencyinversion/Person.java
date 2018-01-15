package lecture21.design.dependencyinversion;

/**
 * @author yslabko
 */
public class Person {

    private Alarm alarm;

    public Person(Alarm alarm) {
        this.alarm = alarm;
    }

    public void wakeUp() {
        alarm.alarm();
    }
}
