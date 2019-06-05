package lecture16_serialization.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Data
public class Car implements Serializable {
    private String id;
    private String brand;
    private String newBrand;
    private static String price = "59 999$";
    private transient Date productionDate;
//    private transient Company company;

    @Override
    public String toString() {
        return "Car " + "(id = '" + id + '\'' +
                ", brand = '" + brand + '\'' + ", productionDate = " + productionDate +
                ')' + " price = " + price
                /*+ "  Company:" + company*/;
    }

    public static String getPrice() {
        return price;
    }

    public static void setPrice(String price) {
        Car.price = price;
    }
}
