package lecture25.dao;

import java.io.Serializable;
import java.sql.SQLException;

/**
 * Class DAO
 *
 * Created by yslabko on 07/02/2017.
 */
public interface DAO<T> {
    T save(T t) throws SQLException;
    T get(Serializable id) throws SQLException;
    void update(T t) throws SQLException;
    int delete(Serializable id) throws SQLException;
}
