package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class DropdownTesting2 {

	public static void main(String[] args) {
		/*ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("default");
		FirefoxDriver driver=new FirefoxDriver(fp);*/
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		System.out.println(drop.getText());
		
		
		//List<WebElement> dropdown=drop.findElements(By.tagName("option"));
		/*System.out.println(dropdown.size());
		for(int i=0;i<dropdown.size();i++)
		{
			System.out.println(dropdown.get(i).getText());
		}*/
	}

}
