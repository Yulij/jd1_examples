package lecture15.serialization.graph;

import java.io.*;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class Car
 * <p>
 * Created by yslabko on 12/29/2017.
 */
@Data
@AllArgsConstructor
public class Car implements Serializable {
    private String id = "00-00";
    private int topSpeed = 100;

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
    }


    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }
}
