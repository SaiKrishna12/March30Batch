package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClick {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	@Test
	public void rightClickTest()
	{
		Actions action=new Actions(driver);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		action.contextClick(gmail).sendKeys("L").build().perform();
	}

}
