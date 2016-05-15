package day23;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void logoinTest() throws IOException
	{
		LoginKeywords keys=new LoginKeywords();
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
				if(action.equals("launchBrowser"))
				{
					keys.launchBrowser();
				}
				else if(action.equals("navigate"))
				{
					keys.navigate();
				}
				else if(action.equals("enterUsername"))
				{
					keys.enterUsername();
				}
				else if(action.equals("enterPassword"))
				{
					keys.enterPassword();
				}
				else if(action.equals("clickLogin"))
				{
					keys.clickLogin();
				}
			}
		}
	}

}
