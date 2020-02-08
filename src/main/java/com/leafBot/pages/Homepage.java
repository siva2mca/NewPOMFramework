package com.leafBot.pages;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class Homepage extends ProjectSpecificMethods{

	public void verifyPageTitle()
	{
	String title = driver.getTitle();
	System.out.println(title);
}
}
