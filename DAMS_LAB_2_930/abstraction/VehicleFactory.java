package com.dams.factory;
import com.dams.vehicle.*;
import com.dams.vehicle.fw.*;
import com.dams.vehicle.tw.*;

public class  VehicleFactory
{
	public static Vehicle obj=null;
	
	
	public static Vehicle getVehicleObject(String  userMsg){
		
		 if(userMsg.equals("innova")){
			obj=new Innova();
		 }
		 else if (userMsg.equals("bleno"))
		 {
			 obj=new Baleno();
		 }
		 else if (userMsg.equals("fortuner"))
		 {
			 obj=new Fortuner();
		 }
		  else if (userMsg.equals("platina"))
		 {
			 obj=new Platina();
		 }
		  else if (userMsg.equals("royal"))
		 {
			 obj=new RoyalEnfield();
		 }
		 else{
			obj=null;
		 }
		 return obj;
	} 
	
}
