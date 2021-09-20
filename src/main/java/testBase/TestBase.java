package testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePageObjects;
import pageObjects.enterInsurantDataPageObjects;
import pageObjects.enterProductDataPageObjects;
import pageObjects.enterVehicleDataObjectPage;
import reusableComponents.PropertyOperations;

public class TestBase extends objectsRepo {
	
	public void lauchBrowserAndNavigate() throws Exception
	{
		String Browser = PropertyOperations.getPropertyValuebyKey("Browser");
		String url = PropertyOperations.getPropertyValuebyKey("Url");
		if (Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (Browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if (Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@BeforeMethod
	public void setupmethod() throws Exception
	{
		lauchBrowserAndNavigate();
		homePage = new HomePageObjects();
		vehicleData = new enterVehicleDataObjectPage();
		insurantData = new enterInsurantDataPageObjects();
		productData = new enterProductDataPageObjects();
	}
	@AfterMethod
	public void cleanUp()
	{
		//driver.quit();
	}
	}
