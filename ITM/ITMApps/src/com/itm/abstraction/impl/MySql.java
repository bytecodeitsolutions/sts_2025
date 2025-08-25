package com.itm.abstraction.impl;

import com.itm.abstraction.Connection;

public class MySql implements Connection {

	@Override
	public void connect() {
		System.out.println("COnnected with mysql db");

	}

}
