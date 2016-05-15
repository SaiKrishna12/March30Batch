package com.orangrehrm.baseclass;

import org.openqa.selenium.WebDriver;

import atu.testrecorder.ATUTestRecorder;

import com.orangrehrm.utilty.ExcelOperations;
import com.orangrehrm.utilty.Screenshots;

public class Constants {
	
	static WebDriver driver=null;
	static ATUTestRecorder recorder=null;
	ExcelOperations eo=new ExcelOperations();
	String empList="E:\\March30Batch\\OrangeHRM\\src\\com\\orangrehrm\\excelfiles\\EmployeeList.xlsx";
	String location="E:\\March30Batch\\OrangeHRM\\src\\com\\orangrehrm\\screenshots\\";
	String dataEngine="E:\\March30Batch\\OrangeHRM\\src\\com\\orangrehrm\\dataengine\\DataEngine.xlsx";
	Screenshots scr=new Screenshots();
}
