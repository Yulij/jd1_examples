package lecture21_design_patterns.design.factory;

import static lecture21_design_patterns.design.factory.FigureType.CIRCLE;
import static lecture21_design_patterns.design.factory.FigureType.TRIANGLE;

public class Main {
    public static void main(String[] args) {
        Figure figure = FigureFactory.getFigure(TRIANGLE);
        figure.draw();

        Figure newFigure = FigureFactory.getFigure(CIRCLE);
        newFigure.draw();
    }
}
