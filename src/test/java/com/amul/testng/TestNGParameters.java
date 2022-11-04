package com.amul.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Ignore
public class TestNGParameters {

	@Test(enabled = false)
	@Parameters({ "name", "age" })
	public void t1(@Optional("chrome") String name, String age) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.close();
		System.out.println(name + "=====>" + age);
	}
	
	@Test(groups = "tr")
	public void t2()
	{
		
	}
}
