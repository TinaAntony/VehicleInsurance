package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {
	@FindBy(id="nav_automobile")
	WebElement link_Automobile;
	
	@FindBy(id="nav_truck")
	WebElement link_Truck;
	
	@FindBy(id="nav_motorcycle")
	WebElement link_Motorcycle;
	
	@FindBy(id="nav_camper")
	WebElement link_Camper;

	//Constructor
	public HomePageObjects()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnAutomobileLink()
	{
		link_Automobile.click();
	}
	
	public void clickOnTruckLink()
	{
		link_Truck.click();
	}
	
	public void clickOnMotorcycleLink()
	{
		link_Motorcycle.click();
	}
	
	public void clickOnCamperLink()
	{
		link_Camper.click();
	}

}
