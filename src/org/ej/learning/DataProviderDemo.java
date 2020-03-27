package org.ej.learning;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class DataProviderDemo {
	
	@Test(dataProvider="getData")
	public void setData(String user)
	{
		
		System.out.println(user);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {{"user1, p1"},{"pass1"}};
	}
	

}
