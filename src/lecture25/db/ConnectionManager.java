package lecture25.db;

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
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;
    private static Connection con;

    static {
        ResourceBundle rb = ResourceBundle.getBundle("lecture25/db");
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
            if (con == null) {

                con = DriverManager.getConnection(URL, USER, PASSWORD);
            }
            return con;
        } catch (SQLException e) {
            throw new DbManagerException("Ошибка получения соединения " +  e.getMessage());
        }
    }
}
