package com.amul.SeliniumP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoughPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		// driver.findElement(By.xpath("//button[text()='Log in']"));
		// System.out.println(driver.findElement(By.xpath("//button[@name='login']")).getAttribute("id"));
		System.out.println(driver.findElement(By.xpath("//button[@name='login']")).getCssValue("background-color"));
		String bgColour = driver.findElement(By.xpath("//button[@name='login']")).getCssValue("background-color");
		String asHex = Color.fromString(bgColour).asHex();
		System.out.println(asHex);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("solution@gmail.com");
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());

	}

}
