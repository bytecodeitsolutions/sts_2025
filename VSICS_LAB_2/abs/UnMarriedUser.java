package org.vsicskanpur.user.um;
import org.vsicskanpur.user.User;//explicit import
public class  UnMarriedUser implements User
{
	public void setData(){
		System.out.println("unmarried user data stored into db");
	}
	public void getData(){
		System.out.println("unmarried user data fetching");
	}
}
