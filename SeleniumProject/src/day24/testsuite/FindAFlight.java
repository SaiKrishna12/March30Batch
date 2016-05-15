package day24.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FindAFlight  extends Constants{
	@Test
	public void findAFlightTest()
	{
		driver.findElement(By.name("passCount")).sendKeys("2");
		driver.findElement(By.name("fromPort")).sendKeys("Paris");
		driver.findElement(By.name("findFlights")).click();
	}

}
















