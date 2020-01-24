package Tests;

import Reusables.CsvDataExtractor;

public class WebUITest {
	
	protected CsvDataExtractor dataextractor;
	
	protected LoginTest loginTest;
	
	public WebUITest(CsvDataExtractor dataextractor, LoginTest loginTest ) {
			this.dataextractor = dataextractor;
				this.loginTest = loginTest;
			}
}
