package Reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ExtentReport.ExtentReportUtility;

public class  BasePage extends ExtentReportUtility {
		
public static WebDriver driver ;

@BeforeMethod
public static WebDriver instantiateWebDriver()
	{		
		System.setProperty("webdriver.chrome.driver",
				"C:/JavaAutomationWorkPlace/EcomCoreUITestAutomation/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}


public static WebDriver getDriver() {
	
	if(driver !=null)
	{
		return driver;
	}
	
	return instantiateWebDriver();
}

@AfterMethod
public void CloseBrowers() 
{
	driver.close();
}

}

