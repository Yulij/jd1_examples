package lecture21_design_patterns.design.openclosed;

/**
 * @author yslabko
 */
public class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return getSide() * getSide();
    }
}
