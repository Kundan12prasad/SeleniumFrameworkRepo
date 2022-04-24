package com.testcase.pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.object.RedifHomePage;
import com.object.RedifLoginPage;

public class LoginApplicationPF {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	     driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	     
	     RedifLoginPage rd=new RedifLoginPage(driver);
	     rd.emailId().sendKeys("Kundan");
	     rd.password().sendKeys("Kun123");
	     rd.login().click();   
	     rd.homePage().click();
	     
	     RedifHomePage rp=new RedifHomePage(driver);
	     rp.searchBox().sendKeys("rediff");
	     rp.searchButton().click();
	     
	     
	}
	

}
