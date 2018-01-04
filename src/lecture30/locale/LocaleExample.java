package lecture30.locale;

import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        LocaleUtils.printLocale(locale);
        Locale defaultLocale = Locale.getDefault();
        LocaleUtils.printLocale(defaultLocale);
    }

}
