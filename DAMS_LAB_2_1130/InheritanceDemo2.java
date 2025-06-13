/*
  Inheritance:
  ------------
  Why?????
  How?????
  
  
*/

class Department extends Object
{
	private int  deptId;
	String deptName;
	
	void getDeptData(){
		System.out.println("Dept ID="+deptId +" Dept Name="+deptName);
	}
}
class HR extends Department //,Object
{
	int  hrId;
	void getDeptData(){
		System.out.println("Hr id is ="+hrId +" Dept ID="+deptId +" Dept Name="+deptName);
	}
}

class Manager extends HR
{
	int  mId;
}
class  InheritanceDemo2
{
	public static void main(String[] args) 
	{
		 /*
		Manager  m1=new Manager();
		m1.mId=101;
		m1.deptId=1001;
		m1.deptName="IT";
		m1.getDeptData();
		System.out.println(m1.hashCode());
		System.out.println(m1.toString());
		System.out.println(m1.getClass());
		
		Department  d1=new Department();
		d1.deptId=1002;
		d1.deptName="CSE";
		d1.getDeptData();
		//d1.mId=102;
		
		Department d2=new HR();
		d1.deptId=1002;
		d1.deptName="CSE";
		d1.getDeptData();
		//d1.hrId=102;
		
	   //HR  hr=new Department();
	  
	   HR  hr1=new HR();
	   Department  d3=hr1;
	   HR hr2=(HR)d3;
		*/
		
		HR  hr1=new HR();
		hr1.getDeptData();
	}
}
