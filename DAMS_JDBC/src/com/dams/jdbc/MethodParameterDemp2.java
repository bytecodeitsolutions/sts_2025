package com.dams.jdbc;

 /*
Parameter:
----------
datatype + local variable

primitive(byte, short , int ,long , float , double,boolean , char)

non primitive (ClassType -Kutta , Animal , Chair , Student ....)
[object banana pdega]
[new ClassName() ->memory-->data+methods]

*/

class Mobile
{
	void setMobileData(String modelName,double price,String brandName){
		System.out.println(10 > 20);
	}
}
class  MethodParameterDemo2
{
	public static void main(String[] args) 
	{
		Mobile  m1=new Mobile();
		m1.setMobileData("M123",10000.0,"Nokia");
	}
}

