package fa.training.dao;

import java.sql.SQLException;
import java.util.List;

import fa.training.entity.Order;

public interface OrderDao {
	public List<Order> getAllOrdersByCustomer(int customerId) throws SQLException;

	public boolean addOrder(Order order) throws SQLException;

	public Order getOrderById(int id) throws SQLException;

}
