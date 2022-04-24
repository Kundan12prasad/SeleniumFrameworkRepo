package org.practice;

import org.files.Payload;

import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) 
	{
		JsonPath js=new JsonPath(Payload.coursePrice()); //mocking the response, because not getting the response from any actual api
      
		//1. Print No of courses returned by API
		int count = js.getInt("courses.size()");
		System.out.println(count);
		//2.Print Purchase Amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//3.Print Title of the first course
		String firstCourseTitle = js.getString("courses[0].title");
		System.out.println(firstCourseTitle);
		
		//4.Print All course titles and their respective Prices
		for(int i=0;i<count;i++)
		{
			String  courseTitles = js.get("courses["+i+"].title");
			String price = js.getString("courses["+i+"].price");
			System.out.println(courseTitles);
			System.out.println(price);		
			
		}
		
		//Print no of copies sold by RPA Course
		System.out.println("Print no of copies sold by RPA Course");
		for(int i=0;i<count;i++)
		{
			String  courseTitles = js.get("courses["+i+"].title");
			if(courseTitles.equalsIgnoreCase("RPA"))
			{
				 int noOfCopies= js.getInt("courses["+i+"].copies");
				 System.out.println(noOfCopies);
				 break;
			
			}
		}
		
		
		
		
	}

}
