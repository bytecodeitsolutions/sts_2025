class VarArgDemo1
{
	static void m1(int[][]...  s){
		//System.out.println(s);
	}
	
}
class VarArgMethodDemo1 
{
	public static void main(String... args) 
	{
		int[][][] a=new int[1][2][3];
		VarArgDemo1.m1(a);
		System.out.println(a[0][0][0]);
		int[]  x=new int['a'];
		System.out.println(x[96]);
	}
}
