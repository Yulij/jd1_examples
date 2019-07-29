package lecture16_serialization.serialization;

import java.util.Date;

public class SerializationExample {
	
    public static void main(String[] args) {
        final String fileName = "serialization.txt";
//        Car.setPrice("0 $");
//        Car car = new Car("1234", "audi", "audi ag", new Date(), new Company("Audi"));
//        System.out.println(car);
//        SerializationUtil.doSerialization(car, fileName);
        Car recoveredCar = (Car)SerializationUtil.doDeserialization(fileName);
        System.out.println(recoveredCar);
      

    }

}
