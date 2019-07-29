package lecture04.polimorphism;

public class Demo {

    public static void main(String[] args) {
        printShape(new Circle(5.0));

        Rectangle rectangle = new Rectangle();
        printShape(rectangle);
        Shape shape = new Romb(23);
        printShape(shape);

    }

    private static void printShape(Shape shape) {
        if (shape instanceof Rectangle)
            System.out.print("Rectangle b= " + ((Rectangle)shape).getB());
        System.out.println("Perimeter = " + shape.getPerimeter() );
    }
}
