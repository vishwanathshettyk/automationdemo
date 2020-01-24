package ExtentReport;

import java.lang.reflect.Method;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportUtility implements ITestListener {
	
	 public static ExtentTest extentTest ;
	 

	private static ExtentReports extentReport ;

	protected static synchronized ExtentReports GetExtent() {
		
		if(extentReport != null)
		{
			return extentReport;
		}
		
		else 
		{
			 extentReport  = new ExtentReports();
			 return extentReport;
		}

	}
	 
	@BeforeClass
	protected void ExtentReport() {
		 
		GetExtent() ;
		
	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtenReportNew.html");
   
	    extentReport.attachReporter(htmlReporter);
	       
	    extentTest = extentReport.createTest(getClass().getSimpleName());
	       
	}	
	 
	protected void logError(ITestResult result)
	 {
		 if(result.getStatus() == ITestResult.FAILURE)
		 {
			 extentTest.log(Status.FAIL, result.getName() + " : Failed");
			 extentTest.log(Status.FAIL, result.getThrowable());
		 }
		 
		 else
			 if(result.getStatus() == ITestResult.SKIP)
			 {
				 extentTest.log(Status.SKIP, result.getName() + ": Skipped");
				 extentTest.log(Status.SKIP, result.getThrowable());
			 }
		else
			 if(result.getStatus() == ITestResult.SUCCESS)
			 {
					 extentTest.log(Status.INFO, result.getName() + ": PASSED");
			 }			 
	 }
	 
	protected void Log(Method result)
	 {
		 extentTest.log(Status.INFO, result.getName() + ": is Started");
	 }

	 @AfterMethod
	 protected void logReport(ITestResult result)
	 {
		logError(result);
	 
	 }
	 
	 @AfterClass
	 protected void flushExtent() {
		 
		 extentReport.flush();
	 }
}
