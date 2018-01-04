package lecture30.dates;


import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatExample {
    public static void main(String[] args) throws ParseException {
        Locale locale = Locale.US;
        Date currentDate = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, locale);
        System.out.println(df.format(currentDate));

        DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT,Locale.US);
        Date parseDate = df2.parse("10/15/10");
        System.out.println(parseDate);

    }
}





