package com.itm.main;

import java.util.Scanner;

import com.itm.entity.Product;
import com.itm.entity.User;
import com.itm.exception.ProductNotFoundException;

public class MainApp {

	public static void main(String[] args) {
		Product[] products = new Product[3];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println((i + 1) + " product details");
			System.out.println("Please enter product id");
			int id = scanner.nextInt();

			System.out.println("Please enter product name");
			String name = scanner.next();

			System.out.println("Please enter product price");
			double value = scanner.nextDouble();
			products[i] = new Product(id, name, value);
		}

		//User user = new User(new Product(102, "Keyboard", 1000.0d));
		User u1=new User();
		try {
			u1.findProduct(products,103);
		} catch (ProductNotFoundException e) {
             e.printStackTrace();            
		}
	}

}
