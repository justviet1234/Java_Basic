package fa.training.dao;

import java.sql.SQLException;
import java.util.List;

import fa.training.entity.Customer;

public interface CustomerDao {
	public List<Customer> getAllCustomer() throws SQLException;

	public boolean addCustomer(Customer customer) throws SQLException;

	public boolean updateCustomer(Customer customer) throws SQLException;

	public Customer getCustomerById(int id) throws SQLException;

	public boolean deleteCustomer(int id) throws SQLException;
}
