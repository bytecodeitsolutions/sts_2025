
class Employee
{
	String empName;
	String pass;
	
	void isValidUser(Employee x){
		if (x.empName.equalsIgnoreCase("raja") && x.pass.equals("rani"))
		{
			System.out.println(x.empName +" is a valid user");
		}
		else{
			System.out.println(x.empName +" is not a valid user");
		}
	}
	
}

class LoginSystem
{
	void  login(Employee obj){
		obj.isValidUser(obj);
	}
	
}
class ParameterDemo1 
{
	public static void main(String[] args) 
	{
		LoginSystem obj=new LoginSystem();
		
		Employee e1=new Employee();
		e1.empName="Raja";
		e1.pass="rani";
		
		obj.login(e1);
	}
}
