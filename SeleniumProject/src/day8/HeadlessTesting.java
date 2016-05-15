package day8;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadlessTesting {

	
	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://google.com");
		Sleeper.sleepTightInSeconds(4);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
