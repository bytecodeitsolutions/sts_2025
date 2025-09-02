class Test
{
	static Test  t1;
	void  m2(){
		System.out.println("m2");
	}
	
	void  m1(){
		t1.m2();
	}
}


class  CheckVariable
{
	public static void main(String[] args) 
	{
	  Test  t1=new Test();
	  t1.m1();
	}
	
}
