package com.dams.vehicle.tw;
import com.dams.vehicle.Vehicle;
public abstract class Bike implements Vehicle
{
	public  void getTotalNumberOfWheels(){
		System.out.println("Every bike has 2 wheels");
	}
	 public  void getTotalNumberOfAirBags(){
		System.out.println("Every bike has no airbags");
	 }
	 public abstract void tankCapacity();
}
