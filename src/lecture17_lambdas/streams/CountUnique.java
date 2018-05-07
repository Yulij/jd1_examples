package lecture17_lambdas.streams;

import java.util.Arrays;
import java.util.List;

public class CountUnique {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("hello", "world", "hello", "ole");
        long count = stringList
                .stream()
                .filter(s -> s.length() > 3)
                .distinct()
                .count();
        System.out.println(count);
    }
}
