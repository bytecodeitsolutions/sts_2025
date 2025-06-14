
class  PolyDemo2
{
	public static void main(String[] args) 
	{
		String user=new String("rajA");
		String pass=new String("raja");
		
		System.out.println(user);
		System.out.println(pass);
		
		if (user.equals(pass))
		{
			System.out.println("you have logged in successfully");
		}
		else{
			System.out.println("invalid user id and password");
		}
		
		StringBuffer user1=new StringBuffer("rajA");
		StringBuffer pass1=new StringBuffer("raja");
		
		System.out.println(user1);
		System.out.println(pass1);
		
		if (user1.equals(pass1))
		{
			System.out.println("you have logged in successfully");
		}
		else{
			System.out.println("invalid user id and password");
		}
	}
}
