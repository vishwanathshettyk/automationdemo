package Tests;

import java.util.Map;

import org.testng.Assert;
import com.aventstack.extentreports.Status;
import Pages.LoginPage;
import Reusables.PropertiesReader;

public class LoginTest extends LoginPage {

	
LoginPage loginPage = new LoginPage();	

public void VerifyLoginTest() {	
	
	  try {

		 loginPage.accessURLandAcceptConsent();
		 loginPage.enterUserName(PropertiesReader.GetProperty("userName"));
		 loginPage.enterPassword(PropertiesReader.GetProperty("password"));
		 loginPage.clickLoginButton();
		 	Thread.sleep(2000);
		 Assert.assertTrue(loginPage.IsHomePageDisplayed());	  
		  
	  	  } 
	  
	  catch (Exception e) 
	  {
		  
		extentTest.log(Status.ERROR, e.toString());
		  
	  }	 
  }

}