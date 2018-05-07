package lab6;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date " + calendar.getTime());
        
        calendar.add(Calendar.MONTH, 1);
        System.out.println("+1 month: " + calendar.getTime());

        calendar.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("set day to 1: " + calendar.getTime());

        calendar.add(Calendar.YEAR, -2);
        System.out.println("2 years ago: " + calendar.getTime());

        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 32);
        System.out.println("32 of march: " + calendar.getTime());

        calendar.clear(Calendar.MONTH);
        System.out.println("clear months: " + calendar.getTime());

        calendar.clear(Calendar.DAY_OF_WEEK);
        System.out.println("clear day of week: " + calendar.getTime());

        GregorianCalendar gregorianCalendar = (GregorianCalendar) calendar;
        System.out.println("is leap year: " + gregorianCalendar.isLeapYear(1900));

    }
}
