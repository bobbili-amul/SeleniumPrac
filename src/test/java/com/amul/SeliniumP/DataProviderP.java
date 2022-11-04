package com.amul.SeliniumP;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderP {

	@DataProvider
	public Object[][] dataGiver() {
		Object[][] data = new Object[2][3];
		data[0][0] = "amul";
		data[0][1] = "bobbili";
		data[0][2] = "chepur";

		data[1][0] = "aneel";
		data[1][1] = "boga";
		data[1][2] = "nizamabad";

		return data;
	}

	@Test(dataProvider = "dataGiver")
	public void dataReciver(String x, String y, String z) {
		System.out.print(x + " " + y + " " + z + "\n");

	}
}
