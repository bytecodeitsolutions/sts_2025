package com.dams.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFirstApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Translator (Load the driver class)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Path (Create the Connection object)
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "udams", "pdams");
		// vehicle (create the statement object)
		Statement st = con.createStatement();
		// create the sql query
		String query = "select * from items";
		// get Box (create the ResultSet obj)
		ResultSet rs = st.executeQuery(query);
		System.out.println(con.getClass().getName());
		System.out.println(st.getClass().getName());
		System.out.println(rs.getClass().getName());
		while (rs.next()) {
			System.out.println("Sr= " + rs.getInt(1) + " item=" + rs.getString(2) + " quantity=" + rs.getInt(3));
		}
		// close all the connections in reverse order
		rs.close();
		st.close();
		con.close();
	}

}
