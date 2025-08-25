package com.itm.abstraction.orcl;

import com.itm.abstraction.Connection;

public class Oracle implements Connection{

	@Override
	public void connect() {
		System.out.println("Connected with oracle db");
		
	}

}
