package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.HomePageObjects;
import pageObjects.enterInsurantDataPageObjects;
import pageObjects.enterProductDataPageObjects;
import pageObjects.enterVehicleDataObjectPage;
import reusableComponents.commonMethods;

public class objectsRepo {
	public static WebDriver driver;
	public static HomePageObjects homePage;
	public commonMethods cm = new commonMethods();
	public static enterVehicleDataObjectPage vehicleData;
	public static enterInsurantDataPageObjects insurantData;	
	public static ExtentReports extent;	
	public static ExtentTest test;
	public static enterProductDataPageObjects productData;

}
