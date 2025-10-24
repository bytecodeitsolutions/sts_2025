package controller;

import java.util.List;

import com.itm.entity.Laptop;

import service.LaptopService;

public class LaptopController {
	
	
	 private LaptopService laptopService;
	 
     public LaptopController(LaptopService laptopService) {
		this.laptopService = laptopService;
	}

	 public List<Laptop> saveLaptops(List<Laptop> laptops) {
		 laptopService.saveAllLaptop(laptops);
    	 return laptops;
     }
     
     public Laptop saveLaptop(Laptop laptop) {
    	 laptopService.saveLaptop(laptop);
    	 return laptop;
     }
}
