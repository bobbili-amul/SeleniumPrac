package com.amul.seliniumrough;

import java.io.FileInputStream;
import java.util.Iterator;

import org.testng.annotations.Test;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting {

	static XSSFWorkbook wb = null;
	static XSSFSheet sheet = null;
	private XSSFRow row;

	@Test
	public void dataReading() throws Exception {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\datadriven.xlsx");
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("names");
			int allrows = sheet.getPhysicalNumberOfRows();
			short noOfColumns = sheet.getRow(0).getLastCellNum();
			System.out.println("rows = " + allrows);
			System.out.println("columns = " + noOfColumns);
			Iterator<Row> itr = sheet.iterator();
			FormulaEvaluator fe=wb.getCreationHelper().createFormulaEvaluator();
			while (itr.hasNext()) {
				Row row = (Row) itr.next();
				Iterator<Cell> cellItr = row.cellIterator();
				while (cellItr.hasNext()) {
					Cell cell = cellItr.next();
					System.out.println(cell.getStringCellValue());
				}

			}

		} catch (Exception e) {
			System.out.println("end");
			System.out.println("end");
			System.out.println("end");
			wb.close();
		}

	}

}
