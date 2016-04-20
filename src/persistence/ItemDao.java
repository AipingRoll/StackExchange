package persistence;

import domain.Item;
import domain.Product;

/**
 * Created by 温 睿诚 on 2016/4/12/0012.
 */
public interface ItemDao {
    Item findItemByOrderId(String orderId);
    int insertItem(Item item);

}
