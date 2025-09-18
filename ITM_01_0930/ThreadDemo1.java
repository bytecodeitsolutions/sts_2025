//Defining a thread by extending Thread class
class MyThread extends Thread
{
	public void run(){
		Thread  obj=Thread.currentThread();
			String name=obj.getName();
			for (int i=0;i<5 ;i++ )
			{
				System.out.println("run() is line ko kaun execute kiya? "+name);
			}
		
	}
}
class ThreadDemo1 
{
	public static void main(String[] args) 
	{
		MyThread  mt1=new MyThread();
		Thread t1=new Thread(mt1);
		t1.run();
		Thread  obj=Thread.currentThread();
		String name=obj.getName();
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("main() is line ko kaun execute kiya? "+name);
		}
		
	}
}
/*
   Case-1: 
   Case-2:
   Case-3:
   Case-4:
   Case-5:
   Case-6:
   Case-7:
   Case-8:
*/