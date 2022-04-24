package org.academy;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.pageobjects.LandingPage;
import org.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class ValidateNavBar extends Base 
{	
	public  WebDriver driver=null;
	private static  Logger log = LogManager.getLogger(ValidateNavBar.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));	
		
	}	
	
	@Test
	public void validateNavBarTest() throws IOException
	{
		/*driver = initializeDriver();
		driver.get(prop.getProperty("url"));	*/	
		//driver.get("http://qaclickacademy.com/");  hard coding url
		LandingPage landingpage = new LandingPage(driver);
		Assert.assertTrue(landingpage.getNavBar().isDisplayed());
		log.info("Navigation bar is diplayed successfully");	

	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}


	

}
