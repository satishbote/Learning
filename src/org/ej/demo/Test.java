package org.ej.demo;


public class Test extends AbstractTest{

	int rollno;
	
	Test(String name, int age,int rollno)
	{
		super(name, age);
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test("satish",34,105);
		t1.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(name+" "+age+" "+rollno);
		
	}

}
