package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginusingProperties {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream file=new FileInputStream("E:\\March30Batch\\SeleniumProject\\OrangeHRM.properties");
		Properties pr=new Properties();
		pr.load(file);
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.cssSelector(pr.getProperty("login"))).click();
		
	}

}
