package com.amul.SeliniumP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateGames2 {
	public static void main(String[] args) throws ParseException, InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();

		Calendar calendar = Calendar.getInstance();

		String targetDMY = "26/June/2023";
		String[] split = targetDMY.split("/");
		String day = split[0];
		String month = split[1];
		String year = split[0];
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
		Date date = sdf.parse(targetDMY);
		calendar.setTime(date);

		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);
		// System.out.println(targetMonth+" "+targetYear);

		// Octobar 22
		String currentMY = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		// System.out.println(currentMY);

		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM yyyy");
		Date date2 = sdf1.parse(currentMY);
		calendar.setTime(date2);
		int currentMonth = calendar.get(Calendar.MONTH);
		int currentYear = calendar.get(Calendar.YEAR);

		while (targetMonth > currentMonth || targetYear > currentYear) {
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")));
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			currentMY = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			calendar.setTime(new SimpleDateFormat("MMMM yyyy").parse(currentMY));
			currentMonth = calendar.get(Calendar.MONTH);
			currentYear = calendar.get(Calendar.YEAR);

		}
		System.out.println(currentMonth + " ** " + currentYear);

		// driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();

		// System.out.println(currentMonth+" "+currentYear);

	}
}
