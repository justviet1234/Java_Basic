package fa.training.util;

public class SQLCommand {
	public static String BILL_QUERY_FIND_ALL = "SELECT * FROM Bill";
	public static String BILL_QUERY_ADD = "{CALL usp_AddBill(?, ?, ?, ?, ?)}";
	public static String BILL_QUERY_DELETE = "{CALL usp_DeleteBill(?, ?)}";
	public static String BILL_QUERY_FIND_BY_CODE = "SELECT * FROM Bill WHERE billCode=?";
	public static String BILL_QUERY_FIND_BY_CUSTOMER_NAME = "SELECT * FROM Bill WHERE customerName=?";
	public static String ITEM_QUERY_FIND_ALL = "SELECT * FROM Item";
	public static String ITEM_QUERY_ADD = "INSERT INTO Item(productName, billCode, quantity, price) VALUES (?, ?, ?, ?)";
	public static String ITEM_QUERY_DELETE = "DELETE FROM Item WHERE billCode=? AND productName=?";
	public static String ITEM_QUERY_FIND_CODE_AND_PRODUCT_NAME = "SELECT * FROM Item WHERE billCode=? AND productName;=?";
}
