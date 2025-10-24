package com.itm.main;

import java.util.ArrayList;

import com.itm.entity.Laptop;

import controller.LaptopController;
import repository.LaptopDBImpl;

import service.LaptopServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		Laptop l1=new Laptop(111, "HP", 40000.0, "ABC");
		Laptop l2=new Laptop(222, "DELL", 70000.0, "XYZ");
		Laptop l3=new Laptop(333, "LINOVO", 30000.0, "PQR");
		Laptop l4=new Laptop(444, "MAC", 80000.0, "XY");
		Laptop l5=new Laptop(555, "HP", 90000.0, "ABC");
		
		ArrayList<Laptop> laptops=new ArrayList<Laptop>();
		laptops.add(l1);
		laptops.add(l2);
		laptops.add(l3);
		laptops.add(l4);
		laptops.add(l5);
		
		LaptopDBImpl lapdab=new LaptopDBImpl();
		LaptopServiceImpl laptopService=new LaptopServiceImpl();
		
		laptopService.setLaptopDatabase(lapdab);
		
		LaptopController controller=new LaptopController(laptopService);
		
		ArrayList<Laptop> listOfLap=(ArrayList<Laptop>)controller.saveLaptops(laptops);
		System.out.println("====within main=========");
		listOfLap.forEach(System.out::println);
		
		System.out.println("main="+controller.saveLaptop(l1));

	}

}
