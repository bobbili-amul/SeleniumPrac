package com.amul.SeliniumP;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amul.base.Base;
import com.amul.SeliniumP.FaceBookLoginPage;

public class FaceBookLoginPageTest {

	Base base = null;
	FaceBookLoginPage fblp = null;

	@BeforeSuite
	public void setUp() throws Exception {
		base = new Base();
		base.setUp();
		fblp = new FaceBookLoginPage();

		// fblp.loginVerification();
	}

	@Test
	public void loginTest() throws InterruptedException {
		Thread.sleep(8000);
		fblp.loginVerification();
	}

	@AfterSuite
	public void tearDown() {
		base.tearDown();

	}
}
