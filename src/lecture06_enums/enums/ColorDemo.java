package lecture06_enums.enums;

/**
 * Class ColorDemo
 *
 * Created by yslabko on 12/06/2017.
 */
public class ColorDemo {
    public static void main(String[] args) {
        Color red = Color.RED;
        System.out.println(red.name());
        System.out.println(red.getColor());
        Color color = Color.getByColor("Dark blue");
        switch (color) {
            case DARK_BLUE:
        }
        System.out.println(color);
    }
}
