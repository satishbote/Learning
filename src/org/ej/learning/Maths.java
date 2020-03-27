package org.ej.learning;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Maths {
	
	
	@BeforeSuite
	public void display()
	{
		System.out.println("Before suite executed");
	}
	@AfterSuite
	public void display1()
	{
		System.out.println("After suite executed");
	}
	
	@BeforeTest
	public void display2()
	{
		System.out.println("Before Test executed");
	}
	
	@AfterTest
	public void display22()
	{
		System.out.println("After test executed");
	}
	
	@BeforeClass
	public void display3()
	{
		System.out.println("Before class math123 executed");
	}
	
	@AfterClass
	public void display33()
	{
		System.out.println("After class math123 executed");
	}
	
	@BeforeMethod
	public void display4()
	{
		System.out.println("Before method math123 executed");
	}
	
	@AfterMethod
	public void display44()
	{
		System.out.println("After method math123 executed");
	}
	
	@BeforeGroups(value={"group1", "group3"})
	public void display5()
	{
		System.out.println("before groups executed");
	}
	
	@AfterGroups(value="group1")
	public void display55()
	{
		System.out.println("after groups executed");
	}

	@Parameters({"num1","num2"})
	@Test(groups="group1", invocationCount=1)
	public void add(int num1, int num2)
	{
		int sum;
		sum=num1+num2;
		int expected=222;
		
		Assert.assertEquals(sum, expected);
		
		System.out.println("Addition = "+sum);
		
		/*SoftAssert sa= new SoftAssert();
		sa.assertEquals(sum, expected);
		
		System.out.println("Addition = "+sum);
		
		//sa.assertAll();
*/	}
	

	@Parameters({"num1","num2"})
	@Test(groups="group1")
	public void subtract(int num1, int num2)
	{
		int sub;
		sub=num1-num2;
		int expected=-20;
		System.out.println("Subtraction = "+sub);
		Assert.assertEquals(sub, expected);
	}
	

	@Parameters({"num1","num2"})
	@Test(groups="group2")
	public void multiply(int num1, int num2)
	{
		int mul;
		mul=num1*num2;
		int expected=12000;
		System.out.println("Multiplication = "+mul);
		Assert.assertEquals(mul, expected);
	}

	@Parameters({"num1","num2"})
	@Test(groups="group2")
	public void division(int num1, int num2)
	{
		int div;
		div=num1/num2;
		int expected=0;
		System.out.println("Division = "+div);
		Assert.assertEquals(div, expected);
	}
	
}

