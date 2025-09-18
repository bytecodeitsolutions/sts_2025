//defining a thread by implementing Runnable interface
//3. defining a thread by using anonymous inner class
//4. defining a thread by using anonymous inner interface
//5. defining a thread by using lambda ->


class  ThreadDemo2
{
	public static void main(String[] args) 
	{
		Runnable r1=()->{
			System.out.println(Thread.currentThread().getName());
			};
			
			
		Thread  t1=new Thread(r1);
		t1.start();
		System.out.println(r1.getClass());
		
	}
}
