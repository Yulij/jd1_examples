package lecture17_lambdas.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class PersonCarDemo
 * <p>
 * Created by yslabko on 07/14/2017.
 */
public class PersonCarDemo {
    public static void main(String[] args) {
        personDemo();
//        collectDemo();
    }

    private static void personDemo() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Petr", "Kuk", 23));
        list.add(new Person("Tom", "Dig", 39));
        list.add(new Person("Yn", "Bon", 29));
        list.add(new Person("Anton", "Reut", 29));
        list.add(new Person("Von", "Black", 19));

        list.stream()
                .sorted(new PersonAgeComparator())
                .forEach((Person p) -> {
                    System.out.println(p.getClass() + " " + p.hashCode() + " " + p);
                });
        //вывод не измененного списка
        list.forEach((element) -> System.out.println(element));
        list.forEach(System.out::println);

        StreamsDemo.separator();

        Stream.of("A1", "B2", "C3")
        .reduce((s1, s2)-> s1.compareTo(s2) > 1 ? s1 : s2)
        .ifPresent(System.out::println);
    }

    private static boolean filterByAge(Person person) {
        System.out.println("Filter  -> person " + person);
        return person.getAge() > 20;
    }

    @Getter
    @AllArgsConstructor
    static class Car {
        String model;
        int hp;

        @Override
        public String toString() {
            return model;
        }
    }

    public static void collectDemo() {
        StreamsDemo.separator();
        StreamsDemo.separator();

        List<Car> cars =
                Arrays.asList(
                        new Car("A6RS", 460),
                        new Car("M6", 460),
                        new Car("Corvet", 460),
                        new Car("GTR", 480));

        IntSummaryStatistics hpSum = cars.stream()
                .collect(Collectors.summarizingInt(car->car.hp));
        System.out.println("Hp summary: " + hpSum);
        StreamsDemo.separator();
        // Свой сборщик, который возьмет у каждой машины модель и
        // через разделитель \\ соберет строку
        Collector<Car, StringJoiner, String> carModelCollector = Collector.of(
                () -> new StringJoiner(" || "),                       // Поставщик
                (joiner, car) -> joiner.add(car.model.toUpperCase()), // Аккумулятор
                StringJoiner::merge,                                  // Объединитель
                StringJoiner::toString                                // Завершитель
        );

        String models = cars
                .stream()
                .collect(carModelCollector);

        System.out.println(models);
        StreamsDemo.separator();

        //Преобразование в мапку
        Map<Integer, String> fastCars = cars.stream()
                .collect(Collectors.toMap(
                        car -> car.hp,
                        car -> car.model,
                        (car1, car2) -> car1 + ";" + car2));
        System.out.println(fastCars);
        StreamsDemo.separator();
    }

    public static boolean isAgeValid(Person person) {
        System.out.println("IsAgeValid -> person " + person);
        return person.getAge() > 19;
    }
}
