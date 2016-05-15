package day29.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class SelectaFlight  extends Constants{
	@Test
	public void selectFlightTest()
	{
		driver.findElement(By.xpath("//input[@value='Unified Airlines$363$281$11:24']"))
		                                                                        .click();
		driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']"))
		                                                                        .click();
		driver.findElement(By.name("reserveFlights")).click();
	}

}
















