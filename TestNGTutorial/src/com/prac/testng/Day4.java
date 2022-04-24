package com.prac.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"URL", "APIKEY/username"})
	@Test 
	  public void webLoginHomeLoan(String urlName,String apiKey)
	  {
		  System.out.println("WebLoginPesonalHomeLoan");
		  System.out.println(urlName);
		  System.out.println(apiKey);
	  }
		@Test(groups= {"smoke"})
	  public void mobileLoginHomeLoan()
	  {
			System.out.println("MobileLoginHomeLoan");
	  }
		@Test(timeOut=4000)
	  public void apiLoginHomeLoan()
	  {
			System.out.println("APILoginHomeLoan");
	  }



}
