package Reusables;

import java.io.BufferedReader;

import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
public class CsvDataExtractor extends BasePage{
	
	Map<String, String> map = new HashMap<String, String>();
	
	public Map<String, String>  extractData(String fileName){
				
		String[] data2 = new String[100];
					
		try {
			
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while(line != null){
				
				data2 = line.split("=");
				
				for(int key=0; key < data2.length ; key++)
				{
					for(int value=1; value < data2.length ; value++)
					{
						map.put(data2[key], data2[value]);
					}
	
				}
				
				line = reader.readLine();
			}		
		} catch (Exception e) {

		}
		return map;
	
}

}
