package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData_provider {
XSSFWorkbook wb;
	
	public ExcelData_provider() throws IOException {
		
		String path="C:\\Users\\prakashjadav\\eclipse-workspace\\PB_E2E2\\Test_Data\\Test_Data_Excel_Sheet.xlsx";
		
		FileInputStream fis1=new FileInputStream (path);
		 wb=new XSSFWorkbook(fis1);
		
	}
	public String getstringdata(String Sheetname,int row,int cell) {
		
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		
	}

}
