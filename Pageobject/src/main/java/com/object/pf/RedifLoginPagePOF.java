package com.object.pf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedifLoginPagePOF 
{
	WebDriver driver;

	public RedifLoginPagePOF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
    //Defined By Page Object Class design pattern
	/*By userName=By.xpath("//input[@id='login1']");	
	By passWord=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@value='Sign in']");
	By home=By.linkText("rediff.com"); */
	
	//Defined By Page Factory Design pattern
	@FindBy(xpath="//input[@id='login1']")
	WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement passWord;
	
	@FindBy(xpath="//input[@value='Sign in']")
	WebElement loginButton;
	
	@FindBy(linkText="rediff.com")
	WebElement homePage;		
	
	
	public WebElement emailId()
	{
		
		return userName;
	}
	
	public WebElement password()
	{
		return passWord;
	}
	
	public WebElement login()
	{
		return loginButton;
	}
	
	public WebElement homePage()
	{
		return homePage;
	}  

}
