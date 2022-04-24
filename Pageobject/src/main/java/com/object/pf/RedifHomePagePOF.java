package com.object.pf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RedifHomePagePOF {
	WebDriver driver;

	public RedifHomePagePOF(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	// Page Object class design pattern
	/*By searchBox=By.id("srchword");
	By searchButton=By.xpath("//input[@type='submit']"); */
	
	@FindBy(id="srchword")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchButton;	
	
	public WebElement searchBox()
	{
		return searchBox;
		
	}
	
	public WebElement searchButton()
	{
		return searchButton;
		
	} 

}
