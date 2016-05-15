package day29.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class BookAFlight  extends Constants{
	@Test
	public void bookFlightTest()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("Sai");
		driver.findElement(By.name("buyFlights")).click();
	}

}

















