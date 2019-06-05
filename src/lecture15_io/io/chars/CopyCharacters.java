package lecture15_io.io.chars;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("copyBytes.txt");
        FileWriter out = new FileWriter("outCopyBytes.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
    }
}
