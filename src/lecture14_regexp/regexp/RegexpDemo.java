package lecture14_regexp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class RegexpDemo
 *
 * Created by yslabko on 07/11/2017.
 */
public class RegexpDemo {


    public static void main(String[] args) {
//        boolean valid = validatePhoneNumber("+375 (29) 612-31-93");
//        valid = validateBound("Java9");
//        valid = validStart("  hello");
//        testBoundaryMatches();
//        testLookAheadPassword();
//        testLookAheadUnit();
        testNegativeLookAheadUnit();
//        testLookBehindUnit();
//        testNegativeLookBehindUnit();
//        testSpeedOfStartEndBoundaries();
    }

    private static void testMatcherGroup() {
        Pattern pattern = Pattern.compile("www\\.(\\w+)\\.by");
        Matcher matcher = pattern.matcher("   www.tut.by    ");
        matcher.find();
        System.out.println(matcher.group(1));
    }

    private static void testBoundaryMatches() {
//        Pattern pattern = Pattern.compile("^ball", Pattern.MULTILINE);
        Pattern pattern = Pattern.compile("(?m)^ball");
        Matcher matcher = pattern.matcher("ball bill ball\nball bell");
        while (matcher.find()) {
            System.out.format("Найден текст \"%s\" старт индекс %d индекс за концом %d.%n",
                    matcher.group(), matcher.start(), matcher.end());
        }
    }

    private static void testLookAheadPassword() {
        Pattern pattern = Pattern.compile("(?=.*[0-9].*[0-9])[0-9a-zA-Z]{8,12}");
        Matcher matcher = pattern.matcher("password p4ssword p4ssw0rd p45sword");
        while (matcher.find()) {
            System.out.format("Найден текст \"%s\" старт индекс %d индекс за концом %d.%n",
                    matcher.group(), matcher.start(), matcher.end());
        }

        System.out.println("p4ss0w0rd".matches("(?=.*[0-9].*[0-9])[0-9a-zA-Z]{8,12}"));
    }

    /**
     * Задача. Найти номера аудиторий у которых число заканчивается одним символом
     */
    private static void testLookAheadUnit() {
        Pattern pattern = Pattern.compile("\\b\\d+(?=[a-z]{1}\\b)");
        Matcher matcher = pattern.matcher("443ss d443 d234d 123d");
        while (matcher.find()) {
            System.out.format("Найден текст \"%s\" старт индекс %d индекс за концом %d.%n",
                    matcher.group(), matcher.start(), matcher.end());
        }
    }

    /**
     * Задача. Найти модель автомобиля не удовлетворяющая году выпуска
     */
    private static void testNegativeLookAheadUnit() {
        Pattern pattern = Pattern.compile("\\b[A-Z]\\w*\\b(?! (2016|2017))");
        Matcher matcher = pattern.matcher("A4 2001 M5 2017 Berlinetta 2010 Escalade 2015");
        while (matcher.find()) {
            System.out.format("Найден текст \"%s\" старт индекс %d индекс за концом %d.%n",
                    matcher.group(), matcher.start(), matcher.end());
        }
    }

    /**
     * Задача. Найти все вхождения букв номеров аудиторий, у которых номер состоит из одной буквы из двух чисел
     */
    private static void testLookBehindUnit() {
        Pattern pattern = Pattern.compile("(?<=\\d{2})[a-z]{1}\\b");
        Matcher matcher = pattern.matcher("443s 44df 23d 1d 13h");
        while (matcher.find()) {
            System.out.format("Найден текст \"%s\" старт индекс %d индекс за концом %d.%n",
                    matcher.group(), matcher.start(), matcher.end());
        }
    }

    /**
     * Задача. Заменить все вхождения \n на <br/>
     */
    private static void testNegativeLookBehindUnit() {
        String str = "Круто \n Ты лучший \n\n <tag>\n";
//        System.out.println(str.replaceAll("(?<!>)\\n", "<br/>"));
        System.out.println(str.replaceAll("([^>])\\n", "<br/>"));
    }

    private static void testG() {
        Pattern pattern = Pattern.compile("ball");
        Matcher matcher = pattern.matcher("ball ball ball");

        boolean found = false;

        while (matcher.find()) {
            System.out.format("Found the text \"%s\" at start index %d and ending at index %d.%n",
                    matcher.group(), matcher.start(), matcher.end());
            found = true;
        }
        if (!found) {
            System.out.format("No match found.%n");
        }
    }

    private static void testSpeedOfStartEndBoundaries() {
        int i = 10000;
        long start = System.nanoTime();
        for (int n = 0; n < i; n++)
            validateBeginEnd("BOb");
        System.out.printf("%-20s%14s%n", "validateBeginEnd:", formatDifference(System.nanoTime() - start));
        start = System.nanoTime();
        for (int n = 0; n < i; n++)
            validateBegin("BOb");
        System.out.printf("%-20s%14s%n", "validateBegin:", formatDifference(System.nanoTime() - start));
    }

    static String formatDifference(long diff) {
        return diff / 1000 + " mks";
    }

    private static boolean validateBegin(String value) {
        boolean valid = value.matches("^[?-??-?]+");
//        System.out.println("Value " + value + " is " +  (valid ? "valid ": "not valid ") + "group pattern");
        return valid;
    }

    private static boolean validateBeginEnd(String value) {
        boolean valid = value.matches("^[?-??-?]+$");
//        System.out.println("Value " + value + " is " +  (valid ? "valid ": "not valid ") + "group pattern");
        return valid;
    }

    private static boolean validateBound(String value) {
        boolean valid = value.matches("^(Java|java|java8|Java9)$");
        System.out.println("Value " + value + " is " + (valid ? "valid " : "not valid ") + "bound pattern");
        return valid;
    }

    private static boolean validStart(String value) {
        boolean valid = value.matches("(^|\\W)hello($|\\W)");
        System.out.println("Value " + value + " is " + (valid ? "valid " : "not valid ") + "bound pattern");
        return false;
    }

    private static boolean validatePhoneNumber(String phone) {
        boolean valid = phone.matches("\\+375\\s?\\((?:29|33|25|44)\\)\\s?(\\d{3}-?(\\d{2})-?(\\d{2}))");
        System.out.println("Value " + phone + " is " + (valid ? "valid " : "not valid ") + "phone pattern");
        return valid;
    }
}
