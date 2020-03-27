package org.ej.learning;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Maths1234 {

	@Parameters({"num3"})
	@Test(groups="group3") //invocationCount=10 , threadPoolSize=2
	public void sqrt(int num)
	{
		double result=Math.sqrt(num);
	
		System.out.println("Square root = "+result);
		
	}
	
	
	@BeforeClass
	public void display3()
	{
		System.out.println("Before class in math1234 executed");
	}
	
	@AfterClass
	public void display33()
	{
		System.out.println("After class in math1234 executed");
	}
	
/*	@BeforeMethod
	public void display4()
	{
		System.out.println("Before method math1234 executed");
	}
	
	@AfterMethod
	public void display44()
	{
		System.out.println("After method math1234 executed");
	}*/
}
