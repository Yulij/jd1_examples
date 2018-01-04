package lecture30.bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class BundleExample {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        printGreetingMessage(locale);
        printGreetingMessage(new Locale("ru", "RU"));
    }

    private static void printGreetingMessage(Locale locale) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("lecture30.MessagesBundle", locale);
        String greeting = resourceBundle.getString("greeting");
        System.out.println(greeting);
    }
}
