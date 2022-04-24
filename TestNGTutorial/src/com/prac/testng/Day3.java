package com.prac.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void bfclass()
	{
		System.out.println("Executed before any method");		
	}
	
	@AfterClass
	public void afclass()
	{
		System.out.println("Executed after any method");
		
	}
	
	@Test(groups={"smoke"})
  public void webLoginCarLoan()
  {
	  System.out.println("WebLoginCarLoan");
  }
	
	
	@Test(dataProvider="getdata")
  public void mobileLoginCarLoan(String userName,String password)
  {
		System.out.println("MobileLoginCarLoan");
		System.out.println(userName);
		System.out.println(password);
		
  }
     @Parameters({"URL"})
	 @Test
	  public void mobileSigninCarLoan(String urlName)
	  {
			System.out.println("MobileSigninCarLoan");
			System.out.println(urlName);
	  }
	 
	 @BeforeSuite
	 public void bfSuite()
	 {
		 System.out.println("I am no 1");
	 }
	 
	 @BeforeMethod()
	 public void bfEveryMethod()
	 {
		 System.out.println("executed before each method in this class");
		 
	 }
	 
	 @AfterMethod()
	 public void afEveryMethod()
	 {
		 System.out.println("executed after each method in this class");
		 
	 }
	 
	 @Test(enabled=false)
	  public void mobileSignoutCarLoan()
	  {
			System.out.println("MobileSignoutCarLoan");
	  }	
	
	@Test(dependsOnMethods= {"mobileSigninCarLoan","webLoginCarLoan"})
  public void apiLoginCarLoan()
  {
		System.out.println("APILoginCarLoan");
  }
	
	@DataProvider
	public Object[][] getdata()
	{
		//combination1-username & password--Good credit history
		//combination1-username & password--No credit history
		//comnbination1-username & password--bad  credit history
		Object[][] data=new Object[3][2];
		//first set:
		data[0][0]="firstsetusrname";
		data[0][1]="firstpassword";
		//second set:
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//third set:
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
	}


}
