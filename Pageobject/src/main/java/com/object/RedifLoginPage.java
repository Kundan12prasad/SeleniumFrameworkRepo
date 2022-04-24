package com.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RedifLoginPage 
{
	WebDriver driver;

	public RedifLoginPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}

	By userName=By.xpath("//input[@id='login1']");	
	By passWord=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@value='Sign in']");
	By home=By.linkText("rediff.com");
	
	public WebElement emailId()
	{
		WebElement email = driver.findElement(userName);
		return email;
	}
	
	public WebElement password()
	{
		WebElement password = driver.findElement(passWord);
		return password;
	}
	
	public WebElement login()
	{
		WebElement submitBtn = driver.findElement(login);
		return submitBtn;
	}
	
	public WebElement homePage()
	{
		WebElement homePage = driver.findElement(home);
		return homePage;
	}

}
