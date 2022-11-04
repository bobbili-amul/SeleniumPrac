package com.amul.testng;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider
	public static String[][] dataGiver()
	{
		String users[][] = {
				{"Amul","Bobbili"},
				{"Aneel","Boga"},
				{"Sandeep","Maneti"}
		};
		return users;
	}
}
