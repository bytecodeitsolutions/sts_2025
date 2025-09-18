//3. defining a Thread by using anonymous inner class
//4. defining a Thread by using anonymous inner interface
//5. by using lambda


	
class  ThreadTest2
{
	public static void main(String[] args) 
	{
		
		Thread  obj1=Thread.currentThread();
		//obj1.setPriority(9);
		int  value=obj1.getPriority();
		System.out.println(value);
		
		Runnable t1=()->{System.out.println("hello" +Thread.currentThread().getName());};
		
		Thread obj=new Thread(t1);
		obj.setPriority(6);
		obj.start();
		System.out.println(obj.getPriority());
	}
}
