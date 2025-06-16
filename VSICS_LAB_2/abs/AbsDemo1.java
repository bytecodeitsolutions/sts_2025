package org.vsicskanpur.main;
import org.vsicskanpur.user.*;//implicit import
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import org.vsicskanpur.factory.*;
class AbsDemo1 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(in);
		out.println("please enter M or U");
		String  user=s1.next();
		User  u=UserFactory.getUser(user);
		u.setData();
	    u.getData();
	}
}
