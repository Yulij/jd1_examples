package lecture04.polimorphism;

import static java.lang.Math.PI;

public class Circle extends Shape {

    public Circle(double r) {
        a = r;
    }

    @Override
    public double getPerimeter() {
        return 2* PI * a;
    }

    @Override
    public double getSquare() {
        return PI * a * a;
    }
}
