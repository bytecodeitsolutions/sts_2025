package com.itm.bank.service.impl;

import com.itm.bank.dao.CustomerDAO;
import com.itm.bank.entity.Customer;
import com.itm.bank.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO customerDAO;
	private Customer customer;

	public CustomerServiceImpl(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public void register() {
		System.out.println("hello");
		customerDAO.saveCustomer(customer);
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CustomerServiceImpl() {

	}
}
