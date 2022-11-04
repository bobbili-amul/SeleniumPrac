package com.amul.SeliniumP;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class ParametersTestng {
	
	@Parameters({"browser","url"})
	@Test
	public void printParams(String browser, String url)
	{
		System.out.println(browser+" "+url);
	}

}
