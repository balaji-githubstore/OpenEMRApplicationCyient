package com.cyient.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//we will delete this file
public class DemoTest {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("src/test/resources/testdata/OpenEMRData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file); // open
		XSSFSheet sheet = book.getSheet("validCredentialTest");// sheet
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] main=new Object[rowCount-1][cellCount];
		for(int r=1;r<rowCount;r++)
		{
			for(int c=0;c<cellCount;c++)
			{
				XSSFRow row = sheet.getRow(r);
				XSSFCell cell = row.getCell(c);

				DataFormatter format=new DataFormatter();
				
				String cellValue = format.formatCellValue(cell);
				System.out.println(cellValue);
				main[r-1][c]=cellValue;
			}
		}

		System.out.println(main);
	}

}





