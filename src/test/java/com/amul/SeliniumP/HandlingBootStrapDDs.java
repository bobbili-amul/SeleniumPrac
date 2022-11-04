package com.amul.SeliniumP;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBootStrapDDs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		/*
		 * driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MILLISECONDS);
		 * driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		 */
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='dropdown']//button[@id='dropdownMenuButton']")).click();
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		for (WebElement we : allOptions) {
			System.out.println(we.getText());
		}
	}
}
