package fa.training.main;
import fa.training.service.LibraryService;
import fa.training.utils.Validation;

public class LibraryManagement {
	public static void main(String[] args) {
		LibraryService ls = new LibraryService();
		Validation v = new Validation();
		ls.initData();
		while(true) {	
			ls.menu();
			int choise = v.inputInt("Please choose function you'd like to do:", 1, 7);
			switch (choise) {
			case 1: 
				System.out.println("----------Add A New Book-------------");
				ls.addNewBook();
			break;
			case 2: 
				System.out.println("----------Add A New Megagine---------");
				ls.addNewMegagine();
				break;
			case 3: 
				System.out.println("----------Display Books And Megazines-----------");
				ls.displayAll();
				break;
			
			case 4: 
				System.out.println("---------Add Author To Book----------");
				ls.addAuthor();
				break;
			case 5: 
				System.out.println("----------Display Top 10 Of Magazines By Volumns----------");
				ls.displayTop10();
				break;
			case 6: 
				System.out.println("----------Search Book By (isbn, author, publisher)----------");
				ls.search();
				break;
			
			}
		}
	}
}
