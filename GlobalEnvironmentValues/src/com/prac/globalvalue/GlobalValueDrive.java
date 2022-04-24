package com.prac.globalvalue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValueDrive {

	public static void main(String[] args) throws IOException {
		Properties properties=new Properties();
		FileInputStream fis=new FileInputStream("G:\\SeleniumPractice\\GlobalEnvironmentValues\\src\\data.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		 properties.setProperty("browser", "firefox");
		 System.out.println(properties.getProperty("browser"));
		 FileOutputStream fos=new FileOutputStream("G:\\SeleniumPractice\\GlobalEnvironmentValues\\src\\data.properties");
		 properties.store(fos, null);

	}

}
