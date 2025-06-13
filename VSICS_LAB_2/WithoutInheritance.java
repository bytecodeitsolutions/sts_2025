/*
  Object Oriented Programming System
  ----------------------------------
  Data Hiding:
  ------------
  Encapsulation:
  --------------
  Inheritance:
  --------------
*/

class Car
{
	String carName;
	int  carId;
	String carModel;
	
	void  getCarData(){
		System.out.println("Car name ::"+carName +" car id ::"+carId +" car model ::"+carModel);
	}
}

class Baleno
{
	String carName;
	int  carId;
	String carModel;
	
	void  getCarData(){
		System.out.println("Car name ::"+carName +" car id ::"+carId +" car model ::"+carModel);
	}
}

class Innova
{
	String carName;
	int  carId;
	String carModel;
	
	void  getCarData(){
		System.out.println("Car name ::"+carName +" car id ::"+carId +" car model ::"+carModel);
	}
}
class Fortuner
{
	String carName;
	int  carId;
	String carModel;
	
	void  getCarData(){
		System.out.println("Car name ::"+carName +" car id ::"+carId +" car model ::"+carModel);
	}
}
class  WithoutInheritance
{
	public static void main(String[] args) 
	{
		Fortuner  f1=new Fortuner();
		f1.carName="Fortuner Legender";
		f1.carId=1011;
		f1.carModel="2.5v";
		f1.getCarData();
		
		Innova  i1=new Innova();
		i1.carName="Innova";
		i1.carId=1012;
		i1.carModel="2.4z";
		i1.getCarData();
	}
}
