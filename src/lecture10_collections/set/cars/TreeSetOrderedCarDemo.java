package lecture10_collections.set.cars;

import java.util.TreeSet;

/**
 * Class TreeSetOrderedCarDemo
 *
 * Created by yslabko on 12/15/2017.
 */
public class TreeSetOrderedCarDemo {
    public static void main(String[] args) {
        TreeSet<OrderedCar> cars = new TreeSet<>();
        cars.add(new OrderedCar("BMW", 1900));
        cars.add(new OrderedCar("Audi", 2000));
        cars.add(new OrderedCar("Audi"));
        cars.add(new OrderedCar("Porsche", 38654));

        for (OrderedCar car : cars) {
            System.out.println(car.getYear());
        }
    }
}
