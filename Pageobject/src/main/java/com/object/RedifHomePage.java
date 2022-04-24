package com.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RedifHomePage {
	WebDriver driver;

	public RedifHomePage(WebDriver driver) 
	{
		this.driver=driver;		
	}
	
	//srchword
	By searchBox=By.id("srchword");
	By searchButton=By.xpath("//input[@type='submit']");
	
	public WebElement searchBox()
	{
		WebElement search = driver.findElement(searchBox);
		return search;
		
	}
	
	public WebElement searchButton()
	{
		WebElement sButton = driver.findElement(searchButton);
		return sButton;
		
	}
	
	
	

}
