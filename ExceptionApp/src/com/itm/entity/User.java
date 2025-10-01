package com.itm.entity;

import com.itm.exception.ProductNotFoundException;

public class User {

	/*
	 * private Product[] products;
	 * 
	 * public User(Product[] products) { this.products = products; }
	 */

	private Product product;

	/*
	 * public User(Product product) { this.product = product; }
	 */

	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(Product product) {
		this.product=product;
	}

	public void findProduct(Product[] products, int id) throws ProductNotFoundException {

		// Product[] products = product.getProducts();
		for (Product product : products) {
			if (product.getpId() == id) {
				System.out.println(product);
				return;
			}
		}
		throw new ProductNotFoundException(id + " is not available in db ");
	}
}
