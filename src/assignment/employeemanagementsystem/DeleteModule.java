package assignment.employeemanagementsystem;

import java.sql.SQLException;

public class DeleteModule extends ConnectionUtility {
	/* 
	 * Deleting a particular profile data using the id of that profile
	 * */
	public void deleteData() throws SQLException {
//		Taking id from user
		System.out.println("-------------Deleting Page---------------");
		System.out.println("Enter a id which you want to delete: ");
		int id  = scan.nextInt();
		System.out.println("-----------------------------------------");
//		JDBC code for deletion
		statement = connect.createStatement();
		int deleteRows = statement.executeUpdate(deleteDataQuery + id);
//		Display status
		if(deleteRows != 0) {
			System.out.println("\n-----------------Delete Successful-----------------\n");
		}
		else {
			System.out.println("\n********************No data found*******************\n");
		}
		
	}
}
