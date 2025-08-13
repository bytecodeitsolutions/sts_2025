/*
  import statement
    why??
	 java library:
	   |-packages (folders)
	      java.util
		  java.lang====>default package
		  java.sql
		  java.text
		  java.security
		  java.io
		  
		  current working directory==>default package
  
  
  Implicit import:
  ----------------
  import  packagename.*;
  eg:
  import java.util.*;
  import java.sql.*;
  
  explicit import:
  ----------------
  
  import  packagename.ClassName;
  import  java.util.Collection;
  
  ==============================================
  static import: java 1.5v
  -------------------------
  
*/
import static java.lang.System.out;
import static java.lang.Integer.*;
class  Car
{
	public static void main(String[] args) 
	{
		out.println("hello");
		out.println("hello");
		out.println("hello");
		out.println("hello");
		out.println("hello");
		out.println(MAX_VALUE);
		out.println(MIN_VALUE);
	}
}
