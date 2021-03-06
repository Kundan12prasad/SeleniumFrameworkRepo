package com.serialize.prac;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import com.pojo.AddPlace;
import com.pojo.Location;

public class SerializeTest {
	
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
		
		Response response = given().queryParam("key","qaclick123").body(adp).when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response();
		String responseString = response.asString();
		System.out.println(responseString);
		
	}
	

}
