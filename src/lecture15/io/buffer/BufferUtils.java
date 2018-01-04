package lecture15.io.buffer;


import java.io.*;

public class BufferUtils {

    public static void useBufferForCopy() throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("copyBytes.txt"));
            out = new BufferedWriter(new FileWriter("outCopyBytes.txt"));
            String str;
            while ((str = in.readLine()) != null) {
            	System.out.println(str);
                out.write(str);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
