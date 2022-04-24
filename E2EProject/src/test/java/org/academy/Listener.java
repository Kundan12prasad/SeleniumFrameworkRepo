package org.academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentReporterNG;

public class Listener extends Base implements ITestListener
{
	
	ExtentTest test=null;
	ExtentReports extent=ExtentReporterNG.getReportObject();
	ThreadLocal<ExtentTest>extentTest=new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) 
	{
		 test = extent.createTest(result.getMethod().getMethodName());
		 extentTest.set(test);  //parallel execution
		
		
	}

	public void onTestSuccess(ITestResult result)
	{ 
		
		//test.log(Status.PASS, "Test Passed");  //sequential operation
		extentTest.get().log(Status.PASS, "Test Passed");  //parallel execution
	}

	public void onTestFailure(ITestResult result)
	{
		//test.fail(result.getThrowable()); //sequential execution
		extentTest.get().fail(result.getThrowable());  //parallel execution
		//captured the screenshot
		WebDriver driver=null;
		String testMethodName = result.getMethod().getMethodName();
		try {
			driver=(WebDriver)result.getTestClass()
					.getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} 
		catch(Exception ex)
		{
		ex.printStackTrace();	
		}
		
		try 
		{
			extentTest.get().addScreenCaptureFromPath(getScreenshotPath(testMethodName,driver), result.getMethod().getMethodName());
		//getScreenshotPath(testMethodName,driver); 
		} 
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	public void onStart(ITestContext context)
	{
		
	}

	public void onFinish(ITestContext context)
	{
		extent.flush();
		}

			

}
