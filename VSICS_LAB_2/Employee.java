class Employee
{
	
	int  empId; 
	String empName;
	double empSalary;
	
	
	void getEmpDetails(){
		System.out.println("================="+hashCode());
		System.out.println("Employee id is="+empId);
		System.out.println("Employee name is="+empName);
		System.out.println("Employee salary is="+empSalary);
	}
	
	void  applyForLeave(){
		System.out.println(empName +" has taken leave for today");
	}
	
	
	public static void main(String[]  args){
		System.out.println("main method execution started");
	
		Employee obj1=new Employee();
		Employee obj2=new Employee();
		
		obj1.empId=111;
		obj1.empName="Raja";
		obj1.empSalary=100000.0;
		
		obj2.empId=222;
		obj2.empName="Rani";
		obj2.empSalary=1000000.0;
		
		obj1.getEmpDetails();
		obj2.getEmpDetails();
		obj2.applyForLeave();
	}
	
}

/*
  "raja"+"rani"=rajarani
  10+20=30
  "10"+"20"=1020
  
  https://github.com/Kayum1234/sts_2025/tree/main/VSICS_LAB_2
  
  ----------------------------------------------------------------
  
  Syntax for class:
  ----------------
  
  class  ClassName{
  
  
  }
  
  //sytnax to define variable
  ------------------------------
  
  datatype  variablename;
  
  //syntax for method:
  ----------------------
  
  void  methodName(){
  
  
  }
  
  -----------------------
  
  syntax to define main method
  
  public static void main(String[]  args){
  
  }
  
  ---------------------------------
  
  object creation
  
  ClassName  obj_ref_variable=new ClassName();
  
  
  ------------------------------------------
  
  how to access data
  
  obj.variable=value;
  
  ==============================================
  
  how to access methods
  
  obj.methodName();
  
*/