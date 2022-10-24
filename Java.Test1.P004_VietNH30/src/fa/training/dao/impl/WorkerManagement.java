package fa.training.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fa.training.dao.WorkerDao;
import fa.training.entities.Worker;
import fa.training.util.Validation;

public class WorkerManagement implements WorkerDao {
	private static final String STRING_VALID = "[A-Za-z\\s]+";
	List <Worker> list = new ArrayList<Worker>();
	Validation v = new Validation();

	@Override
	public void menu() {
		System.out.println("1. Add a new list of worker");
		System.out.println("2. Find existed manager by level, display sort by name");
		int choice = v.inputInt("", 1, 2);
		switch(choice) {
		case 1:
			inputData();
			break;
		case 2:
			findbyDepartment(0);
			break;
		}
	}

	@Override
	public void inputData() {
		while(true) {
			int iD = v.inputInt("Enter ID", 1, Integer.MAX_VALUE);
			String fullName = v.inputString("Enter fullname", STRING_VALID);
			Date dateOfBirth = v.inputDate("Enter date of birth");
			String gender = v.inputString("Enter gender", STRING_VALID);
			String address = v.inputString("Enter address", STRING_VALID);
			int workerLevel = v.inputInt("Enter workerLevel", 1, 7);
			Worker w = new Worker(iD, fullName, dateOfBirth, gender, address, workerLevel);
			list.add(w);
			if (v.checkInputYN()) {
				continue;
			} else {
				break;
			}
		}
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Worker> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Worker findbyDepartment(int level) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
