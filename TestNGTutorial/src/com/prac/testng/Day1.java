package com.prac.testng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 
{
	@AfterTest
	public void postrequisite()
	{
		System.out.println("Executed Last");
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am at last");
	}
	
     @Test(groups= {"smoke"})
	 public void demo1()
	 {
		System.out.println("Hello TestNG");
	 }
     
     @Test
	 public void testDemo2()
	 {
		System.out.println("This is second case");
		//Assert.assertTrue(false);
	 }
     
     
     

}
