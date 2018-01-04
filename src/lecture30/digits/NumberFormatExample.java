package lecture30.digits;


import java.text.ParseException;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String[] args) throws ParseException {
        Locale locale = new Locale("ru", "RU");
        String localizedRussianCurrency = NumberFormatUtils.printLocalizedCurrency(locale, 23500.500);
        System.out.println("Localized russian currency: " + localizedRussianCurrency);

        Locale usaLocale = Locale.US;
        String localizedUSACurrency = NumberFormatUtils.printLocalizedCurrency(usaLocale, 13500.500);
        System.out.println("Localized usa currency: " + localizedUSACurrency);

        double value = NumberFormatUtils.parseLocalizedCurrency(usaLocale, localizedUSACurrency);
        System.out.println("Parsed value: " + value);


    }
}
