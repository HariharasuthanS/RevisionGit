package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllData {
	
	
	private static void readData() throws IOException {
		
		 File ff=new File("C:\\Users\\Admin\\eclipse-workspace\\Adactin\\ExcelSheet\\Book1.xlsx");
		 
		 FileInputStream fl=new FileInputStream(ff);
		 Workbook wb = new XSSFWorkbook(fl);
		 Sheet sheetAt = wb.getSheetAt(0);
		 
		  int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		  for (int i = 0; i < physicalNumberOfRows; i++) {
			  
			  Row row = sheetAt.getRow(i);
			  
			  int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			  
			  for (int j = 0; j < physicalNumberOfCells; j++) {
				
				  Cell cell = row.getCell(j);
				  
			
			
		
		 
		 
		  
		 
		 CellType cellType = cell.getCellType();
		 
		 if(cellType.equals(cellType.STRING)) {
			 String stringCellValue = cell.getStringCellValue();
			 System.out.println(stringCellValue);
		 }
		 else if(cellType.equals(cellType.NUMERIC)) {
			 double numericCellValue = cell.getNumericCellValue();
			 
			int data=(int)numericCellValue;
			
			System.out.println(data);
		 }}}
		 
		 wb.close();
		 
		 
			 
		 }
	public static void main(String[] args) throws IOException {
		readData();
	}

}
