package org.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage 
{
	public WebDriver driver;
	
	//This is coming from test class, it has a life
		public LoginPage(WebDriver driver) 
		{
			this.driver=driver;
		}	
	
	//Define the components of page (data keeping as private modifier)
	private By email=By.cssSelector("input[id='user_email']");	
	private By password=By.cssSelector("input[id='user_password']");
	private By login=By.cssSelector("input[type='submit']");
	private By forgotPassword=By.cssSelector("a[href*='password/new']");	

	public WebElement getEmail()
	{
		WebElement emailTextBox = driver.findElement(email);
		return emailTextBox;
		
	} 
	
	public WebElement getPassword()
	{
		WebElement passwordTextBox = driver.findElement(password);
		return passwordTextBox;
		
	} 
	
	public WebElement getLogin()
	{
		WebElement loginButton = driver.findElement(login);
		return loginButton;		
	} 
	
	
	public ForgotPassword forgotPassword()
	{
	    driver.findElement(login);
	    ForgotPassword fp=new ForgotPassword(driver);
		return fp;
		
	} 
	
	
	


	
	
	

}
