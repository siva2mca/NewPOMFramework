package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class TC001_loginExecution extends ProjectSpecificMethods{

	@Test
	public void loginExecution()
	{	
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyPageTitle();
		
		
		
	}
	}