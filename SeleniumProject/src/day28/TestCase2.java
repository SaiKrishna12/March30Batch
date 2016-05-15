package day28;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import day28.pageclasses.Menu;
import day28.pageclasses.RegisterMercuryTours;
import day28.pageclasses.WelcomeMercuryTours;

public class TestCase2 {
	@Test
	public void registrationTest()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WelcomeMercuryTours wm=PageFactory.initElements(driver,WelcomeMercuryTours.class);
		Menu menu=PageFactory.initElements(driver,Menu.class);
		RegisterMercuryTours rm=PageFactory.initElements(driver,RegisterMercuryTours.class);
		
		wm.register();
		rm.contactInfromation();
		menu.home();
		wm.findAFlight("tutorial","tutorial");
	}

}








