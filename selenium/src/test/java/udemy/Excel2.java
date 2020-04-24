//package udemy;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Excel2 {
//	public ArrayList<String> getData(String testcaseName) throws IOException {
//
//		ArrayList<String> a = new ArrayList<String>();
//
//		FileInputStream fis = new FileInputStream("E:\\Excelcode.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		int sheet = workbook.getNumberOfSheets();
//		for (int i = 0; i < sheet; i++) {
//			if (workbook.getSheetName(i).equalsIgnoreCase("Erp")) {
//				XSSFSheet sheets = workbook.getSheetAt(i);
//				Iterator<Row> rows = sheets.iterator();
//				Row firstrow = rows.next();
//				Iterator<Cell> ce = firstrow.iterator();
//				int k = 0;
//				int column = 0;
//				while (ce.hasNext()) {
//					Cell value = ce.next();
//					if (value.getStringCellValue().equalsIgnoreCase("Emp")) {
//						column = k;
//
//					}
//					k++;
//
//				}
//				System.out.println(column);
//				while (rows.hasNext()) {
//					Row value = rows.next();
//					if (value.getCell(column).getStringCellValue().equalsIgnoreCase(testcaseName)) {
//						Iterator<Cell> c = value.cellIterator();
//						while (c.hasNext()) {
//							Cell cv=c.next();
//							cv.getCellTypeEnum()==CellType
//							//a.add(c.next().getStringCellValue());
//
//						}
//					}
//				}
//
//			}
//		}
//return a;
//	}
//
//	public static void main(String[] args) throws IOException {
//
//	}
//}
