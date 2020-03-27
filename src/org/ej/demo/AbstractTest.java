package org.ej.demo;

abstract class AbstractTest {

	String name;
	int age;
	
	AbstractTest(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
 void display()
	{
		System.out.println(name+""+age);
	}
	

}
