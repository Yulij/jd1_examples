package lecture17_lambdas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageOdd {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 10, 3, 4, 5, 6, 15, 25);
        List<Integer> list = Stream.of(5, 10, 15).collect(Collectors.toList());
        long result = numbers.stream()
                .filter(element -> element % 2 != 0 && element % 5 == 0)
                .mapToLong(element -> element)
                .sum();
        System.out.println(result);
    }
}
