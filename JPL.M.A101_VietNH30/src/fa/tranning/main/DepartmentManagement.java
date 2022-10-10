package fa.tranning.main;

import fa.tranning.service.DepartmentController;
import fa.tranning.utils.validation;

public class DepartmentManagement {
	public static void main(String[] args) {
		DepartmentController manager = new DepartmentController();
		validation validation = new validation();
		while (true) {
			System.out.println("==========DepartmentManage==========");
			DepartmentController.menu();
			int choice = validation.inputInt("Enter your choice: ", 1, 6);
			switch (choice) {
			case 1:
				System.out.println("----------Create Employee----------");
				manager.create();
				break;
			case 2:
				System.out.println("----------Display Employee----------");
				manager.display();
				break;
			case 3:
				System.out.println("----------Classify Employee----------");
				manager.classify();
				break;
			case 4:
				System.out.println("----------Search Employee----------");
				manager.search();
				break;
			case 5:
				System.out.println("----------Report----------");
				manager.report();
				break;
			case 6:
				System.exit(0);
				break;
			}
		}

	}
}
