package com.amul.SeliniumP;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest 
{
	 HomePage homePage=null;
	 
      @Test
      public void verifyHomePageTitle() throws InterruptedException
      {
    	  homePage=new HomePage();
    	  Thread.sleep(5000);
    	  Assert.assertEquals(homePage.getTitleOfHomePage(), "(1) Facebook");
    	  System.out.print(homePage.getTitleOfHomePage());
      }
}
