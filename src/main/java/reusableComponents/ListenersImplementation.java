package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testBase.objectsRepo;

public class ListenersImplementation extends objectsRepo implements ITestListener{

	

	

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case :"+ result.getMethod().getMethodName() +" is failed");
		test.log(Status.FAIL, result.getThrowable());
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy hh-mm-ss");
		Date date = new Date();
		String actualdate = format.format(date);
		String screenshotpath = System.getProperty("user.dir")+"/Reports/Screenshots/"+actualdate+".jpeg";
		File destination = new File(screenshotpath);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenshotpath, "Test case failure screenshot");
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case :"+ result.getMethod().getMethodName() +" is passed");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy hh-mm-ss");
		Date date = new Date();
		String actualdate = format.format(date);
		String screenshotpath = System.getProperty("user.dir")+"/Reports/Screenshots/"+actualdate+".jpeg";
		File destination = new File(screenshotpath);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(screenshotpath, "Test case failure screenshot");
		
	}
	
	public void onStart(ITestContext context) {
		extent = ExtentSetup.setUpExtentReport();		
	}
	public void onFinish(ITestContext context) {
		extent.flush();		
	}
	
	
	

}
