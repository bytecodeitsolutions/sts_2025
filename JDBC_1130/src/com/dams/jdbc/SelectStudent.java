package com.dams.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudent {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Translator (load the driver class)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Path (create Connection object)
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "udams", "pdams");
	   //Vehicle (create the Statement object)
		Statement st=con.createStatement();
		//prepare query
		String query="select * from student";
		//send and execute the sql query and get the BOX (ResultSet)
		ResultSet rs=st.executeQuery(query);
		
		System.out.println(con.getClass().getName());
		System.out.println(st.getClass().getName());
		System.out.println(rs.getClass().getName());
		
		while (rs.next()) {
			System.out.println(rs.getInt(1) +" "+rs.getString(2) +" "+rs.getString(3) +" "+rs.getLong(4));
		}
		//close the connections in reverse order
		rs.close();
		st.close();
		con.close();
	}

}
