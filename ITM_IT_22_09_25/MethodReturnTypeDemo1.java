class Employee
{
	double basSal;
	
	double basicSalary(){
		return basSal;
	}
	double getSalary(){
		double val=basicSalary();
		double totalSal=val+val*0.5;
		return totalSal;
	}
}
class  MethodReturnTypeDemo1
{
	public static void main(String[] args) 
	{
		Employee  e1=new Employee();
		Employee  e2=new Employee();
		e1.basSal=10000.0d;
		e2.basSal=20000.0D;
		
		double  totSal1=e1.getSalary();
		double  totSal2=e2.getSalary();
		System.out.println("e1 ki total sal="+totSal1);
		System.out.println("e2 ki total sal="+totSal2);
	}
}
