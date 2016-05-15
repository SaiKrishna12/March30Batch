package headlesstesting;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadLessTesting_Htmlunit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HtmlUnitDriver  driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	}

}
