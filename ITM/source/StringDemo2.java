/*
   Difference between 
   ================================
   String s1="java";
   
   String  s1=new String("java");
   =====================================
   
   runtime operation:
   -------------------
   object creation with new
   method calling
*/
class  StringDemo2
{
	public static void main(String[] args) 
	{
		String s1=new String("java");
		String s2=s1.concat(" at itm");
		String s3="java at itm";
		System.out.println(s2==s3);//false
	}
}
