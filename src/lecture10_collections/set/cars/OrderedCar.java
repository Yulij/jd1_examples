package lecture10_collections.set.cars;

import lombok.*;

import java.util.Objects;

/**
 * Class OrderedCar
 *
 * Created by yslabko on 12/15/2017.
 */
@Getter
@AllArgsConstructor
public class OrderedCar implements Comparable<Object> {
    private String model = "UNKNOWN";
    private int year = 1895;

    public OrderedCar(String model) {
        this.model = model;
    }

    @Override
    public int compareTo(Object o) {
        return year - ((OrderedCar)o).year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderedCar that = (OrderedCar) o;
        return year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}