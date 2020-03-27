package org.infy.lex;

public class ThreadClass  extends Thread{
	
	
	public ThreadClass(){
		
		System.out.println(Thread.currentThread().getPriority());
	}

}
