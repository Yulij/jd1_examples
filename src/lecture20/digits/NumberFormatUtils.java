package lecture20.digits;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatUtils {
    public static String printLocalizedCurrency(Locale locale, double digit) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        return numberFormat.format(digit);

    }

    public static double parseLocalizedCurrency(Locale locale, String localizedCurrency) throws ParseException {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        Number number = numberFormat.parse(localizedCurrency);
        return number.doubleValue();
    }

}
