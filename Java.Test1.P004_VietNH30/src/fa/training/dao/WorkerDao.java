package fa.training.dao;

import java.util.List;

import fa.training.entities.Worker;

public interface WorkerDao {
	public void menu();
	public void inputData();
	public void save();
	public List<Worker> findAll();
	public void display();
	public Worker findbyDepartment(int level);
}
