package Tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.QuickOrderPage;
import Reusables.CsvDataExtractor;
import Reusables.Data;

public class QuickOrderTest  extends QuickOrderPage {
	
	Data data = new Data();
	LoginTest loginTest = new LoginTest();	
	QuickOrderPage quickOrderPage = new QuickOrderPage();
	
	@Test
	public void VerifyQuickOrderNavigation()
	{
		try
		{
			extentTest.log(Status.INFO,QuickOrderTest.class.getName());
			loginTest.VerifyLoginTest();
			quickOrderPage.NavigateToQuickOrder();
			
		}
		catch(Exception e)
		{
			extentTest.log(Status.FAIL, e.toString());
		}
		
	}
}
