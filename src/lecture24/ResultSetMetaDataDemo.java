package lecture24;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import lecture24.db.ConnectionManager;
import lecture24.db.DbManagerException;


/**
 * Class ResultSetMetaDataDemo
 *
 * Created by yslabko on 07/01/2017.
 */
public class ResultSetMetaDataDemo {

    public static void main(String[] args) {
        ResultSet rs= null;

        try (Connection connection = ConnectionManager.getConnection();
            Statement st = connection.createStatement()) {
            rs = st.executeQuery("SELECT ITEM_ID, SUPPLIER, MODEL, PRICE FROM ITEM");
            System.out.printf("Items:%nId\tSupplier\t\tModel\t\tPrice %n");
            while (rs.next()) {
                System.out.printf("%-4d %-10s %-15s %-6.2f%n", rs.getLong(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
            }
            ResultSetMetaData md = rs.getMetaData();
            System.out.println("Total row count: " + md.getColumnCount());
        } catch (SQLException e) {
            System.out.println("Проблемы с получением данных");
            e.printStackTrace();
        } catch (DbManagerException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs!=null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
