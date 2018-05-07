package lecture21_design_patterns.design.openclosed;

/**
 * @author yslabko
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }
}
