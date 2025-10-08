package com.itm;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine() {
      System.out.println("Engine 0 param constructor");
	}
	
	public void start() {
		System.out.println("Engine started");
	}
}
