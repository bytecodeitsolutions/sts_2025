/*

        String s1="java";
		String s2=new String("java");
		StringBuffer s3=new StringBuffer("java");
		StringBuilder s4=new StringBuilder("java");
		System.out.println("s1="+s1 +" s2="+s2+" s3="+s3 +" s4="+s4);
		
   Difference between String and StringBuffer
   -------------------------------------------
   1. String class object is immutable and StringBuffer class object is mutable.
   
		String  s1="java";
		System.out.println(s1);
		String s2=s1.concat("training");
		System.out.println(s2);
		
		===========================================
		StringBuffer s1=new StringBuffer("java");
		System.out.println(s1);
		s1.append("training");
		System.out.println(s1);
		
  2. equals()
  
  ===================================================================
  
  What is the difference between 
  =====================================
  String  s1="java";
  String  s2=new String("java");
  =================================================
  StringBuffer  s2=new StringBuffer("java");
		StringBuffer  s3=s1;
		
		String  s4="java";
		String  s5="Java";
   
*/
class StringDemo2 
{
	public static void main(String[] args) 
	{
		StringBuffer  s1=new StringBuffer("java");
		
		System.out.println(s4.equals(s5));
		
	}
}
