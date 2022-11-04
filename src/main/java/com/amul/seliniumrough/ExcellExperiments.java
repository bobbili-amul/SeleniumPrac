package com.amul.seliniumrough;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcellExperiments {

	@Test
	public void readData() throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\datadriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheet("names");
		System.out.println("first row = " + sheet.getFirstRowNum());
		System.out.println("last row = " + sheet.getLastRowNum());
		System.out.println(sheet.getPhysicalNumberOfRows());
		for (int i = 1; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
			}
			System.out.println();
		}
	}

	@DataProvider(name = "dp")
	public void m1() {

	}

}
