package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectClassExample {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
	}
	
	@Test
	public void dropdownTest()
	{
		Sleeper.sleepTightInSeconds(2);
		driver.switchTo().frame("iframeResult");
		Sleeper.sleepTightInSeconds(5);
		WebElement drop=driver.findElement(By.name("cars"));
		Select select=new Select(drop);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		
		driver.findElement(By.xpath("html/body/form/input")).click();
	}

}
