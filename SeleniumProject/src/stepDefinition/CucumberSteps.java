package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps {
	static FirefoxDriver driver;
	@Given("^the browser is launched and we navigate to orangehrm$")
	public void the_browser_is_launched_and_we_navigate_to_orangehrm() throws Throwable {
	   driver=new FirefoxDriver();
	   driver.get("http://opensource.demo.orangehrm.com/");
	}

	@When("^we enter the username and password$")
	public void we_enter_the_username_and_password() throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^it should display welcome admin msg$")
	public void it_should_display_welcome_admin_msg() throws Throwable {
	    String expmsg="Welcome Admin";
		String actmsg=driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(actmsg, expmsg);
	}
	
	@When("^we click on welcome admin$")
	public void we_click_on_welcome_admin() throws Throwable {
	    Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.id("welcome")).click();
	}

	@When("^also click on logout link$")
	public void also_click_on_logout_link() throws Throwable {
		Sleeper.sleepTightInSeconds(5);
	   driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^it should navigate to home page$")
	public void it_should_navigate_to_home_page() throws Throwable {
	    Sleeper.sleepTightInSeconds(4);
		String expurl="http://opensource.demo.orangehrm.com/index.php/auth/login";
	    String acturl=driver.getCurrentUrl();
	    Assert.assertEquals(acturl, expurl);
	}





}
