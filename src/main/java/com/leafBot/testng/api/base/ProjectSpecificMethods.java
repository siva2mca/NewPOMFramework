package com.leafBot.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leafBot.selenium.api.base.SeleniumBase;

import utils.DataLibrary;


public class ProjectSpecificMethods extends SeleniumBase {

	public ChromeDriver driver;	
	@BeforeMethod
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		
	}
@AfterMethod
	public void closeBrwoser()
	{
		driver.close();
	}










}
