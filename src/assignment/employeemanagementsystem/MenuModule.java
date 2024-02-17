package assignment.employeemanagementsystem;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuModule {
	/*
	 * All the choice actions are class are called here
	 * */
	public void menu(int choice) throws SQLException  {
		switch(choice) {
//		Manage employee module methods are called here
		case 1: 
			ManageEmployeeModule manage = new ManageEmployeeModule() ;
			Scanner scan  = new Scanner(System.in);
			System.out.println("----------------Manage Employee----------------");
			System.out.println("Press 1 for Add.");
			System.out.println("Press 2 for Update.");
			System.out.println("------------------------------------------------");
			System.out.print("\nEnter your choice: ");
			int option  = scan.nextInt();
			if(option == 1) {
				manage.addData();
			}
			else if(option == 2) {
				manage.updateData();
			}else {
				System.out.println("\n*****************Invalid choice*****************\n");
			}
			
			break;			
//		Delete module class is called here
		case 2: 
			DeleteModule delete = new DeleteModule();
			delete.deleteData();
			break;
//			Search module class is called here
		case 3: 
			SearchModule search = new SearchModule();
			search.SearchData();
			break;
//			exit 
		case 4:
			System.out.println("\n---------------Thank You-----------------\n");
			System.exit(0);
			break;
//			default or bad response
		default: 
			System.out.println("\n***************Invalid choice.***************\n");
				
		}
	}

}
