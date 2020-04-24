package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testutil {
	static Workbook book;
	static Sheet sheet;
	public static String TESTDATA_SHEET_PATH="E:\\WAS 8.5\\VMWare workstation 14\\jalaeclipse\\selenium\\src\\test\\java\\testData\\LoginTestData.xlsx"; 
	public static Object[][] getTestData(String sheetName){
		FileInputStream file=null;
		try {
			file=new FileInputStream(TESTDATA_SHEET_PATH);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book=WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		sheet = (Sheet) book.getSheet(sheetName);
		Object[][] data=new Object[((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum()][((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getLastCellNum()];
				
				for(int i=0;i<((org.apache.poi.ss.usermodel.Sheet) sheet).getLastRowNum();i++) {
					for(int k=0;k<((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(0).getLastCellNum();k++) {
						data[i][k]=((org.apache.poi.ss.usermodel.Sheet) sheet).getRow(i+1).getCell(k).toString();
					
					}
				}
				
		return data;
	}

}
