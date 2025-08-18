class ThreadDemo4 
{
	public static void main(String[] args) 
	{
		Runnable r1=new Runnable(){
	@Override
	public void run(){
		for (int i=0;i<=10 ;i++ )
		{
			 System.out.println("samosa khao ::"+Thread.currentThread().getName());
		}
	}
		};
		
		System.out.println(r1.getClass().getName());
		Thread  obj=new Thread(r1);
		obj.start();
		
		
		for (int i=0;i<=10 ;i++ )
		{
			 System.out.println("samosa bnao ::"+Thread.currentThread().getName());
		}
	}

}
