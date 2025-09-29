import java.util.Scanner;
class TooOldException extends RuntimeException //unchecked exception
{
	TooOldException(String msg){
		super(msg);
	}
}
class TooYoungException extends Exception //checked exception
{
	TooYoungException(String msg){
		super(msg);
	}
}
class CustomExceptionApp 
{
	public static void main(String[] args) throws TooYoungException
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your age to check marriage eligility");
		
		int  age=s1.nextInt();
		
		if (age<21)
		{
			try{
			    throw new TooOldException("tumhari age bhut jayada hai -koi matching ka bcha nhi hai");
			}catch(TooOldException  toe){
				System.out.println("meri shadi nhi huyi to mai jaan de dunga");
			}
		}
		
		else if (age>30)
		{
			throw new TooYoungException("aur wait kro kuch year=>swarg me pair jane wala hai aur sadi ki padi hai");
		}
		else{
			System.out.println("You are eligible for marry=wait someone is coming for you");
		}
	}
}
