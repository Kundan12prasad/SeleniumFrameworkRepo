package com.practice.Exceldatadrive.ExcelDataDrive;
import java.io.IOException;
import java.util.ArrayList;

import com.practice.Exceldatadrive.ExcelDataDrive.DataDrivenTest;

public class DataSample {

	public static void main(String[] args) throws Exception 
	{
		DataDrivenTest dataDrivenTest=new DataDrivenTest();
		ArrayList<String> data = dataDrivenTest.getData("AddProfile");
		  System.out.println(data.get(0));
		  System.out.println(data.get(1));
		  System.out.println(data.get(2));
		  System.out.println(data.get(3));
		

		
		
	}

}
