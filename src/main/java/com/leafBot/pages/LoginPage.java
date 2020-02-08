package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername()
	{
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		return this;
	}
	public LoginPage enterPassword()
	{
		driver.findElementById("password").sendKeys("leaf@12");
		return this;
	}
	public Homepage clickLoginButton()
	{
		driver.findElementById("buttonLogin").click();
		return new Homepage();
	}

	
	
}
