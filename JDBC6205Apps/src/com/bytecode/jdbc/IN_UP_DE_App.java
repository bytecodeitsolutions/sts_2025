package com.bytecode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IN_UP_DE_App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. create the Connection object
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bytecode6205",
				"bytecode6205");
		// 3. create the Statement object
		Statement statement = connection.createStatement();
		// 4. prepare the sql query
		//String INSERT_EMP_DATA = "insert into employee values(444,'Kaju',4000,'Sales')";
		//String UPDATE_EMP_NAME="update employee set name='Kayum' where id=111";
		String DELETE_EMP_ID="delete from employee where id=222";
		// send and execute the sql query
		int result = statement.executeUpdate(DELETE_EMP_ID);
		if (result == 0) {
			System.out.println("Record not deleted");
		} else {
			System.out.println("Record deleted");
		}
		// close the connections
		statement.close();
		connection.close();

	}
}
