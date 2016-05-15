package day24.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookAFlight  extends Constants{
	@Test
	public void bookFlightTest()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("Sai");
		driver.findElement(By.name("buyFlights")).click();
	}

}

















