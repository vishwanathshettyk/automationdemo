package Pages;

import Reusables.CsvDataExtractor;
import Reusables.EcomDriver;

import java.util.Map;

import org.openqa.selenium.By;

public class SearchPage extends EcomDriver 
{
	EcomDriver driver = new EcomDriver();
		
	private By searchButton = By.id("button-search");
	
	public void insertEmptyString()
	{		
		driver.Click(searchButton);
	}

	public boolean isSearchResultGenerated()
	{
		return driver.isElementExist(By.cssSelector("div.resp-grid-wrapper.products-table table tbody td a"));
	}
}
