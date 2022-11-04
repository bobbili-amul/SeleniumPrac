package com.amul.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoughNotes {

	@Test(dataProvider = "dp")
	public static void test1(String fname, String sname) {
		System.out.print(fname + " " + sname);
		System.out.println();
	}

	@DataProvider(name = "dp")
	public String[][] dataSource() {
		String a[][] = { { "amul", "bobbili" }, { "aneel", "boga" } };
		return a;

	}
}
