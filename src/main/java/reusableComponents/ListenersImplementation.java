package reusableComponents;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testBase.objectsRepo;

public class ListenersImplementation extends objectsRepo implements ITestListener{

	public void onFinish(ITestContext context) {
		
		
	}

	public void onStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
	
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case :"+ result.getMethod().getMethodName() +" is passed");
		
	}
	
	
	

}
