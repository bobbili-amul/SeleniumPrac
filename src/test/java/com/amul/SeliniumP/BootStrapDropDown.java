package com.amul.SeliniumP;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		List<WebElement> dropDown = driver.findElements(By.xpath("//li[@role='presentation']//child::a"));

		Iterator<WebElement> itr = dropDown.iterator();
		while (itr.hasNext()) {

			WebElement next = itr.next();

			if (next.getText().equals("JavaScript")) {

				next.click();
				Thread.sleep(5000);
			}
		}

	}
}
