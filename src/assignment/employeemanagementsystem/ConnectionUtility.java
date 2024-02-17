package assignment.employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionUtility {
	/*
	 * Database connection important details
	 * url: Specific URL of MySQL.
	 * connectionDriver: Driver of MySQL.
	 * dbUsername and dbPassword: database login credential.
	 * dbName: Database name from where you want to fetch or insert your data.
	 * */
	protected static final String url = "jdbc:mysql://localhost:3306/";
	protected static final String connectionDriver = "com.mysql.cj.jdbc.Driver";
	protected static final String dbUsername = "root";
	protected static final String dbPassword = "root";
	protected static final String dbName = "ems";
	/*
	 * Some reference variables for established connection purposes.
	 * */
	protected static Connection connect;
	protected static ResultSet resultset;
	protected static Statement statement;
	protected static PreparedStatement preparedstatement;
	/*
	 * Some SQL query
	 * */
	protected static final String loginQuery = "Select * from login where username=? and pass=?";
	protected static final String insertDataQuery = "INSERT INTO manage_employee(firstname,lastname,email,salary,designation) values(?,?,?,?,?)";
	protected static final String updateDataQuery = "UPDATE manage_employee SET firstname=?,lastname=?,email=?,salary=?,designation=? WHERE id=?";
	protected static final String deleteDataQuery = "DELETE FROM manage_employee WHERE ID = ";
	protected static final String searchDataQuery = "select * from manage_employee where id = ";
	
//	For taking input from the user
	static Scanner scan = new Scanner(System.in);
	
	/*
	 * Established Connection here
	 * */
	static {
		try {
			Class.forName(connectionDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connect = DriverManager.getConnection(url+dbName,dbUsername,dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 *Returning connection object.
	 * */
	public static Connection getConnection() {
		return connect;
	}
}
