package lecture25.services;

import java.io.Serializable;
import java.util.List;

import lecture25.entities.Item;

/**
 * Class ItemService
 *
 * Created by yslabko on 07/02/2017.
 */
public interface ItemService {

    Item save(Item item);

    Item get(Serializable id);

    void update(Item item);

    int delete(Serializable id);

    Item getItemByModelAndSupplier(String model, String supplier);

    List<Item> getAll();
}
