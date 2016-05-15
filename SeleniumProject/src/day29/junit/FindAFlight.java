package day29.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class FindAFlight  extends Constants{
	@Test
	public void findAFlightTest()
	{
		driver.findElement(By.name("passCount")).sendKeys("2");
		driver.findElement(By.name("fromPort")).sendKeys("Paris");
		driver.findElement(By.name("findFlights")).click();
	}

}
















