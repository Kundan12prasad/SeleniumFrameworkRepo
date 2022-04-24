package com.practice.Exceldatadrive.ExcelDataDrive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTest {

	public  ArrayList<String> getData(String testCaseName) throws Exception {

		// Fileinputstream as an input
		ArrayList<String> a = new ArrayList<String>();
		FileInputStream fis = new FileInputStream("E:\\Data_driven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("data_driven")) {
				XSSFSheet sheet = workbook.getSheetAt(i); // sheet is a collection of rows
				// identify the testcase column by scanning the entire first row:
				Iterator<Row> rows = sheet.rowIterator(); // row is a collection of cells
				Row firstRow = rows.next();
				Iterator<Cell> ce = firstRow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;
					}

					k++;
				}
				System.out.println(column);

				// once the column is identified then scan the entire testcase column to
				// identify the purchase testcase row
				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {

						// after you grab the purchase test case pull all the data of that row and feed
						// the data into test
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {							
							
							// System.out.println(cv.next().getStringCellValue());	
							Cell c = cv.next();
							if(c.getCellType()==CellType.STRING)
							{
							a.add(c.getStringCellValue());
							}
							else
							{								
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}

					}
				}
			}
		}
		return a;
	}

	public static void main(String[] args) throws Exception
	{
		DataDrivenTest dataDrivenTest=new DataDrivenTest();
		ArrayList<String> data = dataDrivenTest.getData("AddProfile");
		  System.out.println(data.get(0));
		  System.out.println(data.get(1));
		  System.out.println(data.get(2));
		  //System.out.println(data.get(3));
		
		
	}
}
