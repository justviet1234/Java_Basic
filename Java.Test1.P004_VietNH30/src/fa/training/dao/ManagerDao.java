package fa.training.dao;

import java.util.List;

import fa.training.entities.Manager;

public interface ManagerDao {
	public void menu();
	public void inputData();
	public void save();
	public List<Manager> findAll();
	public void display();
	public Manager findbyDepartment(String Department);
}
