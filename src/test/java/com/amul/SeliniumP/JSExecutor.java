package com.amul.SeliniumP;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutor {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		/*
		 * WebDriver create = WebDriverManager.edgedriver().create(); WebDriver create2
		 * = WebDriverManager.operadriver().create();
		 */
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);

		/*
		 * js.executeScript(
		 * "document.getElementById('email').style.background='orange';"); js.
		 * executeScript("document.getElementById('email').style.border='5px green solid';"
		 * );
		 */
		js.executeScript("document.getElementById('email').setAttribute('style','border:5px green solid;background:yellow');");
		
		// WebElement elem = (WebElement) js.executeScript("return
		// document.getElementById('email')");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		// elem.sendKeys("amulbobbili");
		/*
		 * js.executeScript("document.evaluate("//input[@id='email'],document,null,
		 * XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue" + "");
		 */
	}
}
