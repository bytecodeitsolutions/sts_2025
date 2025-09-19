package com.itm.bank;

import java.util.Scanner;

import com.itm.bank.dao.CustomerDAO;
import com.itm.bank.entity.Customer;
import com.itm.bank.service.impl.CustomerServiceImpl;

import static java.lang.System.*;
public class BankApp {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(in);
        System.out.println("Please enter customer id ");
        int  id=scanner.nextInt();
        System.out.println("Please enter customer name");
        String name=scanner.next();
        System.out.println("Please enter customer address");
     
        String address=scanner.next();
        System.out.println("Please enter customer mobile");
        long contact=scanner.nextLong();
        
        Customer c1=new Customer(id, name, address, contact);
        CustomerDAO customerDAO=new CustomerDAO();
        CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl(customerDAO);
        customerServiceImpl.setCustomer(c1);
        customerServiceImpl.register();
        scanner.close();
	}
}
