package fa.training.entity;

import java.sql.Date;

public class Order {
	private int orderId;
	private int customerId;
	private int employeeId;
	private double total;
	private Date orderDate;

	
	public int getOrderId() {
		return orderId;
	}

	public Order(int customerId, int employeeId, Date orderDate) {
		super();
		this.customerId = customerId;
		this.employeeId = employeeId;
		this.orderDate = orderDate;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Order() {
	}

	public Order(int orderId, int customerId, int employeeId, double total, Date orderDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.employeeId = employeeId;
		this.total = total;
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", customerId=" + customerId + ", employeeId="
				+ employeeId + ", total=" + total + "]";
}
}
