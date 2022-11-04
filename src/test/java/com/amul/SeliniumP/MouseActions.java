package com.amul.SeliniumP;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class MouseActions {
	public void MouseActions() throws IOException {
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(new ChromeDriver());
		actions.clickAndHold().release().build().perform();
		driver.switchTo().frame("ID of the frame");
		actions.doubleClick();
		actions.dragAndDrop(null, null);
		actions.keyUp(new ChromeDriver().findElement(By.xpath("")), Keys.SHIFT).sendKeys("Bobbi").build().perform();
		actions.keyUp(Keys.SHIFT);
		// broken links.
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement l : allLinks) {
			String Stringurl = l.getAttribute("href");
			URL url = new URL(Stringurl);
			  URLConnection openConnection = url.openConnection();
			  HttpURLConnection httpURLConnection = (HttpURLConnection)openConnection;
			  httpURLConnection.setConnectTimeout(5000);
			  httpURLConnection.connect();
			  if(httpURLConnection.getResponseCode()==200)
			  {
				  
			  }

		}
		SoftAssert sa = new SoftAssert();

		// boolean enabled = driver.findElement(By.xpath("")).isEnabled();

	}
}
