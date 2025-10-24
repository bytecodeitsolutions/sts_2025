package service;

import java.util.List;

import com.itm.entity.Laptop;

import repository.LaptopDatabase;

public class LaptopServiceImpl implements LaptopService {
	private LaptopDatabase laptopDatabase;

	public void setLaptopDatabase(LaptopDatabase laptopDatabase) {
		this.laptopDatabase = laptopDatabase;
	}

	@Override
	public List<Laptop> saveAllLaptop(List<Laptop> obj) {
		laptopDatabase.disAllLaptops(obj);
		return obj;
	}

	@Override
	public Laptop saveLaptop(Laptop lap) {
        laptopDatabase.disLaptop(lap);
		return lap;
	}

}
