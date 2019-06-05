package lecture07_inner.anonim.shape;

/**
 * Created by Yuli on 31.05.2015.
 */
public class EnumRunner {
    public static void main(String[] args) {
        int i = 4;
        Shape[] values = Shape.values();
        for (int j = 0; j < values.length; j++) {
            values[j].setShape(3, j--);
        }
        for (Shape f : values) {
            f.setShape(3, i--);
            System.out.println(f.name() + "-> " + f.getParameters() + " площадь= " + f.getSquare());
        }
    }
}
