package lecture21_design_patterns.design.dependencyinversion;

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
