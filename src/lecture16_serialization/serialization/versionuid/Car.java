package lecture16_serialization.serialization.versionuid;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
//@AllArgsConstructor
public class Car implements Serializable {

    private static final long serialVersionUID = -2813913617715203914L;
    private String id;
//    private Integer idNew;
    private String brand;
    private transient Date productionDate;

    public Car(String id, String brand, double price, Date productionDate) {
        this.id = id;
        this.brand = brand;
        this.productionDate = productionDate;
    }
}
