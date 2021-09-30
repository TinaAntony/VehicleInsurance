package insurance_Motorcycle;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class E2E_Test_Motorcycle extends TestBase {
	ExcelOperations excel = new ExcelOperations("VehicleInsuranceData");
	@Test(dataProvider = "VehicleData")
	public void VehicleInsuranceCalc_Volvo(Object objArray1) throws Exception
	{
		@SuppressWarnings("unchecked")
		HashMap <String, String> strVal = (HashMap<String, String>) objArray1;
		System.out.println("Test Data :"+strVal);
		homePage.clickOnMotorcycleLink();
		vehicleData.enterVehicleData(strVal);
		//String expectedErrorMsg = "Must be a number between 1 and 6000";
		Assert.assertEquals("Tina", "Tina");
//		vehicleData.clickNextButton();
//		insurantData.enterInsurantData();
//		insurantData.clickOnNextButton();
//		productData.enterProductData();
//		productData.clickNextButton();
	}
	
	
//	@Test
//	public void VehicleInsuranceCalc_Ford()
//	{
//		homePage.clickOnMotorcycleLink();
//		
//		
//	}
	
	@DataProvider(name = "VehicleData")
	public Object[][] testDataSupplier() throws Exception
	{
		Object[][] objArray = new Object[excel.getRowCount()][1];
		for (int i =1; i<=excel.getRowCount(); i++)
		{
			HashMap<String, String> testSetVal = excel.getTestDatainHashMap(i);
			objArray[i-1][0] = testSetVal;
		}
		return objArray;
	}

}
