package org.ej.demo;


public class Child extends Parent {
	
	
	
	public void display()
	{
		super.display();
		System.out.println("Viraj");
	}
	
	

	public static void main(String[] args) {

		Child c=new Child();
		c.display();
		
	}
	
	

}
