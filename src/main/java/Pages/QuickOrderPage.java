package Pages;

import org.openqa.selenium.By;

import Reusables.EcomDriver;

public class QuickOrderPage extends EcomDriver {
	
	EcomDriver driver = new EcomDriver();
			
	public void NavigateToQuickOrder()
	{
		driver.Click(By.id("Orders"));
		driver.Click(By.id("QuickOrder"));
	}
}