package Pages;

import java.io.FileNotFoundException;
import java.util.Map;

import org.openqa.selenium.By;

import Reusables.CsvDataExtractor;
import Reusables.EcomDriver;
import Reusables.IDataReader;
import Reusables.PropertiesReader;

public class LoginPage extends EcomDriver {
	
	EcomDriver driver = new EcomDriver();
	private By userConsentElement = By.cssSelector(".custom-button.primarybutton");
	



	public void accessURLandAcceptConsent() throws FileNotFoundException
	{
		try {
		
			String Url = PropertiesReader.GetProperty("url");
			driver.NavigateToURL(Url);
			acceptUserConsent();
			Thread.sleep(2000);
			driver.Click(By.id("btnSignIn"));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	private void acceptUserConsent() 
	{
		driver.Click(userConsentElement);	
	}
	
	public void enterUserName(String userName)
	{
		driver.insertText(By.id("Email"), userName);
	}
	
	public void enterPassword(String passWord)
	{
		driver.insertText(By.id("Password"), passWord);
	}
	
	public void clickLoginButton() {
		driver.Click(By.id("btnLogIn"));
	}
	
	
	public boolean IsHomePageDisplayed() {
		 return driver.isElementExist(By.id("Products"));
	}
	
	
	public boolean returnFalse()
	{
		return false;
	}
}

