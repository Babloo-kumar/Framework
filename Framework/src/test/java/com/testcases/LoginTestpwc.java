package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.utility.AllBrowser;

public class LoginTestpwc 

{
	WebDriver driver;
	@Test
	public void loginApp()
	{
		driver=AllBrowser.StartApplication(driver, "Chrome", "http://pwcpoc-1162719469.ap-south-1.elb.amazonaws.com/PwCEWB/Auth/Login");
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.loginToPwC("Babloo_dev","Babloo@123");
		
		AllBrowser.quitBrowser(driver);
	}

}
