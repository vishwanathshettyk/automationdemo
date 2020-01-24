package Tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ExtentReport.ExtentReportUtility;
import Pages.SearchPage;
import Reusables.ContextData;
import Reusables.CsvDataExtractor;
import Reusables.Data;
import Tests.LoginTest;

public class SearchTest extends SearchPage {
	
	SearchPage searchPage = new SearchPage();
	LoginTest loginTest = new LoginTest();
	protected static ExtentTest extentTest;
	Map<String,String> data = Data.GetData(SearchTest.class.getSimpleName());
	ContextData contextData = new ContextData();

	
	
	@Test
	public void seachByEmptyString()
	{
		try
		{	
		  System.out.println(data.get("url"));
		  contextData.SetPartNumber(10);
			loginTest.VerifyLoginTest();
			searchPage.insertEmptyString();
			Thread.sleep(2000);
			System.out.println(contextData.GetPartNumber());
			Assert.assertTrue(searchPage.isSearchResultGenerated());
		}
		catch(Exception e)
		{
			extentTest.log(Status.FAIL, e.toString());
		}
	}
	
	@Test
	public void seachByProduct()
	{
		try
		{
			loginTest.VerifyLoginTest();
			searchPage.insertEmptyString();
			Thread.sleep(2000);
			Assert.assertTrue(searchPage.isSearchResultGenerated());
		}
		catch(Exception e)
		{
			extentTest.log(Status.ERROR, e.toString());
		}
	}

}
