package com.amul.testng;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void create() {
		int x = 2 / 0;
		System.out.println("create");

	}

	@Test(dependsOnMethods = "create", alwaysRun = true)
	public void track() {
		System.out.println("track");
	}

	@Test(dependsOnMethods = "create", alwaysRun = true)
	public void cancel() {
		System.out.println("cancel");
	}
}
