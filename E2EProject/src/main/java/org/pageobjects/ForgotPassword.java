package org.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ForgotPassword 
{
	public WebDriver driver;
	
	public ForgotPassword(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By email=By.cssSelector("input[id='user_email']");
	private By sendmeInstruction=By.cssSelector("input[id='user_email']");
	
	public WebElement getEmail()
	{
		WebElement emailTextBox = driver.findElement(email);
		return emailTextBox;
	}
	
	public WebElement getsendmeInstruction()
	{
		WebElement instruction = driver.findElement(sendmeInstruction);
		return instruction;
	}
	

}
