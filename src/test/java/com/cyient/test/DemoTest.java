package com.cyient.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//we will delete this file
public class DemoTest {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("src/test/resources/testdata/OpenEMRData.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file); // open
		XSSFSheet sheet = book.getSheet("validCredentialTest");//sheet
		XSSFRow row = sheet.getRow(2); //row
		XSSFCell cell = row.getCell(1); //cell
		
		
		String cellValue = cell.getStringCellValue(); //converting to string
		System.out.println(cellValue);
		
		//rowcount
		//cellcount
		//will start by 4:35 PM IST

	}

}
