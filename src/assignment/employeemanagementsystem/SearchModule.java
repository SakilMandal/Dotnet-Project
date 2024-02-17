package assignment.employeemanagementsystem;

import java.sql.SQLException;

public class SearchModule extends ConnectionUtility {
	/* 
	 * Search details using ID
	 * */
	public void SearchData() throws SQLException {
//		User input of ID
		System.out.println("Enter your id: ");
		int id = scan.nextInt();
//		Data fetching JDBC code
		statement = connect.createStatement();
		resultset = statement.executeQuery(searchDataQuery + id);
//		Retrieve data one by one and display data as usual
		if(resultset.next()) {
			int dbId =resultset.getInt("id");
			String dbFirstname = resultset.getString("firstname");
			String dbLastname = resultset.getString("lastname");
			String dbEmail = resultset.getString("email");
			String dbSalary = resultset.getString("salary");
			String dbDesignation = resultset.getString("designation");
			System.out.println();
			System.out.println("---------------Profile-------------------");
			System.out.println("Id is: "+dbId+ "\nName: "+dbFirstname+" "+dbLastname+
					"\nDesignation: "+dbDesignation+"\nEmail: "+dbEmail+"\nSalary: "+dbSalary);
			System.out.println("-----------------------------------------");
		}
		else {
			System.out.println("\n**********No data found************\n");
			
		}
	}

}
