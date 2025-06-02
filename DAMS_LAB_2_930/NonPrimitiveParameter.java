class Student
{
	int  id;
	String userName;
	String password;
	String address;
	long contact;
	
	void viewStudentData(Student x){
		System.out.println(x.id);
		System.out.println(x.userName);
		System.out.println(x.password);
		System.out.println(x.contact);
		System.out.println(x.address);
		
	}
	
	void isValidStudent(Student  s){
		if (s.userName.equals("raja")  && s.password.equals("rani"))
		{
			System.out.println(s.userName +" is a valid student");
		}
		else{
			System.out.println(s.userName +" is not a valid student");
		}
	}
}

class StudentLoginSystem
{
	void  login(Student  obj){
		obj.viewStudentData(obj);
		obj.isValidStudent(obj);
	}
}
class  NonPrimitiveParameter
{
	public static void main(String[] args) 
	{
		Student  s1=new Student();
		s1.id=111;
		s1.userName="raja";
		s1.password="ranI";
		s1.address="Govind Nagar";
		s1.contact=32645346L;
		
		StudentLoginSystem  obj=new StudentLoginSystem();
		obj.login(s1);
		
	}
}
