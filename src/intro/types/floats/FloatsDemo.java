package intro.types.floats;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class FloatsDemo
 * <p>
 * Created by yslabko on 11/24/2017.
 */
public class FloatsDemo {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        int i = Integer.MAX_VALUE;
        float f = (float) (i);
        System.out.println(i);
        System.out.println(f);
//        System.out.println(((byte)0b11110011));
        System.out.println(0.1 + 0.1 + 0.1);
        System.out.println(new BigDecimal(0.1).add(new BigDecimal(0.1)).add(new BigDecimal(0.1)));
        String text = getTextFromConsole();
        int count = calculateCount(getBooleanFromConsole(), text);
        System.out.println(count);
    }

    private static boolean getBooleanFromConsole() {
        System.out.print("Enter boolean text.");
        return Boolean.getBoolean(getTextFromConsole());
    }

    private static String getTextFromConsole() {
        System.out.println("Enter text");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        return text;
    }

    /**
     *
     * @param shouldRun
     * @param text
     * @return
     */
    private static int calculateCount(boolean shouldRun, String text) {
        if (text.equals("text")) {
            System.out.println(shouldRun);
            return 1;
        }

        return 0;
    }
}
