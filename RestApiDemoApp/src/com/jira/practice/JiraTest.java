package com.jira.practice;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;
public class JiraTest {

	public static void main(String[] args) 
	{
		
		RestAssured.baseURI = "http://localhost:8555";
		SessionFilter session=new SessionFilter();
		//Login Scenario:
		String response = given().header("Content-Type","application/json").body("{ \"username\": \"kundanprasad\", \r\n"
				+ "\"password\": \"Pine2000@apple\" \r\n"
				+ "}").log().all().filter(session).when().post("rest/auth/1/session").then().log().all().extract().response().asString();
		
		
		
		//Create Jira Issue by Rest automation
		//add Comment
		String expectedMessage="Hi How are you";
		
		String commentResponse = given().pathParam("key","RAA-1").log().all().header("Content-Type","application/json").body("\r\n"
				+ "    \"body\": \""+expectedMessage+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}")
		.filter(session).when().post("/rest/issue/{key}/comment")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		JsonPath path=new JsonPath(commentResponse);
		String commentId = path.getString("id");
		
		//Add Attachment:		
		 given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key","RAA-1")
		.header("Content-Type","multipart/form-data")
		.multiPart("file",new File("jira.txt"))
		.when().post("/rest/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
		 
		 //get issue:
		 String issueDetails = given().filter(session).pathParam("key", "RAA-1")
		.queryParam("fields", "comment").log().all().when().get("/rest/issue/{key}")
		 .then().log().all().extract().response().asString();
		 System.out.println(issueDetails);
		 
		 //suppose in json if your field is comment and there is an multiple field comments 
		 //then how will you extract your comment: by parsing the complex json 
		 
         JsonPath js=new JsonPath(issueDetails);
         int commentsCount= js.getInt("fields.comment.comments.size()");
         for(int i=0;i<commentsCount;i++)
         {
        	        	 
        //System.out.println(js.getInt("fields.comment.comments["+i+"].id")); 
        	 String commentIdIssue = js.get("fields.comment.comments["+i+"].id").toString();
        	 if(commentIdIssue.equalsIgnoreCase(commentId))
        	 {
        		 String message = js.get("fields.comment.comments["+i+"].body").toString();
        		 System.out.println(message);
        		 Assert.assertEquals(message, expectedMessage);        		 
        		 
        	 }
        	 
         }
	}

}
