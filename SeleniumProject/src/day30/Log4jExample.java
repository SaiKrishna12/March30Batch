package day30;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Log4jExample {

	private static Logger log=Logger.getLogger(Log4jExample.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser launched");
		driver.get("http://opensource.demo.orangehrm.com/");
		log.info("Navigated to orangehrm");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		log.info("Entered username");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		log.info("Entered password");
		driver.findElement(By.id("btnLogin")).click();
		log.info("Clicked on login");
		Sleeper.sleepTightInSeconds(4);
		String exptext="Welcome Adm";
		String acttext=driver.findElement(By.id("welcome")).getText();
		if(exptext.equals(acttext))
		{
			log.info("Login succesfull");
		}
		else
		{
			log.error("Login unsuccesfull");
		}
	}

}
