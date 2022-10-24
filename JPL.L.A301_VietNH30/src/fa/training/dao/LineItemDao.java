package fa.training.dao;

import java.sql.SQLException;
import java.util.List;

import fa.training.entity.LineItem;

public interface LineItemDao {
	public List<LineItem> getAllItemsByOrderId(int orderId) throws SQLException;

	public boolean addLineItem(LineItem lineItem) throws SQLException;
}
