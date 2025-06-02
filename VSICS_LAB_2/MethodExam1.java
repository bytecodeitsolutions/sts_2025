class Student
{
	int rno;
	String name;
	static String collegeName;
	
}

class Teacher
{
	 Student  s2;
	 String getStudentName(){
		return s2.name;
	 }
	 
	 String getCollegeName(){
		return Student.collegeName;
	 }
	 
	 Student getStudentData(Student  s1){
		 s2=s1;
		return s1;
	 }
}
class MethodExam1 
{
	public static void main(String[] args) 
	{
		Student  s1=new Student();
		s1.rno=101;
		s1.name="Raja";
		Student.collegeName="VSICS";
		
		Teacher  t1=new Teacher();
		Student  obj=t1.getStudentData(s1);
		System.out.println(obj.name);
		
		System.out.println(t1.getStudentName());
		System.out.println(t1.getCollegeName());
		
	}
}
