package lecture24_jdbc.db;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Class ConnectionManager
 *
 * Created by yslabko on 07/01/2017.
 */
public class ConnectionManager {
    private static ResourceBundle rb = null;
    private static volatile boolean isDriverLoaded = false;
    static ThreadLocal<Connection> connection = new ThreadLocal<>();
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;

    static {
        ResourceBundle rb = ResourceBundle.getBundle("lecture24_jdbc/db");
        if (rb == null) {
            URL = "UNDEFINED";
            USER = "UNDEFINED";
            PASSWORD = "UNDEFINED";
            System.out.println("Бандл для db не был инициализирован");
        } else {
            URL = rb.getString("url");
            USER = rb.getString("user");
            PASSWORD = rb.getString("password");
            try {
                Class.forName(rb.getString("driver"));
                isDriverLoaded = true;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public static Connection getConnection() throws DbManagerException {
        if (!isDriverLoaded) {
            throw new DbManagerException("Драйвер не был загружен");
        }

        try {
            if (connection.get() == null) {
                connection.set(DriverManager.getConnection(URL, USER, PASSWORD));
            }
             return connection.get();
        } catch (SQLException e) {
            throw new DbManagerException("Ошибка получения соединения " +  e.getMessage());
        }
    }

    public static void main(String argv[]) {
        try {
            String line;
            Process p = Runtime.getRuntime().exec("mysql -u root -pyuli db_shop < C:/Users/Asus/Dropbox/PVT private/JD1/Projects/LectionExamples/resources/lecture24_jdbc/scripts.sql");
            BufferedReader input =
                    new BufferedReader
                            (new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            input.close();
        }
        catch (Exception err) {
            err.printStackTrace();
        }
    }
}