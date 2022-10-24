package fa.training.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fa.training.dao.ManagerDao;
import fa.training.entities.Manager;
import fa.training.util.Validation;
import fa.training.entities.Manager;;

public class ManagerManagement implements ManagerDao {
	private static final String STRING_VALID = "[A-Za-z\\s]+";
	Validation v = new Validation();
	List<Manager> list = new ArrayList<Manager>();

	@Override
	public void menu() {
		System.out.println("1. Add a new list of manager");
		System.out.println("2. Display all manager");
		System.out.println("3. Find existed manager by department");
		int choice = v.inputInt("", 1, 3);
		switch (choice) {
		case 1:
			inputData();
			save();
			break;
		case 2:
			findAll();
			display();
			break;
		case 3:
			findbyDepartment("");
			break;
		}
	}

	@Override
	public void inputData() {
		while(true) {
			int ID = v.inputInt("Enter manager ID", 1, Integer.MAX_VALUE);
			String fullName = v.inputString("Enter fullname", STRING_VALID);
			Date dateOfBirth = v.inputDate("Enter date of birth");
			String gender = v.inputString("Enter gender", STRING_VALID);
			String address = v.inputString("Enter address", STRING_VALID);
			String department = v.inputString("Enter department", STRING_VALID);
			Manager m = new Manager(ID,fullName,dateOfBirth,gender,address,department);
			list.add(m);
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
	public List<Manager> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

	@Override
	public Manager findbyDepartment(String Department) {
		// TODO Auto-generated method stub
		return null;
	}

}
