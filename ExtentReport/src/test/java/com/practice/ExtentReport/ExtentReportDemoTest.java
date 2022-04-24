package com.practice.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoTest {
	
	ExtentReports extent=null;
	
	@BeforeTest
	public void config()
	{
		//ExtentsReports, ExtentSparkReporter----class
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Kundan");	
		
	}
	
	
@Test
public void initialDemo()
{
	extent.createTest("Initial Demo");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com");
    System.out.println(driver.getTitle());
    extent.flush();
}
	
}
