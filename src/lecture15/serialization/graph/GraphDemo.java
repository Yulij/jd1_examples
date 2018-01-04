package lecture15.serialization.graph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Class GraphDemo
 *
 * Created by yslabko on 12/29/2017.
 */
public class GraphDemo {

    public static void main(String[] args) {
        final String fileName = "graph.dat";

        Car car1 = new Car("00-01", 259);
        Car car2 = new Car("11-11", 258);
        Car car3 = new Car("55-55", 257);

        DragResults dragResults1 = new DragResults(1, car1, car2, 1);
        DragResults dragResults2 = new DragResults(2, car1, car3, 0);
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            dragResults1.setId(3);
            objectOutputStream.reset();
            objectOutputStream.writeObject(dragResults1);
            objectOutputStream.writeObject(dragResults2);
            objectOutputStream.writeObject(dragResults1);
            objectOutputStream.close();

            FileInputStream inputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            System.out.println(objectInputStream.readObject());
            System.out.println(objectInputStream.readObject());
            System.out.println(objectInputStream.readObject());
            objectInputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File didn't created");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error occurred during serialization");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
