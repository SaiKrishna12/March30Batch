package com.orangrehrm.baseclass;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import atu.testrecorder.exceptions.ATUTestRecorderException;

import com.orangrehrm.pageclasses.Menu;

public class Logout  extends Constants{
	@Test
	public void logoutTest() throws IOException, ATUTestRecorderException
	{
		String runMode=eo.getCellData(dataEngine, 0,4,2);
		if(runMode.equals("N"))
			throw new SkipException("Logot Testcase skipped");
		Menu menu=PageFactory.initElements(driver,Menu.class);
		Sleeper.sleepTightInSeconds(4);
		try
		{
			menu.logout();
			recorder.stop();
		}
		catch(Exception e)
		{
			recorder.stop();
		}
	}

}
