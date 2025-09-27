package com.itm.datahiding;

public class UserService {
	public void getUserData(User user) {
		boolean y=UserVerification.verifyUser(1111);
		if (y) {
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println(user.getAddress());
			System.out.println(user.getContactNumber());
		} else {
			System.out.println("Invalid pin number");
		}
	}
}
