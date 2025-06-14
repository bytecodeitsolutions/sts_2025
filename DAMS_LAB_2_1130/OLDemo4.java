class Employee
{
	
}
class HR extends Employee
{
	
}
class OLTest4
{
	void  m1(Employee  o){
		System.out.println("Employee");
	}
	void  m1(HR s){
		System.out.println("HR");
	}
}
class OLDemo4 
{
	public static void main(String[] args) 
	{
		OLTest4  obj=new OLTest4();
		obj.m1(null);
		obj.m1(new Employee());
		obj.m1(new HR());
		
		Employee e1=new HR();
		obj.m1(e1);
	}
}
