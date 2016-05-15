package day13;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	//setting priority to test cases
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	@Test(priority=2)
	public void registration()
	{
		System.out.println("This is for registration");
	}
	
	//Ignoring test cases
	@Test(enabled=false)
	public void logoutTest()
	{
		System.out.println("This is for logout");
	}
	@BeforeMethod
	public void function()
	{
		System.out.println("ABCD");
	}
}


