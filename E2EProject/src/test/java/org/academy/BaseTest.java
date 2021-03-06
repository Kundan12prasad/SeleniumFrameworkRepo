package org.academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.pageobjects.ForgotPassword;
import org.pageobjects.LandingPage;
import org.pageobjects.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Base;

public class BaseTest extends Base 
{
	public  WebDriver driver=null;
	private static  Logger log = LogManager.getLogger(BaseTest.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{		
		driver = initializeDriver();
		//driver.get(prop.getProperty("url"));	--loading browser only one time
		
	}

	@Test(dataProvider="getData")
	public void initializeDriverTest(String email,String password,String text) throws IOException {
		//driver = initializeDriver();
		//driver.get("http://qaclickacademy.com/"); --url hardcoding
	    driver.get(prop.getProperty("url"));
		LandingPage landingpage = new LandingPage(driver);
		landingpage.getLogin().click();		
		//LoginPage loginPage = landingpage.getLogin();  //optimized code in case of redirection to different page
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getEmail().sendKeys(email);
		loginPage.getPassword().sendKeys(password);
		//System.out.println(text);
		log.info("text");
		loginPage.getLogin().click();
		ForgotPassword fp = loginPage.forgotPassword();  //navigating to Forgot password page
		fp.getEmail().sendKeys("errr@gmail.com");
		fp.getsendmeInstruction().click();		

	}
	
	@DataProvider
	public Object[][] getData()
  {
	  Object[][] data=new Object[2][3];
	  data[0][0]="nonrestricteduser@qv.com";
	  data[0][1]="1234";
	  data[0][2]="Non Resticted User";
	  
	  data[1][0]="restricteduser@qv.com";
	  data[1][1]="5679";
	  data[1][2]="Resticted User";	
	  
	  return data;
	  
  }
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}
 
	
	
	
	

}
