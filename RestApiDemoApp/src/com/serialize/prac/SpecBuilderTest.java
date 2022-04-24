package com.serialize.prac;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import com.pojo.AddPlace;
import com.pojo.Location;

public class SpecBuilderTest {
	
	public static void main(String[] args)
	{
		RestAssured.baseURI="https://rahulshettyacademy.com";
		AddPlace adp=new AddPlace();
		adp.setAccuracy(50);
		adp.setName("Frontline house");
		adp.setPhone_number("(+91) 983 893 3937");
		adp.setAddress("29, side layout, cohen 09");
		adp.setWebsite("http://google.com");
		adp.setLanguage("French-IN");
		List<String>listTypes=new ArrayList<String>();
		listTypes.add("shoe park");
		listTypes.add("shop");		
		adp.setTypes(listTypes);
		Location location=new Location();
		location.setLat(-38.383494);
		location.setLng(33.427362);		
		adp.setLocation(location);
		
		
		//implementing spec builder:
		
		//Creating the object of RequestSpecBuilder
		RequestSpecBuilder rsb=new RequestSpecBuilder();
		//Following parameters are commons so wrapped it in spec builder object
		RequestSpecification resSpec = rsb.setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick")
		.setContentType(ContentType.JSON).build();
		
		//calling the requestspecification object using spec method
		RequestSpecification actualreqSpec = given().spec(resSpec).body(adp);		 //request is hold to one RequestSpecification object
		//creating the object of ResponseSpecBuilder class
		ResponseSpecBuilder rspSpecBuilder=new ResponseSpecBuilder();
		//generalize the response spec builder parameter
		ResponseSpecification  respSpec = rspSpecBuilder.expectStatusCode(200).expectContentType(ContentType.JSON).build();
		Response response = actualreqSpec.when().post("/maps/api/place/add/json")
		.then().spec(respSpec).extract().response();
		String responseString = response.asString();
		System.out.println(responseString);
		
		
		
		
		
		
	}
	

}
