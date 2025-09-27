/*
   Types of import:
   ---------------
   implicit import:
   ----------------
   means all the clasess and interfaces are available in our current program.
   
   syntax:-
   import packagename.*;
   
   ===============================================================
   Explict import 
      means only that class or interface is avilable in our program
	  
	  syntax:
	  
	  import packagename.ClassName;
	  import packagename.InterfaceName;
	  
	  priority==>
	  package==>sub packages
	  
	  
	  =============================================================
	  static import:
	  --------------
*/
//import static java.lang.Integer.MAX_VALUE;//2
import static java.lang.Byte.*;//3
class ImportDemo1 
{
	//static int  MAX_VALUE=10;//1
	public static void main(String[] args) 
	{
		System.out.println(MAX_VALUE);
	}
}
