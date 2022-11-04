package com.amul.SeliniumP;

import com.amul.base.Base;

public class HomePage extends Base{
	
	public HomePage()
	{
		super();
	}
	
	public String getTitleOfHomePage()
	{
	return	driver.getTitle();
	}

}
