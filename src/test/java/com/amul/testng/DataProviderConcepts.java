package com.amul.testng;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcepts {

	@DataProvider
	public String[] dataGiver() {
		/*
		 * ArrayList<String> al = new ArrayList<String>(); al.add("One"); al.add("Two");
		 * al.add("Three"); al.add("Four"); return al.iterator();
		 */
		String[] str= {"One","Two","Three","Four"};
		return str;

	}

	@Test(dataProvider = "dataGiver")
	public void dataReceiver(String str) {
		System.out.println(str);
	}
}
