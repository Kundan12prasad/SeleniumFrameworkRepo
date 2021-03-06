package org.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	 public WebDriver driver;
	 
	    //This is coming from test class, it has a life
		public LandingPage(WebDriver driver) 
		{
			this.driver=driver;
		}
		
		//Defining the web components   
	private By signIn=By.cssSelector("a[href*='sign_in']");	
	private By featureTitle=By.xpath("//h2[text()='Featured Courses']");
	private By navigationLink=By.cssSelector(".nav.navbar-nav.navbar-right");
	private By popUp=By.xpath("//button[text()='NO THANKS']");
	
	//This is not optimized code
	public WebElement getLogin()
	{
		WebElement signInObject = driver.findElement(signIn);
		return signInObject;
		
	} 
	
	//Optimization code here
	/*public LoginPage getLogin()
	{
		 driver.findElement(signIn).click();
		LoginPage loginPage = new LoginPage(driver);
		return loginPage;
		
	} */
	
	public WebElement getTitle()
	{
		WebElement title= driver.findElement(featureTitle);
		return title;
		
	}
	
	public WebElement getNavBar()
	{
		WebElement navBar= driver.findElement(navigationLink);
		return navBar;
		
	}
	
	public List<WebElement> getPopUpSize()
	{
		return driver.findElements(popUp);	 
		
	}
	
	public WebElement getPopUp()
	{
		WebElement clickPopUp= driver.findElement(popUp);
		return clickPopUp;		
	}	
	
	
}
