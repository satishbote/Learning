package org.infy.lex;

public class Q18ThreadImpl {

	public static void main(String[] args) throws InterruptedException{

		
		Thread thread= new Thread();
		thread.setName("Welcome Thread"); //line1
		thread.start();
		
		System.out.println("Welcome to ");
		thread.wait(2000);     // line2
		System.out.println("Infosys");
		
		
	}

}
