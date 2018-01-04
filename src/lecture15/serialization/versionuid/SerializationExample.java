package lecture15.serialization.versionuid;

import java.util.Date;

import lecture15.serialization.SerializationUtil;

public class SerializationExample {
    static final String fileName = "serialVersionUID.txt";
	
    public static void main(String[] args) {
//        serializeClass();
        deserializeClass();
    }

    private static void deserializeClass() {
        Car recoveredCar = (Car) SerializationUtil.doDeserialization(fileName);
        System.out.println(recoveredCar);
    }

    private static void serializeClass() {
        Car car = new Car("1234", "Audi", 120000.99, new Date());
        System.out.println(car);
        SerializationUtil.doSerialization(car, fileName);
    }
}
