package com.orangrehrm.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	public void loginPanel(String username,String password)
	{
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		login.click();
	}
	

}
