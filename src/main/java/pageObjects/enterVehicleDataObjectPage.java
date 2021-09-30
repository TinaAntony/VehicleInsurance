package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class enterVehicleDataObjectPage extends TestBase {
	
	@FindBy(id="make")
	WebElement dd_make;
	
	@FindBy(id="model")
	WebElement dd_model;
	
	@FindBy(id="cylindercapacity")
	WebElement txt_cylindercapacity;
	
	
	@FindBy(id="engineperformance")
	WebElement txt_engineperformance;
	
	@FindBy(id="dateofmanufacture")
	WebElement date_dateofmanufacture;
	
	@FindBy(id="numberofseatsmotorcycle")
	WebElement dd_numberofseatsmotorcycle;
	
	@FindBy(id="listprice")
	WebElement txt_listprice;
	
	@FindBy(id="annualmileage")
	WebElement txt_annualmileage;
	
	@FindBy(id="nextenterinsurantdata")
	WebElement btn_nextenterinsurantdata;
	
	@FindBy(xpath="//*[@id='cylindercapacity']/following-sibling::span[@class='error']")
	WebElement err_CylinderCapacity;
	
	
	public enterVehicleDataObjectPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterVehicleData(HashMap <String, String> strVal) throws Exception
	{
		cm.selectDropDownOptions(dd_make, strVal.get("Make"));
		cm.selectDropDownOptions(dd_model, strVal.get("Model"));
		txt_cylindercapacity.sendKeys(strVal.get("Cylindercapacity"));
		txt_engineperformance.sendKeys(strVal.get("EnginePerformance"));
		date_dateofmanufacture.sendKeys(strVal.get("DateOfManufacture"));
		cm.selectDropDownOptions(dd_numberofseatsmotorcycle, strVal.get("NoofSeatsMotorcycle"));
		txt_listprice.sendKeys(strVal.get("Listprice"));
		txt_annualmileage.sendKeys(strVal.get("Annualmileage"));
		
	}
	
	public void clickNextButton()
	{
		btn_nextenterinsurantdata.click();
	}
	
	public void enterCylindricalCap(String strCylindricalCapacity)
	{
		txt_cylindercapacity.sendKeys(strCylindricalCapacity);
	}
	
	public String getErrorMsgOnCylinderCapacity()
	{
		System.out.println("Error message: "+err_CylinderCapacity.getText());
		return err_CylinderCapacity.getText();
	}

}
