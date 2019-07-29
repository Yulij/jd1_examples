package lecture04.polimorphism;

public class Rectangle extends Shape {
    private double b = 1.0;

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }

    @Override
    public double getSquare() {
        return a*b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
