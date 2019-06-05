package lecture10_collections.set.cars;

import java.util.LinkedHashSet;

/**
 * Class LinkedSetOrderedCarDemo
 *
 * Created by yslabko on 12/15/2017.
 */
public class LinkedSetOrderedCarDemo {
    public static void main(String[] args) {
        LinkedHashSet<OrderedCar> cars = new LinkedHashSet<>();
        cars.add(new OrderedCar("BMW"));
        cars.add(new OrderedCar("BMW"));
        cars.add(new OrderedCar("Audi"));
        cars.add(new OrderedCar("Porsche"));
        cars.add(new OrderedCar("Audi"));
        cars.add(new OrderedCar("Porsche"));

        for (OrderedCar car : cars) {
            System.out.println(car);
        }
    }
}
