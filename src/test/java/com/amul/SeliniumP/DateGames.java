package com.amul.SeliniumP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateGames {

	public static void main(String[] args) throws ParseException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		/*
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		 */
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();

		Calendar cal = Calendar.getInstance();
		String targetDate = "28-Dec-2016";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = sdf.parse(targetDate);
		cal.setTime(date);
		// Wed Dec 28 00:00:00 IST 2016
		int targetMonth = cal.get(Calendar.MONTH);
		int targetYear = cal.get(Calendar.YEAR);

		//
		String text = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println("" + text);

	}
}
