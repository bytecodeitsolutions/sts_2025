package com.itm.datahiding;

public class UserVerification {
	static boolean x = false;

	public static boolean verifyUser(int pin) {
		if (pin == 1111) {
			x = true;
		} else if (pin == 2222) {
			x = true;
		} else {
			return x = false;
		}
		return x;
	}
}
