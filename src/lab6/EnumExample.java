package lab6;



public class EnumExample {

    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        System.out.println("day.name() = " + day.name());
        System.out.println("day.toString() = " + day.toString());
        System.out.println("day.ordinal() = " + day.ordinal());

        day.printCurrentDay();

        for (Day dayExample : Day.values()) {
            System.out.println("Values day example = " + dayExample);
        }


    }
}
