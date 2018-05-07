package lecture21_design_patterns.design.dependencyinversion;

/**
 * @author yslabko
 */
public class AlarmDemo {

    public static void main(String[] args) {
        Clock clock = new Clock();
        Mobile mobile = new Mobile();
        Person person = new Person(clock);
        person.wakeUp();
    }
}
