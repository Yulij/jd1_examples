package lecture17_lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerConcatenation {

    /**
     * Вывести целые в виде строки без пробелов
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 10, 3, 4, 5, 6, 15, 25);

        String result = list.stream()
                .map(number -> number.toString())
//                .reduce("", (base, element) -> base + element);
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
