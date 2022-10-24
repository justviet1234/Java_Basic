package fa.training.dao;

import java.sql.SQLException;

import fa.training.entity.Product;

public interface ProductDao {
	public Product getProductById(int productId) throws SQLException;
}
