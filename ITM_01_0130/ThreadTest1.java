/*
    Multi-Threading:
	---------------
	Defining , instantiating and executing a Thread by using Thread class
	======================================================================
	
	Defining , instantiating and executing a Thread by using Runnable interface
	
*/

//Thread definition 
class MyThread extends Thread
{
	public void run(){
		m1();
	}
	
	void m1(){
		System.out.println("This  task executed by our thread  in m1()"+Thread.currentThread().getName());
	}
	
}
class  ThreadTest1
{
	public static void main(String[] args) 
	{
		MyThread  mt=new MyThread();//This is instatiation of thread
		mt.start();//this is creation of thread
		
	
			System.out.println("This  task executed by main thread "+Thread.currentThread().getName());
	}
}

/*
   Case-1: if we are not overrding the run() method
   -------
   Case-2: 
   Case-3:
   Case-4:
   Case-5:
   Case-6:
*/
