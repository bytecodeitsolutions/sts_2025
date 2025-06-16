package com.dams.vehicle.fw;
import com.dams.vehicle.Vehicle;
public abstract class Car implements Vehicle
{
	public  void getTotalNumberOfWheels(){
		System.out.println("Every Car has 4 wheels");
	}
	 public abstract void getTotalNumberOfAirBags();
	 public abstract void tankCapacity();
}
