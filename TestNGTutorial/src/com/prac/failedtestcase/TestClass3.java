package com.prac.failedtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass3 {
	
	//@Test(retryAnalyzer=com.retry.RetryTest.class)
	@Test
	public void test3()
	{
		Assert.assertTrue(false);
		System.out.println("test1 method is invoked");
	}

}
