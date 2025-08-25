package com.itm.factory;

import com.itm.abstraction.Connection;
import com.itm.abstraction.db.DB2;
import com.itm.abstraction.impl.MySql;
import com.itm.abstraction.orcl.Oracle;
import com.itm.exception.NotSuitableDatabaseException;

public class ConnectionFactory {
	private static Connection con;

	public static Connection getConnection(String input) throws NotSuitableDatabaseException {
		if (input.equals("oracle")) {
            con=new Oracle();
		}
		else if (input.equals("db2")) {
			con=new DB2();
		}
		else if (input.equals("mysql")) {
			con=new MySql();
		}
		else {
			throw new NotSuitableDatabaseException("aisa mere db nhi hai");
		}
		return con;
	}
}
