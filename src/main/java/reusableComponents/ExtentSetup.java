package reusableComponents;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.objectsRepo;

public class ExtentSetup extends objectsRepo {
	
	
	public static ExtentReports setUpExtentReport()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yy hh-mm-ss");
		Date date = new Date();
		String actualdate = format.format(date);
		String strReportPath = System.getProperty("user.dir")+"/Reports/ExecutionReport_"+actualdate+".html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(strReportPath);
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("Release 1.01");
		sparkReport.config().setDocumentTitle("Vechicle Insurance Run results");
		return extent;
	}

}
