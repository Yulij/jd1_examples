package lecture10.set.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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