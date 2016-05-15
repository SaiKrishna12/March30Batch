package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CaptchaAutomation {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		int b=1;
		while(b<=10)
		{
			driver.get("http://www.harvard.edu/feedback");
		
			driver.findElement(By.id("edit-submitted-name")).sendKeys("Tester");
			driver.findElement(By.id("edit-submitted-email")).sendKeys("tester@gmail.com");
			driver.findElement(By.id("edit-submitted-comment")).sendKeys("Stupid change the capthca");
			String x=driver.findElement(By.className("field-prefix")).getText();
			String[] a=x.split(" ");
			int i=Integer.parseInt(a[0]);
			int j=Integer.parseInt(a[2]);
			int k=i+j;
			String str=Integer.toString(k);
			driver.findElement(By.id("edit-captcha-response")).sendKeys(str);
			Sleeper.sleepTightInSeconds(5);
			//driver.findElement(By.name("op")).click();
		}
		
		
		
		
		
	}

}
