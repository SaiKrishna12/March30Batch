package day28.pageclasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Menu {
	@FindBy(linkText="Home")
	WebElement home;
	public void home()
	{
		home.click();
	}
	@FindBy(linkText="Flights")
	WebElement flights;
	public void flights()
	{
		flights.click();
	}
	@FindBy(linkText="Hotels")
	WebElement hotels;
	public void hotels()
	{
		hotels.click();
	}
	@FindBy(linkText="Car Rentals")
	WebElement carRentals;
	public void carRentals()
	{
		carRentals.click();
	}
	@FindBy(linkText="Cruises")
	WebElement cruises;
	public void cruises()
	{
		cruises.click();
	}
	@FindBy(linkText="Destinations")
	WebElement destinations;
	public void destinations()
	{
		destinations.click();
	}
	@FindBy(linkText="Vacations")
	WebElement vacations;
	public void vacations()
	{
		vacations.click();
	}
}
