package persistence;

import domain.Order;

/**
 * Created by 温 睿诚 on 2016/4/12/0012.
 */
public interface OrderDao {
    Order findOrderByBuyerId(String BuyerId);
    Order findOrderBySellerId(String SellerId);
    int insertOrder(Order order);
}
