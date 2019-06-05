package lecture17_lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AverageOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 10, 3, 4, 5, 6, 15, 25);
        Integer result = Arrays.asList(5, 1, 10, 3, 4, 5, 6, 15, 25)
                .stream()
                .filter(element -> element % 2 != 0)
                .filter(element -> element % 5 == 0)
                .mapToInt(element -> element)
                .sum();
        System.out.println(result);
    }
}
