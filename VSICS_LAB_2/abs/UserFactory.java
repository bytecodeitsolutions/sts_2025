package org.vsicskanpur.factory;
import org.vsicskanpur.user.*;
import org.vsicskanpur.user.um.UnMarriedUser;
public class UserFactory 
{
	public static User  user=null;
	public static User getUser(String kaunSaUserChahiye){
		if (kaunSaUserChahiye.equalsIgnoreCase("M"))
		{
			user=new MarriedUser();
		}
		else if (kaunSaUserChahiye.equalsIgnoreCase("U"))
		{
			user=new UnMarriedUser();
		}
		else{
			user=null;
		}
		return user;
	}
}
