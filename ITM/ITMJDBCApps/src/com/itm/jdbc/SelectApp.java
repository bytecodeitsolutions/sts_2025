package com.itm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Translator->Load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// step-2 Path ->Create the Connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "itmuser", "itmpass");
		System.out.println("is this object of Connection=" + con.getClass());
		// Step-3: Vehicle create the Statement object
		Statement st = con.createStatement();
		System.out.println("is this object of Statement=" + st.getClass());
		// step-4:->requirement ->prepare SQL query
		String query = "select cid from customer";
		// step-5 (Box)-send and execute sql query and get ResultSet object
		ResultSet rs = st.executeQuery(query);
		System.out.println("is this object of ResultSet=" + rs.getClass());
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3));
		}
		// close all the connections in reverse order
		rs.close();
		st.close();
		con.close();
	}

}
