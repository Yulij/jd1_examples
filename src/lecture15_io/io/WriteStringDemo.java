package lecture15_io.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Class WriteStringDemo
 * <p>
 * Created by yslabko on 12/27/2017.
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("data.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw);
             InputStreamReader is = new InputStreamReader(System.in);
             BufferedReader bis = new BufferedReader(is)) {

            System.out.println("Введите Ваше имя и нажмите <Enter>:");
            String name = bis.readLine();
            bw.write("Привет, " + name);
        } catch (IOException e) {
            System.err.print("ошибка ввода " + e);
        }
    }
}
