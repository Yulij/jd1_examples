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
            System.out.println("Items:\nId\tSupplier\t\tModel\t\tPrice");
            while (rs.next()) {
                System.out.println(rs.getLong(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getDouble(4));
            }
            ResultSetMetaData md = rs.getMetaData();
            System.out.println("Total row count: " + md.getColumnCount());
        } catch (SQLException e) {
            System.out.println("Проблемы с получением данных");;
        } catch (DbManagerException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
