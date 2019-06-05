package lecture10_collections.set.cars;

import java.util.TreeSet;

/**
 * Class TreeSetCarDemo
 *
 * Created by yslabko on 12/15/2017.
 */
public class TreeSetCarDemo {
    public static void main(String[] args) {
        TreeSet<Car> cars = new TreeSet<>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Audi"));
        cars.add(new Car("Audi"));
        cars.lower(new Car("Porsche"));

        for (Car s : cars) {
            System.out.println(s);
        }
    }
}
