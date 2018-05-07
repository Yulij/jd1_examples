package lecture25.dao.impl;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lecture25.db.ConnectionManager;
import lecture25.entities.Item;
import lecture25.dao.ItemDao;

/**
 * Class ItemDaoImpl
 *
 * Created by yslabko on 07/02/2017.
 */
public class ItemDaoImpl implements ItemDao {
    private static volatile ItemDao INSTANCE = null;
    private static final String saveItemQuery = "INSERT INTO ITEM (SUPPLIER, MODEL, PRICE) VALUES (?, ?, ?)";
    private static final String updateItemQuery = "UPDATE ITEM SET SUPPLIER=?, MODEL=?, PRICE=? WHERE ITEM_ID=?";
    private static final String getItemQuery = "SELECT * FROM ITEM WHERE ITEM_ID=?";
    private static final String getAllItemQuery = "SELECT * FROM ITEM";
    private static final String getItemByModelAndSupplierQuery = "SELECT * FROM ITEM WHERE MODEL=? AND SUPPLIER=?";
    private static final String deleteItemQuery = "DELETE FROM ITEM WHERE ITEM_ID=?";

    private PreparedStatement psSave;
    private PreparedStatement psUpdate;
    private PreparedStatement psGet;
    private PreparedStatement psGetByModelAndSupplier;
    private PreparedStatement psGetAll;
    private PreparedStatement psDelete;

    {
        try {
            psSave = ConnectionManager.getConnection().prepareStatement(saveItemQuery, Statement.RETURN_GENERATED_KEYS);
            psUpdate = ConnectionManager.getConnection().prepareStatement(updateItemQuery);
            psGet = ConnectionManager.getConnection().prepareStatement(getItemQuery);
            psGetByModelAndSupplier = ConnectionManager.getConnection().prepareStatement(getItemByModelAndSupplierQuery);
            psGetAll = ConnectionManager.getConnection().prepareStatement(getAllItemQuery);
            psDelete = ConnectionManager.getConnection().prepareStatement(deleteItemQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ItemDaoImpl() {
    }

    public static ItemDao getInstance() {
        ItemDao itemDao = INSTANCE;
        if (itemDao == null) {
            synchronized (ItemDaoImpl.class) {
                itemDao = INSTANCE;
                if (itemDao == null) {
                    INSTANCE = itemDao = new ItemDaoImpl();
                }
            }
        }

        return itemDao;
    }

    @Override
    public Item save(Item item) throws SQLException {
        psSave.setString(1, item.getSupplier());
        psSave.setString(2, item.getModel());
        psSave.setDouble(3, item.getPrice());
        psSave.executeUpdate();
        ResultSet rs = psSave.getGeneratedKeys();
        if (rs.next()) {
            item.setId(rs.getLong(1));
        }
        close(rs);
        return item;
    }

    void method(int a, double d, char ... chars) {}

    @Override
    public Item get(Serializable id) throws SQLException {
        psGet.setLong(1, (long)id);
        psGet.executeQuery();
        ResultSet rs = psGet.getResultSet();
        if (rs.next()) {
            Item item = new Item();
            item.setId(rs.getLong(1));
            item.setSupplier(rs.getString(2));
            item.setModel(rs.getString(3));
            item.setPrice(rs.getDouble(4));
            return item;
        }
        close(rs);

        return null;
    }

    @Override
    public void update(Item item) throws SQLException {
        psUpdate.setLong(4, item.getId());
        psUpdate.setString(1, item.getSupplier());
        psUpdate.setString(2, item.getModel());
        psUpdate.setDouble(3, item.getPrice());
        psUpdate.executeUpdate();
    }

    @Override
    public int delete(Serializable id) throws SQLException {
        psDelete.setLong(1, (long)id);
        return psDelete.executeUpdate();
    }

    @Override
    public Item getItemByModelAndSupplier(String model, String supplier) throws SQLException {
        psGetByModelAndSupplier.setString(1, model);
        psGetByModelAndSupplier.setString(2, supplier);
        psGetByModelAndSupplier.execute();
        ResultSet rs = psGetByModelAndSupplier.getResultSet();
        Item item = new Item();
        while (rs.next()) {
            item.setId(rs.getLong(1));
            item.setSupplier(rs.getString(2));
            item.setModel(rs.getString(3));
            item.setPrice(rs.getDouble(4));
        }
        close(rs);

        return item;
    }

    @Override
    public List<Item> getAll() throws SQLException {
        List<Item> list = new ArrayList<>();
        psGetAll.execute();
        ResultSet rs = psGetAll.getResultSet();
        while (rs.next()) {
            Item item = new Item();
            item.setId(rs.getLong(1));
            item.setSupplier(rs.getString(2));
            item.setModel(rs.getString(3));
            item.setPrice(rs.getDouble(4));
            list.add(item);
        }
        close(rs);
        return list;
    }

    private static void close(ResultSet rs) {
        try {
            if (rs != null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
