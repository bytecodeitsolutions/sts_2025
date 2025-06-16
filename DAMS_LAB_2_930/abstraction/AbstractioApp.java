package com.dams.app;
import com.dams.vehicle.*;
import com.dams.factory.VehicleFactory;
class AbstractioApp 
{
	public static void main(String[] args) 
	{
		Vehicle  obj=VehicleFactory.getVehicleObject(args[0]);
		
		
		obj.getTotalNumberOfWheels();
		obj.getTotalNumberOfAirBags();
		obj.tankCapacity();
	}
}
/*
   Abstraction:-  
   
   hide the internal implementations and just high light the set of services.
*/