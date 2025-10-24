package service;

import java.util.List;

import com.itm.entity.Laptop;

public interface LaptopService {
	List<Laptop> saveAllLaptop(List<Laptop> laps);

	Laptop saveLaptop(Laptop lap);
}
