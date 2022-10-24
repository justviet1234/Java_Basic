package fa.training.main;

import fa.training.dao.impl.ManagerManagement;
import fa.training.dao.impl.WorkerManagement;
import fa.training.util.Validation;

public class PersonManagement {
	public static void main(String[] args) {
		WorkerManagement w = new WorkerManagement();
		ManagerManagement m = new ManagerManagement();
		Validation validation = new Validation();
		while (true) {
			System.out.println("1. Manager Managerent");
			System.out.println("2. Worker Management");
			System.out.println("3. Close Program");
			int choice = validation.inputInt("Enter choice: ", 1, 3);
			switch (choice) {
			case 1:
				m.menu();
				break;
			case 2:
				w.menu();
				break;
			case 3:
				return;

			}
	}
	}
}
