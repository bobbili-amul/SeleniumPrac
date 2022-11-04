package com.amul.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static FileInputStream fis = null;
	public static Properties prop = null;
	String path = ".\\Resources\\config.properties";
	String browserName = null;
	String url = null;
public	static WebDriver driver = null;
	public static String userName = null;
	public static String password = null;
	
	

	public void setUp()  {
		try {
		fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
		browserName = (String) prop.get("browser");
		if (browserName.equals("chrome")) {
			driver = WebDriverManager.chromedriver().create();
		} else if (browserName.equals("FF"))

		{
			WebDriverManager.firefoxdriver().setup();
		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().create();
		} else {
			WebDriverManager.safaridriver().create();
		}
		driver.get(prop.getProperty("url"));
		userName = prop.getProperty("username");
		password = prop.getProperty("password");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		

	}

	public void tearDown() {
		driver.quit();
	}

}
