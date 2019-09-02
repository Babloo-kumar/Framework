package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.LoginPage;

public class LoginTestpwc extends BaseClass

{

	@Test
	public void loginApp() throws InterruptedException
	{
		
		//excel.getStringData("Login", 0, 0);
		
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
	   loginPage.loginToPwC(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
	   
	   Thread.sleep(2000);
		
	}

}
