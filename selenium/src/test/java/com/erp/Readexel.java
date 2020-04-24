package com.erp;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Readexel {
         public static void main(String[] args)
            {
       // 	 System.setProperty("webdriver.chrome.driver","E:\\selenium\\SOftware\\chromedriver.exe");
     	//WebDriver	driver=new ChromeDriver();
     		
     		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     		//driver.manage().window().maximize();
     		try
                {
                    FileInputStream file = new FileInputStream(new File("E:\\LoginTestData.xlsx"));
                    

                    //Create Workbook instance holding reference to .xlsx file
                    XSSFWorkbook workbook = new XSSFWorkbook(file);

                    //Get first/desired sheet from the workbook
                    XSSFSheet sheet = workbook.getSheetAt(0);

                    //Iterate through each rows one by one
                    Iterator<Row> rowIterator = sheet.iterator();
                    while (rowIterator.hasNext())
                    {
                        Row row = rowIterator.next();
                        //For each row, iterate through all the columns
                        Iterator<Cell> cellIterator = row.cellIterator();

                        while (cellIterator.hasNext())
                        {
                            Cell cell = cellIterator.next();
                            //Check the cell type and format accordingly
                            switch (cell.getCellType())
                            {
                                case Cell.CELL_TYPE_NUMERIC:
                                    System.out.print(cell.getNumericCellValue() + "t");
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    System.out.print(cell.getStringCellValue() + "t");
                                    break;
                            }
                        }
                        System.out.println("");
                    }
                    file.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }}