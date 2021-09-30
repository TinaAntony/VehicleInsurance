package insurance_Motorcycle;

import java.util.HashMap;

import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class E2E_ExcelDataDirect_Test_Motorcycle extends TestBase {
	ExcelOperations excel = new ExcelOperations("VehicleInsuranceData");
	@Test
	public void VehicleInsuranceCalc_Volvo1() throws Exception
	{
		HashMap <String, String> strVal = excel.getTestDatainHashMap(1);
		System.out.println("Test Data :"+strVal);
		homePage.clickOnMotorcycleLink();
		vehicleData.enterVehicleData(strVal);
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
	


}
