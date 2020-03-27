package org.infy.lex;

public class SynchronizedExample extends Thread {
	
	synchronized public void run(){
		System.out.println("start");
		try{
			Thread.sleep(100000);
		}catch(InterruptedException e){
			System.out.println("end");
		}
	}

}
