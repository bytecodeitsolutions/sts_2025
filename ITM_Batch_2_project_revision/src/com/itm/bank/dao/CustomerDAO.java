package com.itm.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.itm.bank.entity.Customer;

public class CustomerDAO {
	public void saveCustomer(Customer customer) {
		Connection connection = null;
		String INSERT_CUSTOMER_RECORD = null;
		PreparedStatement preparedStatement = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "itmbatch2", "imtbatch2");
			INSERT_CUSTOMER_RECORD = "insert into customer values(?,?,?,?)";
			if (connection != null) {
				preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_RECORD);
			}
			if (preparedStatement != null) {
				// set input values to query param
				preparedStatement.setInt(1, customer.getcId());
				preparedStatement.setString(2, customer.getcName());
				preparedStatement.setString(3, customer.getcAddress());
				preparedStatement.setLong(4, customer.getContactNumber());
				// execute query
				result = preparedStatement.executeUpdate();
			}
			if (result == 0) {
				System.out.println("record not  inserted");
			} else {
				System.out.println("record inserted");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// close all the connections in reverse order
		finally {
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
