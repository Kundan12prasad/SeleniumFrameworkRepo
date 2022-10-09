package com.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {
	
	public static void main(String[] args)
	{
		TestNG testNG=new TestNG();
		List<String>list=new ArrayList<String>();
		list.add("G:\\SeleniumPractice\\TestNGTutorial\\test-output\\FailedTestcase\\testng-failed.xml");		
		testNG.setTestSuites(list);
		testNG.run();		
	
		//G:\\SeleniumPractice\\TestNGTutorial\\test-output\\FailedTestcase\\testng-failed.xml
	}

}
