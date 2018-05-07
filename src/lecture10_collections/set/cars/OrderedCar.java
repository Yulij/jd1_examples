package lecture10_collections.set.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Class OrderedCar
 *
 * Created by yslabko on 12/15/2017.
 */
@AllArgsConstructor
public class OrderedCar implements Comparable<OrderedCar> {
    @Getter
    private String model = "UNKNOWN";

    @Override
    public int compareTo(OrderedCar o) {
        return model.length() - o.getModel().length();
    }
}