package demo;

/*
 * java.lang.Runnable (I)
 *       |-public abstract void run();//----------------
 *       
 *    class Thread implements Runnable
 *       public void run(){
 *          //empty body
 *       }
 * */

public class ThreadDemo1 {

	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("our thread");
				
			}
		};
		
		
		System.out.println(r1.getClass().getName());

		Thread t1 = new Thread(r1);
		t1.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("main thread ::" + Thread.currentThread().getName());
		}

	}

}
