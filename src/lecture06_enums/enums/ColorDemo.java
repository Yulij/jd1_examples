package lecture06_enums.enums;

/**
 * Class ColorDemo
 *
 * Created by yslabko on 12/06/2017.
 */
public class ColorDemo {
    public static void main(String[] args) {

        Color color = Color.getByColor("Black color");
        System.out.println(color.getColor());
    }
}
