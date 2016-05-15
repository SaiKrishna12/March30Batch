package com.orangrehrm.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangrehrm.pageclasses.AddEmployeePage;
import com.orangrehrm.pageclasses.Menu;

public class AddEmployee  extends Constants{
	@Test
	public void addEmpTest() throws IOException
	{
		
		int rowCount=eo.getRowCount(empList,0);
		Menu menu=PageFactory.initElements(driver,Menu.class);
		AddEmployeePage aep=PageFactory.initElements(driver,AddEmployeePage.class);
		String runMode=eo.getCellData(dataEngine, 0,2,2);
		if(runMode.equals("N"))
			throw new SkipException("AddEmp Testcase skipped");
		for(int i=1;i<=rowCount;i++)
		{
			Row r=eo.getRow(empList,0,i);
			Sleeper.sleepTight(5);
			menu.pim();
			aep.addEmployee(r);
		}
	}

}
