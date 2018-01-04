package lecture10.set.cars;

import java.util.TreeSet;

/**
 * Class TreeSetOrderedCarDemo
 *
 * Created by yslabko on 12/15/2017.
 */
public class TreeSetOrderedCarDemo {
    public static void main(String[] args) {
        TreeSet<OrderedCar> cars = new TreeSet<>();
        cars.add(new OrderedCar("BMW"));
        cars.add(new OrderedCar("Audi"));
        cars.add(new OrderedCar("Porsche"));

        for (OrderedCar car : cars) {
            System.out.println(car);
        }
    }
}
