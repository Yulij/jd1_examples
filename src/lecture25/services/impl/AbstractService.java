package lecture25.services.impl;

import lecture25.db.ConnectionManager;

import java.sql.SQLException;

/**
 * Created by yslabko on 08/03/2017.
 */
public abstract class AbstractService {

    public void startTransaction() throws SQLException {
        ConnectionManager.getConnection().setAutoCommit(false);
    }

    public void commit() throws SQLException {
        ConnectionManager.getConnection().commit();
    }
}
