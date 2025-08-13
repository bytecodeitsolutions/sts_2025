/*
   java source file structure:
   ---------------------------
 import statement
     |-impilict import
	 |-explicit import
|-static import
		 |-static implicit
		 |-static explicit
 
 package statement
 
 ================================================================
 
 member modifiers
    |-public
	|-private
	|-protected
	|-default
	
	
 class modfifiers
    |-public
	|-default
	|-final
	|-abstract
	|-strictfp
	
|-interface
    |-
*/


class  Test1
{
	public static void main(String[] args) 
	{
		System.out.println("Test1");
	}
}

public class  Test2 extends Test1
{
	public static void main(String[] args) 
	{
		System.out.println("Test2");
	}
}

class  Test3
{
	public static void main(String[] args) 
	{
		System.out.println("Test3");
	}
}

class  Test4
{
	
}
