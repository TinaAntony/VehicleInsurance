package pageObjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class enterProductDataPageObjects extends TestBase{
	
	@FindBy(id="startdate")
	WebElement date_startdate;
	
	@FindBy(id="insurancesum")
	WebElement dd_insurancesum;
	
	@FindBy(id="damageinsurance")
	WebElement dd_damageinsurance;
	
	@FindBy(xpath="//*[@name='Optional Products[]']/parent::label")
	List <WebElement> chkbox_OptionalProducts;
	
	@FindBy(id="nextselectpriceoption")
	WebElement tbn_nextselectpriceoption;
	
	public enterProductDataPageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterProductData() throws Exception
	{
		SimpleDateFormat formatdate = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String startdate = formatdate.format(date);
		date_startdate.sendKeys(startdate);
		//date_startdate.sendKeys("20/11/2020");
		cm.selectDropDownOptions(dd_insurancesum, "3.000.000,00");
		cm.selectDropDownOptions(dd_damageinsurance, "Partial Coverage");
		cm.selectCheckBox(chkbox_OptionalProducts, "Euro Protection,Legal Defense Insurance");

	}
	
	public void clickNextButton()
	{
		tbn_nextselectpriceoption.click();
	}

}
