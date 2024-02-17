package assignment.employeemanagementsystem;

import java.sql.SQLException;
import java.sql.Statement;

public class ManageEmployeeModule extends ConnectionUtility {
		
	/*
	 * Adding User data into the database
	 * Taking user input and push into the database
	 * Display the ID
	 * */
	public void addData() throws SQLException {
//		User Data
		System.out.println("---------------Entry Page----------------");
		System.out.println("Enter Your First Name: ");
		scan.nextLine();
		String firstname = scan.nextLine().toUpperCase();
		System.out.println("Enter your Last Name: ");
		String lastname = scan.nextLine().toUpperCase();
		System.out.println("Enter your email id: ");
		String email = scan.nextLine().toUpperCase();
		System.out.println("Enter your Salary: ");
		String salary = scan.nextLine();
		System.out.println("Enter your designation: ");
		String designation = scan.nextLine().toUpperCase();
		System.out.println("-----------------------------------------");
//		Data insertion
		preparedstatement = connect.prepareStatement(insertDataQuery,Statement.RETURN_GENERATED_KEYS) ;	
		preparedstatement.setString(1, firstname);
		preparedstatement.setString(2, lastname);
		preparedstatement.setString(3, email);
		preparedstatement.setString(5, designation);
		preparedstatement.setString(4, salary);
		preparedstatement.executeUpdate();
		
		resultset = preparedstatement.getGeneratedKeys();
//		Display ID and the Status message
		if(resultset.next()) {
			System.out.println("Data insrted...");
			System.out.println("------------Employee Id------------------");
			System.out.println("Id: "+resultset.getInt(1));
			System.out.println("-----------------------------------------\n");
		}else {
			System.out.println("Failed to insert data.");
		}
	}
	
	/*
	 * Update existing data into the database using the id
	 * */
	
	public void updateData() throws SQLException {
//		User Data
		System.out.println("----------Updata Data Providing Page-----------");
		System.out.println("Enter your ID: ");
		scan.nextLine();
		String dbId = scan.nextLine();
		System.out.println("Enter your new First Name:");
		String updateFirstName = scan.nextLine().toUpperCase();
		System.out.println("Enter your new Last Name: ");
		String updateLastName = scan.nextLine().toUpperCase();
		System.out.println("Enter your new Email: ");
		String newEmail = scan.nextLine().toUpperCase();
		System.out.println("Enter your new Salary: ");
		String newSalary = scan.nextLine();
		System.out.println("Enter your new Designation: ");
		String newDesignation = scan.nextLine().toUpperCase();
		System.out.println("----------------------------------------------");
//		Data update into the database
		preparedstatement = connect.prepareStatement(updateDataQuery);
		preparedstatement.setString(1, updateFirstName);
		preparedstatement.setString(2, updateLastName);
		preparedstatement.setString(3, newEmail);
		preparedstatement.setString(4, newSalary);
		preparedstatement.setString(5, newDesignation);
		preparedstatement.setString(6, dbId);
		int count = preparedstatement.executeUpdate();
//		Display the Status. 
		if(count !=0) {
			System.out.println("\n-------------Data Update successfully Complete--------------\n");
		}
		else {
			System.out.println("\n******************Failed to Entry the Data Please Check Your Id******************\n");
		}
		
	}

}
