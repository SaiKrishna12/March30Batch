package day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import day23.LoginKeywords;

public class LoginUsingReflections {
	
	LoginKeywords keys=new LoginKeywords();
	Method[] mymethods=keys.getClass().getMethods();
	@Test
	public void loginTest() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
	
	FileInputStream file=new FileInputStream("E:\\March30Batch\\SeleniumProject\\src\\com\\qedge\\keywords\\LoginKeywords.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(file);
	XSSFSheet ws=wb.getSheet("Sheet1");
	int rowCount=ws.getLastRowNum();
	for(int i=1;i<=rowCount;i++)
	{
		Row r=ws.getRow(i);
		String runMode=r.getCell(4).getStringCellValue();
		if(runMode.equals("Y"))
		{
			String action=r.getCell(3).getStringCellValue();
			executeActions(action);
		}
	}
	}
	public void executeActions(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<mymethods.length;i++)
		{
			if(action.equals(mymethods[i].getName()))
			{
				mymethods[i].invoke(keys);
			}
		}
	}

}
