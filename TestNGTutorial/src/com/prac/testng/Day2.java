package com.prac.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups={"smoke"})
	public void pLoan()
	{
		System.out.println("This is Personal Loan");
		
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("executed first");
		
	}
	
	

}
