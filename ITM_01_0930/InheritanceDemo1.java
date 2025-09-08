class Employee //Super | Base | Parent
{
	int empId;
	String eName;
	String desg;
	
	void setEmpData(){
		System.out.println("setEmpData() method executed");
	}
	void getEmployeeData(){
		System.out.println("getEmpData() method executed");
	}
}

class HR extends Employee //Child class , sub class
{
    void m3(){
		System.out.println("m3() method executed from Child HR");
    }
}

class Admin extends Employee
{
	 void m2(){
		
	 }
}
class Manager extends Employee
{
	 void m1(){
		
	 }
}
class  InheritanceDemo1
{
	public static void main(String[] args) 
	{
		/*
		    Case-1:
			if we have object of Parent class and reference of Parent class
			then we can access only Parent class properties and functionalities.
			
			Employee e1=new Employee();
		e1.setEmpData();
		//e1.m3();//CE can not find symbol m3
			
			Case-2:
			
			if we have object of Child class and reference of Child class
			then we can access both parent and child class properties and 
			functionalities.
			
			HR  hr1=new HR();
		 hr1.m3();//calling from self (Child)
		 hr1.setEmpData();//calling from Parent
		 
		 Case-3: important [abstraction]
		 
		 if we have object of Child class and ref of Parent class then we can access only parent class properties and methods.
		 
		 
		  Employee  e1=new HR();
		  e1.setEmpData();
		  e1.m3();
		  
		  Case-4:
		  
		  if we have object of Parent class and reference of Child class.
		  
		   HR  h1=new Employee();
		*/
		
		 
	}
}
