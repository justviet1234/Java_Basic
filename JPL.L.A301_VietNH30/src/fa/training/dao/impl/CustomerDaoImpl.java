package fa.training.dao.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fa.training.dao.CustomerDao;
import fa.training.entity.Customer;
import fa.training.util.DatabaseConnection;

public class CustomerDaoImpl implements CustomerDao {
	@Override
	public List<Customer> getAllCustomer() throws SQLException {
		String sqlQuery = "SELECT CustomerId, CustomerName FROM Customer";
		List<Customer> customers = new ArrayList<Customer>();
		try (Connection connection = DatabaseConnection.DBConnection.getConnection()) {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sqlQuery);
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString(2));
				customers.add(customer);
			}
		}
		return customers.size() > 0 ? customers : null;
	}

	@Override
	public boolean addCustomer(Customer customer) throws SQLException {
		if (customer == null) {
			return false;
		}
		PreparedStatement statement = null;
		boolean result = false;
		String sqlQuery = "INSERT INTO Customer (CustomerName) Values (?)";
		try (Connection connection = DatabaseConnection.DBConnection.getConnection()) {
			statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, customer.getCustomerName());
			statement.executeUpdate();
			System.out.println("add success");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("[ERROR] ", e);
		} finally {
			DatabaseConnection.close(statement, null);
		}
		return result;

	}

	@Override
	public boolean updateCustomer(Customer customer) throws SQLException {
		if (customer == null) {
			return false;
		}
		PreparedStatement statement = null;
		boolean result = false;
		String sqlQuery = "UPDATE Customer SET CustomerName = ? WHERE CustomerId = ?";
		try (Connection connection = DatabaseConnection.DBConnection.getConnection()) {
			statement = connection.prepareStatement(sqlQuery);
			statement.setString(1, customer.getCustomerName());
			statement.setInt(2, customer.getCustomerId());
			statement.executeUpdate();
			System.out.println("Update success");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("[ERROR] ", e);
		} finally {
			DatabaseConnection.close(statement, null);
		}
		return result;
	}

	@Override
	public Customer getCustomerById(int id) throws SQLException {
		PreparedStatement statement = null;
		ResultSet rs = null;
		String sqlQuery = "SELECT CustomerId, CustomerName FROM Customer WHERE CustomerId = ?";
		try (Connection connection = DatabaseConnection.DBConnection.getConnection()) {
			statement = connection.prepareStatement(sqlQuery);
			statement.setInt(1, id);
			rs = statement.executeQuery();
			if (rs.next()) {
				return new Customer(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("[ERROR] ", e);
		} finally {
			DatabaseConnection.close(statement, rs);
		}
		return null;
	}

	@Override
	public boolean deleteCustomer(int customerId) throws SQLException {
		if (customerId < 0) {
			return false;
		}
		PreparedStatement prepareStatement = null;
		
		boolean result = false;
		try (Connection connection = DatabaseConnection.DBConnection.getConnection()) {
			prepareStatement = connection.prepareStatement("Delete from customer where CustomerId=?");
			prepareStatement.setInt(1,customerId);
		
			prepareStatement.executeUpdate();
			System.out.println("delete success");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("[ERROR] ", e);
		} finally {
			DatabaseConnection.close(prepareStatement, null);
		}

		return result;
	}

}
