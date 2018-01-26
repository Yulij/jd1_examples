package lecture25.dao;

import java.sql.SQLException;
import java.util.List;
import lecture25.entities.Item;

/**
 * Class ItemDao
 *
 * Created by yslabko on 07/02/2017.
 */
public interface ItemDao extends DAO<Item>{
    Item getItemByModelAndSupplier(String model, String supplier) throws SQLException;
    List<Item> getAll() throws SQLException;
}
