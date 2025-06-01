class EmpSalSystem
{
	double  printBasicSalary(double bs){
		System.out.println("Basic Salary is="+bs);
		return bs;
	}
	
	double getTotalSalary(double bs1){
		//basicSalary + basicSalary*0.5
		double  bs=printBasicSalary(bs1);
		double totalSalary=bs+bs*0.5;
		System.out.println("Total Salary is="+totalSalary);
		return totalSalary;
	}
	
	void totalHike(double bs){
		double ts=getTotalSalary(bs);
		System.out.println(ts-bs +" is total hike");
	}
	
}
class  ReturnTypeDemo1
{
	public static void main(String[] args) 
	{
		EmpSalSystem ess=new EmpSalSystem();
		ess.totalHike(10000.0);
	}
}
