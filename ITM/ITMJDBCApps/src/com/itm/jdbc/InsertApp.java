package com.itm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import static java.lang.System.in;

public class InsertApp {

	public static void main(String[] args) {
//All local variables 
		Scanner scanner = null;
		Connection con = null;
		PreparedStatement ps = null;
		int id = 0, result = 0;
		String name = null;
		float amount = 0.0f;
		try {
			scanner = new Scanner(in);
			System.out.println("Please enter customer id");
			id = scanner.nextInt();
			System.out.println("Please enter customer name");
			name = scanner.next();
			System.out.println("Please enter amount");
			amount = scanner.nextFloat();
			// loading the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Create the Connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "itmuser", "itmpass");
			String query = "insert into customer values(?,?,?)";
			// create PreparedStatement object
			if (con != null) {
				ps = con.prepareStatement(query);
			}
			// ps ->is an object which representing pre compiled sql query
			// set the values to query param , place holder or place resolver ?
			if (ps != null) {
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setFloat(3, amount);
				// execute the sql query
				result = ps.executeUpdate();
			}
			if (result == 0) {
				System.out.println("Record not inserted for " + id);
			} else {
				System.out.println("Record Inserted for " + id);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// close all the connections in reverse order
		finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				scanner.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
