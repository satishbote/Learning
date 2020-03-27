package org.infy.lex;

public class Q19App {

	public static void main(String[] args) {

		Running r=new Running();
		Thread t= new Thread(r);
		t.start();
		
		System.out.println(t.getState()+ " ");
		
		try{
			t.sleep(100);
			System.out.println(t.getState());			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
