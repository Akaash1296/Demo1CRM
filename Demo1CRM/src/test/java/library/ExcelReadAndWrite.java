package library;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadAndWrite implements IAutoConstants {

	public int getRowCount(String sheetName) {
	int rowCount=0;
	System.out.println("Get the row count from excel file: " + sheetName);
	try {
		FileInputStream fin = new FileInputStream(XLPATH);
		Workbook wb = WorkbookFactory.create(fin);
		rowCount = wb.getSheet(sheetName).getLastRowNum();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	return rowCount;
	}
	
	public int getCellCount(String sheetName, int row) {
		int cellCount=0;		
		try {
			FileInputStream fin = new FileInputStream(XLPATH);
			Workbook wb = WorkbookFactory.create(fin);
			cellCount = wb.getSheet(sheetName).getRow(row).getLastCellNum();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return cellCount;
		}
	
	public String readExcel(String sheet, int row, int col) {
		String data="";
	    
		try {
			FileInputStream fin = new FileInputStream(XLPATH);
			Workbook wb = WorkbookFactory.create(fin);				
			data = wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	
	public void writeExcel(String sheet, int row, int col, String val) {
		try {
			FileInputStream fin = new FileInputStream(XLPATH);
			Workbook wb = WorkbookFactory.create(fin);
			wb.getSheet(sheet).getRow(row).createCell(col).setCellValue(val);
			FileOutputStream fout = new FileOutputStream(XLPATH);
			wb.write(fout);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}
}
