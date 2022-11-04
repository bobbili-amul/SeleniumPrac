package com.amul.SeliniumP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPicking {
	public static void main(String[] args) throws InterruptedException, ParseException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		int day = 21;
		driver.findElement(By.xpath(
				"//table[@class='ui-datepicker-calendar']//tbody//tr/td[not(contains(@class,'other-month ')) ]/a[text()="
						+ day + "]"))
				.click();
		Thread.sleep(5000);

		

	}

}
