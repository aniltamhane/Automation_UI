package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	
	public String excelPath = "C:\\Eclipse_Selenium_Workspace\\Automation_UI\\src\\Data\\TestData.xlsx";
	
	XSSFWorkbook wb;
	XSSFSheet ws;
	
	public String getValuefromTestData(int TCnumber, String colName) throws IOException{
		
		File fileObj = new File (excelPath);
		
		FileInputStream fi = new FileInputStream(fileObj);
		
		wb = new XSSFWorkbook(fi);
		
		ws = wb.getSheet("Sheet1");
		
		HashMap<String, String> testMap = new HashMap<String, String>();
		
		if (ws.getRow(0).getLastCellNum()!= 0){
		
			for (int i=0; i<ws.getRow(0).getLastCellNum();i++){
				
				String key = ws.getRow(0).getCell(i).getStringCellValue();
				String value = ws.getRow(TCnumber).getCell(i).getStringCellValue();
				
				testMap.put(key, value);
				
			}
			
		}
		
		return testMap.get(colName);
		
	}
	

}
