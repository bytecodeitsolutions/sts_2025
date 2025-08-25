package com.itm.abstraction.db;

import com.itm.abstraction.Connection;

public class DB2 implements Connection {

	@Override
	public void connect() {
		System.out.println("connected with db");

	}

}
