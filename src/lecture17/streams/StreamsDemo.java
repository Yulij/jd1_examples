package lecture17.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamsDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello from other thread"));
        thread.start();

        List<String> strings = Arrays.asList("a", "b", "c", "d");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        separator();
        for (String string : strings) {
            System.out.println(string);
        }
        separator();
        strings.sort((s1, s2) -> s1.compareTo(s2));
        strings.forEach(string -> System.out.println(string));
        separator();
        strings.sort(String::compareTo);
        strings.forEach(System.out::println);//передача метода по ссылке
        strings.forEach(string -> new String(string));//вызов конструктора с параметром
        strings.forEach(String::new);// вызов базового конструктора
        // отбираем первое четное больше 3 и возвращаем удвоенное значение
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 10);
        Integer integer = numbers.stream()
                .filter(element -> element % 2 == 0)
                .filter(element -> element > 3)
                .map(element -> element * 2)
                .findFirst().get();
        System.out.println(integer);
        separator();
        // отбираем все четные больше 3 и печатаем удвоенное значение
        numbers.stream()
                .filter(element -> element % 2 == 0)
                .filter(element -> element > 3)
                .map(element -> element * 2)
                .forEach(System.out::println);
        separator();
        // отбираем все четные больше 3 и удвоенное значение добавляем во множество
        Set<Integer> set = numbers.stream()
                .filter(element -> element % 2 == 0)
                .filter(element -> element > 3)
                .map(element -> element * 2)
                .collect(Collectors.toSet());
        System.out.println("Set size: " + set.size());

        separator();
        //
        integer = numbers
                .stream()
                .filter(element -> element % 2 == 0)
                .filter(element -> element > 3)
                .map(element -> element * 2)
                .reduce(1, (base, element) -> base * element);
        System.out.println(integer);

        separator();
        integer = numbers
                .stream()
                .filter(StreamsDemo::isEven)// используем метод с возвращаемым типом boolean
                .filter(StreamsDemo::isGt3)// используем метод с возвращаемым типом boolean
                .map(StreamsDemo::multiplyBy2)
                .findFirst().get();

        System.out.println(integer);
        separator();
        streamDemo();
    }

    static void separator() {
        System.out.println("---------------");
    }

    public static boolean isEven(int number) {
        System.out.println("isEven");
        return number % 2 == 0;
    }

    public static boolean isGt3(int number) {
        System.out.println("isGt3");
        return number > 3;
    }

    public static int multiplyBy2(int number) {
        System.out.println("multiplyBy2");
        return number * 2;
    }

    public void processWithFor(List<Integer> numbers) {
        for(Integer number : numbers) {
            if (number % 2 == 0 && number > 3) {
                System.out.println(number * 2);
                return;
            }
        }
    }

    private static void streamDemo() {
//        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.startsWith("a");
//                })
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .forEach(s -> System.out.println("forEach: " + s));

        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.startsWith("a");
//                })
                .filter(StreamsDemo::isStartWithA)
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));
    }

    private static boolean isStartWithA(String s) {
        System.out.println("filter: " + s);
        return s.startsWith("a");
    }

}
