package lecture15.serialization;

import java.util.Date;

public class SerializationExample {
	
    public static void main(String[] args) {
        final String fileName = "serialization.txt";
    	Car car = new Car("1234", "audi", new Date(), "1000$");
        System.out.println(car);
        SerializationUtil.doSerialization(car, fileName);
        Car recoveredCar = (Car)SerializationUtil.doDeserialization(fileName);
        System.out.println(recoveredCar);
      

    }

}
