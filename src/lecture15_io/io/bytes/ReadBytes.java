package lecture15_io.io.bytes;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Class ReadBytes
 *
 * Created by yslabko on 06/06/2018.
 */
public class ReadBytes {
    public static void main(String[] args) throws IOException {

        byte[] bytes = {1, -1, 0};
        ByteArrayInputStream in = new ByteArrayInputStream(bytes);
        int readedInt = in.read(); // readedInt = 1
        System.out.println("first element read is: " + readedInt);
        readedInt = in.read();
        // readedInt = 255. Однако
        // как получить значение -1
        System.out.println("second element read is: " + readedInt);
        readedInt = in.read(); // readedInt = 0
        System.out.println("third element read is: " + readedInt);
        System.out.println(in.read());
        in.close();
    }
}