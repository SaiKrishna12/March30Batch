package day9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class ComparingScreenshots {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		File srcFile1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().refresh();
		File srcFile2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		if(FileUtils.contentEquals(srcFile1, srcFile2))
		{
			System.out.println("Images are same");
		}
		else
		{
			System.out.println("They are different");
		}
	}

}
