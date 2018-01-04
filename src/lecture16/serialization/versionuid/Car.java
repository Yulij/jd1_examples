package lecture16.serialization.versionuid;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
//@AllArgsConstructor
public class Car implements Serializable {
    public static final long serialVersionUID = 1;

    private String id;
    private String brand;
    private double price;
    private transient Date productionDate;

    public Car(String id, String brand, double price, Date productionDate) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.productionDate = productionDate;
    }
}
