package day28;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import org.openqa.selenium.support.PageFactory;
import day28.pageclasses.WelcomeMercuryTours;

public class TestCases1 {
	@Test
	public void loginTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		//page class object creation
		WelcomeMercuryTours wm=PageFactory.initElements
				             (driver, WelcomeMercuryTours.class);
		wm.findAFlight("admin","admin");
	}
}


