package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		
		r=ws.getRow(0);
		c=r.getCell(2);
		c.setCellValue("abc");
		
		
		r=ws.getRow(1);
		c=r.createCell(2);
		c.setCellValue("xyz");
		
		r=ws.createRow(4);
		c=r.createCell(0);
		c.setCellValue("def");
		
		FileOutputStream f=new FileOutputStream("c:\\users\\sai\\desktop\\Book1.xlsx");
		wb.write(f);
		
		
		
		
		

	}

}
