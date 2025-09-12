class User
{
	String  userName;
	String  password;
	int  a;
	
	void  checkUser(){
		if (userName==password)
		{
			System.out.println("both are equal="+userName +"  "+password);
		}
		else{
			System.out.println("both are not equal "+userName +" "+password);
		}
	}
}

class  StringDemo1
{
	public static void main(String[] args) 
	{
		User  u1=new User();
		u1.userName=new String("raja");
		u1.password=new String("raja");
		u1.a=100;
		u1.checkUser();
	}
}
