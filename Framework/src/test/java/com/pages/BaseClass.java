package com.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.utility.AllBrowser;
import com.utility.ConfigDataProvider;
import com.utility.ExcelDataProvider;
 
public class BaseClass
{
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setUpSuite()
	{
	  excel=new ExcelDataProvider();
	  config=new ConfigDataProvider();
	}
	
	@BeforeClass
	public void setup()
	{
		driver=AllBrowser.StartApplication(driver, config.getBrowser(), config.getDevURL());
	}

	@AfterClass
	public void closeBrowser()
	{
		AllBrowser.quitBrowser(driver);
	}
}
