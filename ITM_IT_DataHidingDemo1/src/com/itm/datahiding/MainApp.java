package com.itm.datahiding;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter user id");
		int id = scanner.nextInt();
		System.out.println("Please enter user name");
		String name = scanner.next();
		System.out.println("Please enter address");
		String add = scanner.next();
		System.out.println("Please enter contact number");
		long mobile = scanner.nextLong();
		User u = new User(id, name, add, mobile);
		UserService service = new UserService();
		service.getUserData(u);
	}

}
