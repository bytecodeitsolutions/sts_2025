class Student
{
	static String collegeName;
	String studentName;
	int  studentId;
	static String collegeAddress;
	
	Student  getStudentData(){
		 Student  s1=new Student();
		 s1.studentName="Raja";
		 s1.studentId=111;
		 return s1;
	}
	static void getCollegeData(){
		
	}
}
class MemoryCheck 
{
	public static void main(String[] args) 
	{
		Student.getCollegeData();
		Student  s2=new Student();
		Student  s3=s2.getStudentData();
		
		System.out.println(s2.studentName);
		System.out.println(s2.studentId);
		
		System.out.println(s3.studentName);
		System.out.println(s3.studentId);
		
	}
}
