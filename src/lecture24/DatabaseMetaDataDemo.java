package lecture24;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lecture24.db.ConnectionManager;
import lecture24.db.DbManagerException;

/**
 * Class DatabaseMetaDataDemo
 *
 * Created by yslabko on 07/01/2017.
 */
public class DatabaseMetaDataDemo {
    static DatabaseMetaData metadata = null;

    public static void main(String[] args) {
        ResultSet rs = null;
        try (Connection connection = ConnectionManager.getConnection()) {
            System.out.println("Tables:");
            metadata = connection.getMetaData();
            List tables = getTablesMetadata();
            tables.forEach(System.out::println);
            getColumnsMetadata(tables);

        } catch (SQLException e) {
            System.out.println("Проблемы с получением данных");
        } catch (DbManagerException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static List getTablesMetadata() throws SQLException {
        String table[] = {"TABLE"};
        ResultSet rs = null;
        rs = metadata.getTables(null, null, null, table);
        List tables = new ArrayList();
        while (rs.next()) {
            tables.add(rs.getString("TABLE_NAME"));
        }

        return tables;
    }


    private static void getColumnsMetadata(List<String> tables) throws SQLException {
        ResultSet rs = null;
        for (String actualTable : tables) {
            rs = metadata.getColumns(null, null, actualTable, null);
            System.out.println(actualTable.toUpperCase());
            while (rs.next()) {
                System.out.println(rs.getString("COLUMN_NAME") + " "
                        + rs.getString("TYPE_NAME") + " "
                        + rs.getString("COLUMN_SIZE"));
            }
        }
    }

}
