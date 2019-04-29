package lecture24_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import lecture24_jdbc.db.ConnectionManager;
import lecture24_jdbc.db.DbManagerException;
import lecture24_jdbc.entity.Item;

/**
 * Class PreparedStatementDemo
 *
 * Created by yslabko on 08/01/2017.
 */
public class PreparedStatementDemo {
    static PreparedStatement ps;
    static Connection connection;
    private static final String insertItemQuery = "INSERT INTO ITEM (SUPPLIER, MODEL, PRICE) VALUES (?, ?, ?)";

    static void compilePreparedStatement(String query) throws SQLException {
        ps = connection.prepareStatement(query);
    }

    static void initConnection() {
        try {
            connection = ConnectionManager.getConnection();
        } catch (DbManagerException e) {
            System.out.println(e.getMessage());
        }
    }

    static int insertItem(PreparedStatement ps, Item item) throws SQLException {
        ps.setString(1, item.getSupplier());
        ps.setString(2, item.getModel());
        ps.setDouble(3, item.getPrice());
        return ps.executeUpdate();
    }

    public static void main(String[] args) {
        initConnection();
        try {
            compilePreparedStatement(insertItemQuery);
            int i = insertItem(ps, new Item("Makita", "HR 2470", 242.15));
            System.out.println(i);
            i = insertItem(ps, new Item("Makita", "HR 2455", 542.99));
            System.out.println(i);
        } catch (SQLException e) {
            System.out.println("Проблемы с добавлением данных в таблицу Item");
            e.printStackTrace();
        }
    }
}
