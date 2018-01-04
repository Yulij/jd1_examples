package lecture30.locale;


import java.util.Locale;

public class LocaleUtils {
    public static void printLocale(Locale locale) {
        System.out.println("Simple print: " + locale);
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Full language: " + locale.getDisplayLanguage());
        System.out.println("Country: " + locale.getCountry());
        System.out.println("Full country: " + locale.getDisplayCountry());
        System.out.println("Combination: " + locale.getDisplayName());
        System.out.println("===========================================");

    }
}
