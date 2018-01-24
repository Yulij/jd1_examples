package lecture24;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import lecture24.db.ConnectionManager;
import lecture24.db.DbManagerException;


/**
 * Class CallableStatementDemo
 *
 * Created by yslabko on 07/02/2017.
 */
public class CallableStatementDemo {
    static CallableStatement cs;
    static Connection connection;
    private static final String insertItemQuery = "{call getItemPrice(?,?)}";

    static void compileCallableStatement(String query) throws SQLException {
        cs = connection.prepareCall(query);

    }

    static void initConnection() {
        try {
            connection = ConnectionManager.getConnection();
        } catch (DbManagerException e) {
            System.out.println(e.getMessage());
        }
    }

    static Double getItemPrice(long id) throws SQLException {
        cs.setLong(1, id);
		//регистрация выходящего параметра
		cs.registerOutParameter(2, Types.DECIMAL);
		cs.execute();
		return cs.getDouble(2);
    }

    public static void main(String[] args) {
        initConnection();
        try {
            compileCallableStatement(insertItemQuery);
            System.out.println("Item with Id:" + 3 + " is " + getItemPrice(3L));
        } catch (SQLException e) {
            System.out.println("Проблемы с получением данных из таблицы Item");
            e.printStackTrace();
        }
    }
}
