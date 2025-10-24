package repository;

import java.util.List;

import com.itm.entity.Laptop;

public interface LaptopDatabase {
    Laptop disLaptop(Laptop lap);
    List<Laptop> disAllLaptops(List<Laptop> laps);
}
