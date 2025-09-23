/*
 if we want to initialize data (busId and noOfSeats) at the time of object
 creation so that object can behave properly.
 
 why contructor
 rules to define constructor
 applicable modifiers for constructor
 Default constructor
 this
 super
 
 this()
 super()
 constructor chaining
 constructor oveloading
*/
class Bus
{
	private int busId;
	private int noOfSeats;
	
	Bus(int busId,int noOfSeats){
		this.busId=busId;
		this.noOfSeats=noOfSeats;
	}
	
	void setBusData(int busId,int noOfSeats){
		this.busId=busId;
		this.noOfSeats=noOfSeats;
	}
	
	void getBusDetails(){
		System.out.println("bus id="+busId +" no of seats="+noOfSeats);
	}
}
class ConstructorDemo1 
{
	public static void main(String[] args) 
	{
		Bus  bus1=new Bus(1001,30);
		Bus  bus2=new Bus(1002,60);
		
		//bus1.busId=101;
		//bus1.noOfSeats=30;
		
		//bus1.setBusData(1001,30);
		//bus2.setBusData(1002,60);
		bus1.getBusDetails();
		bus2.getBusDetails();
	}
}
