package com.amul.SeliniumP;

import java.io.File;
import java.io.IOException;
import java.rmi.UnexpectedException;
import java.sql.Time;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeliniumRough {
	public void rough() throws IOException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// switching between windows.
		String currentW = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			if (window.equals("facbookwindow")) {
				driver.switchTo().window(window);
				driver.findElement(By.xpath("")).sendKeys("");
			}
		}

		Select select = new Select(driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("");
		select.selectByVisibleText("");
		List<WebElement> allOptions = select.getOptions();
		// navigation methods.

		driver.navigate().to("");// does not wait for the page to load completely.
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

		// Takescreenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Resources\\sampleFile.JPEG");
		FileUtils.copyFile(src, dest);

		// Alerts in selenium
		driver.findElement(By.xpath("")).click();
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		alert.dismiss();
		alert.sendKeys("");

		// Frames
		driver.switchTo().frame("");
		driver.switchTo().defaultContent();

		// waits

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));

		Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("")).isDisplayed();
			}
		};
		wait.until(f);
		wait.until((d) -> d.findElement(By.xpath("")).isDisplayed());
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
		wait.until(null);
		driver.manage().window().maximize();
		driver.manage().window().minimize();

		driver.findElement(By.xpath("")).getCssValue(currentW);
		String currentUrl = driver.getCurrentUrl();

	}

}
