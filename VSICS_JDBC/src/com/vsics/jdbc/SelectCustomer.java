package com.vsics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectCustomer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Translator -load the Driver class=>oracle.jdbc.driver.OracleDriver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Path =>Connection object
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "uvsics", "pvsics");
		// vehicle =>Statement object
		Statement st = con.createStatement();
		// requirement ==>SQL query
		String query = "update customer set cname='abhay singh' where cid=103";
		// send and execute the sql query and get the BOX ==>ResultSet
		// ResultSet rs=st.executeQuery(query);

		int result = st.executeUpdate(query);
		// System.out.println(con.getClass().getName());
		/*
		 * while(rs.next()) { System.out.println(rs.getInt(1)+"  "+rs.getLong(2) );
		 * 
		 * }
		 */
		// close all the connection in reverse order
		// rs.close();
		if (result == 0) {
			System.out.println("Record not updated");
		} else {
			System.out.println("Record Updated");
		}
		st.close();
		con.close();
	}

}
