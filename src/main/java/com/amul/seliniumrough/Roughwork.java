package com.amul.seliniumrough;

import static java.lang.System.out;

import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Roughwork {

	@Test
	public void rough() {
		assertNotEquals('a', 'b');
		assertNull(new Roughwork());
		out.print("end ");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}
}
