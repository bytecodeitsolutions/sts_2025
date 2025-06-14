/*
  Polymorphism:
  ------------
  
  Poly-->many
  Morphism-->Forms
  
  many forms
  
  |-aplog ki life me -->
  |-apni--->trainer---->
  
  |-programming---many forms
  
  same name different behaviour
  
*/
import java.util.*;
class PolyDemo1 
{
	public static void main(String[] args) 
	{
		Set  hs=new HashSet();
		hs.add(10);
		hs.add(1);
		hs.add(100);
		hs.add(5);
		hs.add(4);
		hs.add(9);
		hs.add(4);
		hs.add(9);
		System.out.println(hs);
		
		Set  lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(1);
		lhs.add(100);
		lhs.add(5);
		lhs.add(4);
		lhs.add(9);
		lhs.add(4);
		lhs.add(9);
		System.out.println(lhs);
		
		Set  ts=new TreeSet();
		ts.add(10);
		ts.add(1);
		ts.add(100);
		ts.add(5);
		ts.add(4);
		ts.add(9);
		ts.add(4);
		ts.add(9);
		System.out.println(ts);
	}
}
