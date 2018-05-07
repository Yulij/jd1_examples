package lecture15_io.io.bytes;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("copyBytes.txt");
            out = new FileOutputStream("outCopyBytes.txt");

            int c;
            while ((c = in.read()) != -1) {
            	System.out.println(c);
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
