package com.bytecode.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectEmployeeData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Please enter dept name");
	    String  deptName=scanner.next();
	    deptName="'"+deptName+"'";
		//Step=1 (Translator) Load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//step-2: //PATH=>create the Connection object
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bytecode6205","bytecode6205");
	    //step-3: Vehicle =>create the Statement object
		Statement st=con.createStatement();
		//Step-4: Requirement==>prepare SQL query
		String  FETCH_EMP_DATA="select * from employee where dept="+deptName +" order by name desc";
		System.out.println(FETCH_EMP_DATA);
		//step-5=>send and execute the SQL query
		ResultSet rs=st.executeQuery(FETCH_EMP_DATA);
		//fetch all data from ResultSet object rs
		while (rs.next()) {
			System.out.println(rs.getInt(1) +" "+rs.getString(2) +" "+rs.getFloat(3) +" "+rs.getString(4));
		}
		//close all the Connections in reverse order
		rs.close();
		st.close();
		con.close();
	}

}
