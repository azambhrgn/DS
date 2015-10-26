package com.az.thread;



class ThreadRunnable implements Runnable{

	
	int count=0;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++)
		{
		System.out.println("hello "+count+" "+Thread.currentThread().getName());
		count++;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}
	
	public void start(String name)
	{
		Thread t=new Thread(this,name);
	
			t.start();
		
			
		
		
	}
	
	
}






public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnable r=new ThreadRunnable();
		r.start("A");
		r.start("B");

	}

}
