package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(xpath="//input[@id='username']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement pass;
	@FindBy(xpath="//button[@id='login']") WebElement loginButton;
	
	public void loginToPwC(String uname,String passwordApp)
	{
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			
		}
		username.sendKeys(uname);
		pass.sendKeys(passwordApp);
		loginButton.click();
	}
	
}
