package com.itm.factory;
import com.itm.inter.impl.*;
import com.itm.inter.Area;
public class AreaFactory 
{
	
	private static Area area=null;
	public static Area getArea(String  s) 
	{
		if (s.equals("circle"))
		{
			area=new Circle();
		}
		else if (s.equals("square"))
		{
			area=new Square();
		}
		else if (s.equals("triangle"))
		{
			area=new Triangle();
		}
		else{
			area=null;
		}
		return area;
		
	}
}
