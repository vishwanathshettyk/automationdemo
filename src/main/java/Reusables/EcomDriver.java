package Reusables;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EcomDriver extends BasePage {
	
	public void NavigateToURL(String Url)
	{
		driver.navigate().to(Url);
	}
	
	public void Click(By by)
	{
		WaitForElement(by);
		driver.findElement(by).click();
	}

	public void WaitForElement(By element) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
	public void insertText(By by, String text)
	{
		WaitForElement(by);
		driver.findElement(by).sendKeys(text);
	}
	
	public boolean isElementExist(By by)
	{
		// return !driver.findElements(by).isEmpty();
		return driver.findElement(by).isDisplayed();
	}
	
}


