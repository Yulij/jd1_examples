package lecture15_io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Class FileDemo
 *
 * Created by yslabko on 06/06/2018.
 */
public class FileDemo {
    public static void main(String[] args) {
        fileInfo();
        directoryInfo();
        rootInfo();
    }

    private static void rootInfo() {
        File root = File.listRoots()[0];
        System.out.printf("\n%s %,d из %,d свободно.", root.getPath(), root.getUsableSpace(), root.getTotalSpace());
    }

    private static void directoryInfo() {
        File dir = new File("src");
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("каталог " + dir.getName() + " существует");
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                Date date = new Date(files[i].lastModified());
                System.out.print("\n" + files[i].getPath() + " \t| " + files[i].length() + "\t| " + date.toString());
            }
        }
    }

    private static void fileInfo() {
        File fp = new File("src" + File.separator + "lecture15_io" +
                File.separator + "file" + File.separator + "FileDemo.java");
        if (fp.exists()) {
            if (fp.isFile()) {
                System.out.println("Путь к файлу:\t" + fp.getPath());
                System.out.println("Абсолютный путь:\t" + fp.getAbsolutePath());
                System.out.println("Размер файла:\t" + fp.length());
                System.out.println("Последняя модификация:\t" + new Date(fp.lastModified()));
                System.out.println("Файл доступен для чтения:\t" + fp.canRead());
                System.out.println("Файл доступен для записи:\t" + fp.canWrite());
//                System.out.println("Файл удален:\t" + fp.delete());
            }
        } else {
            System.out.println("файл " + fp.getName() + " не существует");
        }
        try {
            if (fp.createNewFile())
                System.out.println("Файл " + fp.getName() + " создан");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}