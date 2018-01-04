package lecture06.inctanceof;

/**
 * Class CourseDemo
 *
 * Created by yslabko on 12/06/2017.
 */
public class CourseDemo {
    public static void main(String[] args) {
        Course course = new Course();
        BaseCourse baseCourse = new BaseCourse();
        FreeCourse freeCourse = new FreeCourse();
        OptionalCourse optionalCourse = new OptionalCourse();
        doLogic(course);
        doLogic(baseCourse);
        doLogic(freeCourse);
        doLogic(optionalCourse);
    }

    static void doLogic(Course c) {
        if (c instanceof Course) {
            System.out.println("#### ->" + (c instanceof Course));
        }
        if (c instanceof BaseCourse) {
            System.out.println("c is instance of BaseCourse or FreeCourse: " + c);
        } else if (c instanceof OptionalCourse) {
            System.out.println("c is instance of OptionalCourse: " + c);
        } else {
            System.out.println("c is instance of Course: " + c);
        }
    }
}
