package repository;

import java.util.List;

import com.itm.entity.Laptop;

public class LaptopDBImpl implements LaptopDatabase {

	@Override
	public Laptop disLaptop(Laptop lap) {
		System.out.println("within db"+lap);
		return lap;
	}

	@Override
	public List<Laptop> disAllLaptops(List<Laptop> laps) {
		System.out.println("within database");
		laps.forEach(System.out::println);
		System.out.println("===============");
		//laps.forEach(l->System.out.println());
		return laps;
	}

}
