package assignment.employeemanagementsystem;

import java.sql.SQLException;

public class AppRunner extends ConnectionUtility {

	public static void main(String[] args) throws SQLException {
		/* Taking Input from the user and trim extra white space and make it in upper case*/
		System.out.println("-----------Welcome To Employee Management System--------------\n");
		System.out.print("Username: ");
		String username = scan.nextLine().trim().toLowerCase();
		System.out.print("Password: ");
		String password = scan.nextLine().trim().toLowerCase();
		String Username = null;
		String Password = null;
		//Fetching data from Database through loginQuery and Store in variables.
		preparedstatement = connect.prepareStatement(loginQuery);
		preparedstatement.setString(1, username);
		preparedstatement.setString(2, password);
		resultset = preparedstatement.executeQuery();
		while(resultset.next()) {
			Username = resultset.getString("username");
			Password = resultset.getString("pass");
		}
		
		/*Checking the Authorization of a particular user.
		Checking through the Username and password provided by the user.*/
		try {
		if(Password.equals(password)&& Username.equals(username)) {
			System.out.println("\n \nWelcome "+username.toUpperCase());
			while(true) {
				System.out.println("-----------------Choice Menu------------------");
				System.out.println("\nPress 1 for Manage Employee.");
				System.out.println("Press 2 for Delete.");
				System.out.println("Press 3 for Search.");
				System.out.println("Press 4 for Exit.");
				System.out.println("-----------------------------------------------");
				System.out.println();
				System.out.print("Enter your choice: ");
				int choice = scan.nextInt();
				MenuModule option = new MenuModule();
				option.menu(choice);
			}
		}
		else {
			System.out.println("\n********************Authentication Failed********************\n");
			scan.close();
			System.out.println("\n-------------------------------------------------------------------");

		}
		}catch(Exception e) {
			System.out.println("\n********************Authentication Failed********************\n");
			scan.close();
			System.out.println("\n----------------------------------------------------------------");
		}
		
		
	}
}
