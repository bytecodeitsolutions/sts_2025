class Bus
{
	Student[]  students;
}

class Student
{
	int  rno;
	String name;
	String address;
	String course;
	double fee;
	
	static Student[] getStudentData(){
		Student  s1=new Student();
		
		
		Student  s2=new Student();
		s2.rno=102;
		s2.name="Raja";
		s2.address="Gwalior";
		s2.course="MBA";
		s2.fee=50000;
		
		Student[]  x=new Student[10];
		x[0]=s1;
		x[1]=s2;
		return x;
	}
}
class Teacher 
{
	public static void main(String[] args) 
	{
		Student[]  obj=Student.getStudentData();
		System.out.println(obj[1].rno);
		System.out.println(obj[1].name);
		System.out.println(obj[1].address);
		System.out.println(obj[1].course);
		System.out.println(obj[1].fee);
	}
}
