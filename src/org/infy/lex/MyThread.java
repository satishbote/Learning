package org.infy.lex;

public class MyThread  implements Runnable{
	
	MyThread(){
		
		System.out.println("new thread is created"); //line1
		
	}

	@Override
	public void run() {
		try{
			System.out.println("Am from Mythread");
			Thread.sleep(1000);			
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
	}

}
