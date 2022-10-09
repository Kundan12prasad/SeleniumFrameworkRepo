package com.prac.failedtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {
	
	//@Test(retryAnalyzer=com.retry.RetryTest.class)
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
		System.out.println("test2 method is invoked");
	}

}
