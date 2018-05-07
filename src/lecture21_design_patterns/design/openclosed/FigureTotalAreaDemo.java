package lecture21_design_patterns.design.openclosed;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yslabko
 */
public class FigureTotalAreaDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(3, 2);
        Square square = new Square(2);
        List<Shape> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(rectangle);
        figures.add(square);
        System.out.println(calculateTotalArea(figures));
    }

    public static double calculateTotalArea(List<Shape> figures) {
        double sum = 0;
        for (Shape figure : figures) {
            sum += figure.area();
        }
        return sum;
    }
}
