package com.prac.failedtestcase;

import org.testng.annotations.Test;


public class TestClass1 {
	
	//@Test(retryAnalyzer=com.retry.RetryTest.class)
	@Test
	public void test1()
	{
		System.out.println("test1 method is invoked");
	}
	

}
