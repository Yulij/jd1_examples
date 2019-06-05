package lecture10_collections.set.cars;

import java.util.HashSet;

/**
 * Class HashSetOrderedCarDemo
 *
 * Created by yslabko on 12/15/2017.
 */
public class HashSetOrderedCarDemo {
    public static void main(String[] args) {
        HashSet<OrderedCar> cars = new HashSet<>();
        cars.add(new OrderedCar("BMW"));
        cars.add(new OrderedCar("Audi"));
        cars.add(new OrderedCar("Porsche"));

        for (OrderedCar car : cars) {
            System.out.printf("Car: %25s hashCode:%d%n",car, car.hashCode());
        }
    }
    HashSet consolidationIntHashSet(HashSet<Integer> hs1,HashSet<Integer> hs2)
    {
        HashSet<Integer> int3 = new HashSet<>();
        int3.addAll(hs1);
        int3.addAll(hs2);
        return int3;
    }
}
