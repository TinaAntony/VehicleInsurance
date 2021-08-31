package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class enterInsurantDataPageObjects extends TestBase{
	
	@FindBy(id="firstname")
	WebElement txt_firstname;
	
	@FindBy(id="lastname")
	WebElement txt_lastname;
	
	@FindBy(id="birthdate")
	WebElement date_birthdate;
	
	//radio button
	@FindBy(xpath="//*[@name='Gender']/parent::label")
	List<WebElement> radio_gender;
	
	@FindBy(id="streetaddress")
	WebElement txt_streetaddress;
	
	@FindBy(id="country")
	WebElement dd_country;
	
	@FindBy(id="zipcode")
	WebElement txt_zipcode;
	
	@FindBy(id="city")
	WebElement txt_city;
	
	@FindBy(id="occupation")
	WebElement dd_occupation;
	
	//checkbox
	//String hobbies = "";
	@FindBy(xpath="//*[@name='Hobbies']/parent::label")
	List <WebElement> chkbox_hobbies;
	
//	@FindBy(id="website")
//	WebElement txt_website;
//	
//	@FindBy(id="button")
//	WebElement btn_button;
	
	//how to enter value
	
	@FindBy(id="nextenterproductdata")
	WebElement btn_next;
	
	public enterInsurantDataPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterInsurantData() throws Exception
	{
		txt_firstname.sendKeys("John");
		txt_lastname.sendKeys("MacQualy");
		date_birthdate.sendKeys("12/12/1990");
		cm.selectRadioButtonValue(radio_gender, "Female");
		txt_streetaddress.sendKeys("Albert st");
		cm.selectDropDownOptions(dd_country, "Albania");
		txt_zipcode.sendKeys("200123");
		txt_city.sendKeys("London");
		cm.selectDropDownOptions(dd_occupation, "Employee");
		cm.selectRadioButtonValue(chkbox_hobbies, "Bungee Jumping");
	}
	
	public void clickOnNextButton()
	{
		btn_next.click();
	}

}
