package org.practice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.files.Payload;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestApiBasics {

	@Test
	public  void testPlaceApi() throws IOException
	{
		//pass the base url:		
		//Given All input details
		//When Submit the API i.e perform action
		//then validate the API From generated response
		
       /* RestAssured.baseURI = "https://rahulshettyacademy.com/#/index";		
		//RestAssured.useRelaxedHTTPSValidation();
		String response = given().log().all().queryParam("key", "qaclick123").headers("Content-Type","application/json")
		.body(Payload.addPlace()).when().post("/maps/api/place/add/json")
		       .then().log().all().assertThat().statusCode(200)
		       .body("scope",equalTo("APP")).header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		        //System.out.println(response);
		       
		JsonPath js=new JsonPath(response);   //for parsing the json
		String placeId = js.getString("place_id"); //extracting the place id from json and store it to string var
		System.out.println(placeId);  */
		
		
		//handling json from external file
		//convert the Json file to java string-->for that first convert thejson file into Byte-->then Byte data to string
		
		RestAssured.baseURI = "https://rahulshettyacademy.com/#/index";		
		//RestAssured.useRelaxedHTTPSValidation();
		String response = given().log().all().queryParam("key", "qaclick123").headers("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\KESHAV\\Documents\\addPlace.json")))).when().post("/maps/api/place/add/json")
		       .then().log().all().assertThat().statusCode(200)
		       .body("scope",equalTo("APP")).header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		        //System.out.println(response);
		       
		JsonPath js=new JsonPath(response); //for parsing the json
		String placeId = js.getString("place_id"); //extracting the place id from json and store it to string var
		System.out.println(placeId);
		
		
		
		
		//Update Place
		String newAddress="70 winter walk, USA";
		given().log().all().queryParam("key", "qaclick123").headers("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\": \""+placeId+"\",\r\n"
				+ " \"address\": \""+newAddress+"\",\r\n"
				+ " \"key\":\"qaclick123\"\r\n"
				+ "}")
		.when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200)
		.body("msg", equalTo("Address successfully updated"));
		
		//verify through get place:
		
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeId)
		.when().get("maps/api/place/get/json").then().assertThat().log().all().statusCode(200)
		.extract().response().asString();
		JsonPath js1=new JsonPath(getPlaceResponse);
		String actualAddress = js1.getString("address");  //from json extracting string to this address path
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress, newAddress);
		
		
		
		
	}

	
}
