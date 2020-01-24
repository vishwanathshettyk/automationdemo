package Reusables;

import java.util.Map;

public class Data {

	public static Map<String, String> GetData(String fileName)
	{
		CsvDataExtractor data1 = new CsvDataExtractor();	
		fileName = "C:\\JavaAutomationWorkPlace\\EcomCoreUITestAutomation\\src\\test\\resources\\" + fileName + "Data.txt";
		Map<String, String> data = data1.extractData(fileName);		
		return data;	
	}
	
}
