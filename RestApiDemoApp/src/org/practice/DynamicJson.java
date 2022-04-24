package org.practice;

import org.files.Payload;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static  io.restassured.RestAssured.*;

public class DynamicJson {
	
	@Test(dataProvider="BooksData")
	public void addBook(String isbn,String aisle)
	{
		
		RestAssured.baseURI="http://216.10.245.166";
		String response = given().log().all().header("Content-Type", "application/json").body(Payload.addBook(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		
		JsonPath js=new JsonPath(response);
		String id = js.getString("ID");
		System.out.println(id);	
		
		
	}
	
	
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		//each array will hold the data for 1 book
		
//		Object data=new Object[3][3];
//		data[0][0]
		
		return new Object[][] {{"PKRTY","5200"},{"LPCTY","6200"},{"MPCTY","7000"}};
		
		
	}

}
