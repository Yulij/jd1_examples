package lecture21_design_patterns.design.factory;

public class Circle implements Figure {
    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }
}
