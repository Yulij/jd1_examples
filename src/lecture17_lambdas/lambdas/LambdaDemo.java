package lecture17_lambdas.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;

public class LambdaDemo {
    public static final String SEPARATOR = "------------------";

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25, 40, 999, 555);
        printByLambda(list);
        printByLambdaWithParameter(list);
        printByMethodReferences(list);

        Integer[] array = list.toArray(new Integer[list.size()]);

        Arrays.sort(array, (a, b)->Integer.compare(b,a));

        printByLambda(Arrays.stream(array).collect(Collectors.toList()));
    }

    private static void printByLambda(List<Integer> list) {
        list.forEach(i-> System.out.println(i));
        System.out.println(SEPARATOR);
    }

    private static void printByLambdaWithParameter(List<Integer> list) {
        list.forEach((Integer i)->{
            System.out.println(i);
        });
        System.out.println(SEPARATOR);
    }

    private static void printByMethodReferences(List<Integer> list) {
        list.forEach(System.out::println);
        System.out.println(SEPARATOR);
    }



    @Data
    @AllArgsConstructor
    public static class A {
        private long Id;
        private String name;
    }

}
