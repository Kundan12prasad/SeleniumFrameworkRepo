package com.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Test;

public class ParallelClasses01 {	
	WebDriver driver=null;
	
	@Test
	public void test01() {		
		System.out.println("I am in test01_Class01 - ID: " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe" );	
		driver = new ChromeDriver();
		driver.get("https://www.google.com/docs/about/");
	}
	
	@Test
	public void test02() {		
		System.out.println("I am in test02_Class01 - ID: " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test03() {		
		System.out.println("I am in test02_Class01 - ID: " + Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://www.g.com");
	}
	
	

}
