package lecture10_collections.set.cars;

import java.util.HashSet;

/**
 * Class HashSetOrderedCarDemo
 *
 * Created by yslabko on 12/15/2017.
 */
public class HashSetOrderedCarDemo {
    public static void main(String[] args) {
        System.out.println(new OrderedCar("sfg").hashCode());
        HashSet<OrderedCar> cars = new HashSet<>();
        cars.add(new OrderedCar("BMW"));
        cars.add(new OrderedCar("Audi"));
        cars.add(new OrderedCar("Porsche"));

        for (OrderedCar car : cars) {
            System.out.println(car);
        }
    }
}
