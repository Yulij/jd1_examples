package lecture06_enums.inctanceof;

/**
 * Class Course
 *
 * Created by yslabko on 12/06/2017.
 */
public class Course {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
