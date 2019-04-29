package lecture24_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import lecture24_jdbc.db.ConnectionManager;
import lecture24_jdbc.db.DbManagerException;


/**
 * Class CallableStatementDemo
 *
 * Created by yslabko on 07/02/2017.
 */
public class CallableStatementDemo {
    public static final int OUTPUT_PARAMETER_INDEX = 2;
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
		cs.registerOutParameter(OUTPUT_PARAMETER_INDEX, Types.FLOAT);
		cs.execute();
		return cs.getDouble(OUTPUT_PARAMETER_INDEX);
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
