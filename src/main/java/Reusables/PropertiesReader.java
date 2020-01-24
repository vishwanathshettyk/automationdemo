package Reusables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
public static String GetProperty(String key) throws FileNotFoundException
{
	Properties prop=new Properties();
	
	FileInputStream file= new FileInputStream("C:\\JavaAutomationWorkPlace\\EcomCoreUITestAutomation\\src\\test\\java\\Tests\\config.properties");
	
	try {
		prop.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return prop.getProperty(key);
		
}

}
