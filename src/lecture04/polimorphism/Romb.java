package lecture04.polimorphism;

public class Romb extends Shape {
    public Romb(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4*a;
        System.out.println(" This is Romb implementation!!!");
        return perimeter;
    }

    @Override
    public double getSquare() {
        return a*a;
    }
}
