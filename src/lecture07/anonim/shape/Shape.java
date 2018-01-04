package lecture07.anonim.shape;

/**
 * Created by Yuli on 31.05.2015.
 */
enum Shape {
    RECTANGLE,
    SQUARE,
    TRIANGLE {// анонимный класс
        // версия для TRIANGLE
        public double getSquare() {
            return a * b / 2;
        }
    };

    public double a, b;
    public void setShape(double a, double b) {
        if ((a <= 0 || b <= 0) || a != b && this == SQUARE)
            throw new IllegalArgumentException();
        else
            this.a = a;
        this.b = b;
    }
    // версия для RECTANGLE и SQUARE
    public double getSquare() {
        return a * b;
    }


    public String getParameters() {
        return "a=" + a + ", b=" + b;
    }
}


