package lecture16_serialization.serialization;

import java.io.Serializable;
import java.util.Date;

public class Car implements Serializable {
    private String id;
    private String brand;
    private static String price;
    private transient Date productionDate;

    public Car(String id, String brand, Date productionDate, String price) {
        this.brand = brand;
        this.id = id;
        this.productionDate = productionDate;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static String getPrice() {
        return price;
    }

    public static void setPrice(String price) {
        Car.price = price;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Car " + "(id = '" + id + '\'' +
                ", brand = '" + brand + '\'' + ", productionDate = " + productionDate +
                ')' + " price = " + price;
    }
}
