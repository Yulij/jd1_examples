package lecture24_jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class Item
 *
 * Created by yslabko on 07/01/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private long id;
    private String supplier;
    private String model;
    private Double price;
    private Double pr;

    public Item(String supplier, String model, Double price) {
        this.supplier = supplier;
        this.model = model;
        this.price = price;
    }
}
