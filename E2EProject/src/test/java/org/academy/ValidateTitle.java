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

public class ValidateTitle extends Base 
{	
	public  WebDriver driver=null;
	private static  Logger log = LogManager.getLogger(ValidateTitle.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver = initializeDriver();
		log.info("Driver is Initialized");
		driver.get(prop.getProperty("url"));	
		log.info("Navigated to home page ");
	}	
	
	@Test
	public void validateAppTitleTest() throws IOException
	{
		//driver = initializeDriver();
		//driver.get("http://qaclickacademy.com/");--- hard coding url
		//driver.get(prop.getProperty("url"));
		LandingPage landingpage = new LandingPage(driver);
		String actualValue = landingpage.getTitle().getText();
		Assert.assertEquals(actualValue,"FEATURED COURSES");
		log.info("Successfully validated text message");
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}


	

}
