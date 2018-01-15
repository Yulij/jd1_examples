package lecture21.design.factory;

public class FigureFactory {

    public static Figure getFigure(FigureType figureType) {
        switch (figureType) {
            case CIRCLE: return new Circle();
            case TRIANGLE: return new Triangle();
        }
        return figureType.createFigure();
    }
}
