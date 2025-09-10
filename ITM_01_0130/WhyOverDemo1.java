/*
  Why overriding???
  =================
  
  //ClassName +" @ "+hexadecimalnumber
		//getClass().getName() + "@" + Integer.toHexString(hashCode());
		//ek method hai jo Object class se by default call ho rha =>toString()
*/

class Teacher
{
	int  tId;
	String tName;
	
	Teacher(int tId,String tName){
		this.tId=tId;
		this.tName=tName;
	}
	void viewTeacherData(Teacher  obj){
		System.out.println(hashCode());
		System.out.println(obj);
		
	}
	
	public String toString(){
		return "[ teacher id="+tId +" teacher Name="+tName+" ]";
	}
}
class  WhyOverDemo1
{
	public static void main(String[] args) 
	{
		Teacher  t1=new Teacher(101,"Raja");
		Teacher  t2=new Teacher(102,"Rani");
		t1.viewTeacherData(t1);
		t2.viewTeacherData(t1);
	}
}
