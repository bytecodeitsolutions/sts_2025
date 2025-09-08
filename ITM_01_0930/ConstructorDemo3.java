/*
   How  ->this->  works
   -------------------
*/
class Admin
{
	int adminId;
	String adminName;
	
	Admin(int adminId1,String adminName1){
		System.out.println("before within con Admin id is="+adminId1);
		System.out.println("before with con Admin name is="+adminName1);
		adminId=adminId1;
		adminName=adminName1;
		System.out.println("within con Admin id is="+adminId);
		System.out.println("with con Admin name is="+adminName);
	}
	void disData(){
		System.out.println("Admin id is="+adminId);
		System.out.println("Admin name is="+adminName);
	}
}
class ConstructorDemo3 
{
	public static void main(String[] args) 
	{
		Admin  a1=new Admin(111,"Rani");
		a1.disData();
	}
}
