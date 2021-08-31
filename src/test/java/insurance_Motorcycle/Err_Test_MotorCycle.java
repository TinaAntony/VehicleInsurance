package insurance_Motorcycle;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class Err_Test_MotorCycle extends TestBase{
	
	@Test
	public void Err_MsgForCylindarCap()
	
	{
		homePage.clickOnMotorcycleLink();
		vehicleData.enterCylindricalCap("30000");
		test.log(Status.PASS, "Cyclindar capacity entered as 30000");
		String actualErrorMsg = vehicleData.getErrorMsgOnCylinderCapacity();
		String expectedErrorMsg = "Must be a number between 1 and 2000";
		Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
	}

}
