package org.ej.demo;


public class Apple extends Fruit{

	public void display()
	{
		System.out.println("i am from apple class");
		
	}
	
	public static void main(String[] args)
	{
		/*Apple a=new Apple();
		a.display();*/
		
		/*Apple b=(Apple) new Fruit();
		b.display();*/
		
		Fruit f=new Apple();
		f.display();
	}

	
}

