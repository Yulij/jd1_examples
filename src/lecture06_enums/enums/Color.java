package lecture06_enums.enums;

/**
 * Class Color
 *
 * Created by yslabko on 12/06/2017.
 */
public enum Color {
    BLACK("Black color"),
    DARK_BLUE("Dark blue"),
    RED("Red color"),
    UNDEFINED("Undefined");

    private String color;

    static {
        System.out.println("Static");
    }

    Color(String color) {
        this.color = color;
        System.out.println("Constructor");
    }

    {
        System.out.println("Logic");
    }

    public String getColor() {
        return color;
    }

    public static Color getByColor(String color) {
        for (Color current : Color.values()) {
           if (current.color.equals(color)) {
                return current;
            }
        }

        return UNDEFINED;
//        throw new EnumConstantNotPresentException(Color.class, "No such enum with color = \"" + color + "\"");
    }
}
