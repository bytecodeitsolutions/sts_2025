package com.itm.mainapp;

import com.itm.abstraction.Connection;
import com.itm.exception.NotSuitableDatabaseException;
import com.itm.factory.ConnectionFactory;

public class AbstractionApp {

	public static void main(String[] args) {
		
		Connection con=null;
		try {
			con = ConnectionFactory.getConnection("mysql");
			System.out.println(con.getClass());
		} catch (NotSuitableDatabaseException e) {
			e.printStackTrace();
		}
		con.connect();
	}

}
