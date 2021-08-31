package insurance_Motorcycle;

import org.testng.annotations.Test;

import testBase.TestBase;

public class E2E_Test_Motorcycle extends TestBase {
	@Test
	public void VehicleInsuranceCalc_Volvo() throws Exception
	{
		homePage.clickOnMotorcycleLink();
		vehicleData.enterVehicleData();
		vehicleData.clickNextButton();
		insurantData.enterInsurantData();
		insurantData.clickOnNextButton();
		productData.enterProductData();
		productData.clickNextButton();
	}
	
	
//	@Test
//	public void VehicleInsuranceCalc_Ford()
//	{
//		homePage.clickOnMotorcycleLink();
//		
//	}

}
