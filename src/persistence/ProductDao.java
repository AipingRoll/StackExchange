package persistence;

import domain.Product;

import java.util.List;

/**
 * Created by 温 睿诚 on 2016/4/12/0012.
 */
public interface ProductDao {
    Product findProductBySellerId(String accountId);
    List<Product> searchProduct(String keyword);
    int insertProduct(Product product);
    int editProduct(Product product);
    int deleteProduct(String productId);

}
