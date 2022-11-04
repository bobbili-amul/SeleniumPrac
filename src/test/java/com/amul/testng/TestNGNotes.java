package com.amul.testng;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners.class)
public class TestNGNotes implements ITestListener {
	@Test(enabled = false)
	void m1() {
		Assert.assertEquals(false, true);

	}
	@Test
	public static void test2()
	{
		System.out.println("test2");
	}

}
