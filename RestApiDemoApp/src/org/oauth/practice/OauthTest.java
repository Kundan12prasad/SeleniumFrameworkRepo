package org.oauth.practice;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pojo.Api;
import com.pojo.GetCourse;
import com.pojo.WebAutomation;


public class OauthTest {

	
	public static void main(String args[]) throws InterruptedException
	{
		String[] coursesTitle= {"Selenium webdriver java","Cypress","Protractor"};
				
		
		
		//google gmail not supporting login through automation:
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\KESHAV\\Documents\\chromedriver.exe"); WebDriver driver = new
		 * ChromeDriver(); driver.get(
		 * "https://accounts.google.com/o/oauth2/v2/auth/identifier?scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&auth_url=https%3A%2F%2Faccounts.google.com%2Fo%2Foauth2%2Fv2%2Fauth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https%3A%2F%2Frahulshettyacademy.com%2FgetCourse.php&flowName=GeneralOAuthFlow"
		 * ); driver.findElement(By.cssSelector("input[type='email']")).sendKeys(
		 * "srinath19830");
		 * driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Keys.ENTER
		 * );
		 * driver.findElement(By.cssSelector("input[type='password']")).sendKeys("xxxx")
		 * ; driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Keys.
		 * ENTER); Thread.sleep(4000);
		 */
		//String currentUrl = driver.getCurrentUrl();
		String currentUrl="https://rahulshettyacademy.com/getCourse.php?code=4%2F0AX4XfWjSCqOBQmWTG0l4B48OPGUCPpRYpNGWDTXcLI6Mmie8NDPEKp5F3tRYihJlRWeCXQ&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=consent";
		String partialCode = currentUrl.split("code")[1]; 
		String code = partialCode.split("&scope")[0];
		System.out.println(code);
		
		
		String accessTokenResponse = given().urlEncodingEnabled(false).queryParams("code",code)
		.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
		.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
		.queryParams("grant_type", "authorization_code")
		.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
		.when().log().all().post("https://www.googleapis.com/oauth2/v4/token").asString();
		JsonPath js=new JsonPath(accessTokenResponse);
		String accessToken = js.getString("access_token");		
		
		
		/*String response = given().queryParam("access_token", accessToken)
		.when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();
		System.out.println(response); */	
		
		
		//getting the response and converting into java object
		//attaching our pojo class to actual response
		
		GetCourse getCourse = given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON)
				.when().get("https://rahulshettyacademy.com/getCourse.php").as(GetCourse.class);
		     System.out.println(getCourse.getLinkedIn());
		     System.out.println(getCourse.getInstructor());		     
			 //System.out.println(getCourse);	
		System.out.println(getCourse.getCourses().getApi().get(1).getCourseTitle());
		List<Api> apiCourses = getCourse.getCourses().getApi();
		for(int i=0;i<apiCourses.size();i++)
		{
			if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUi services Testing"))
			{
		   System.out.println(apiCourses.get(i).getPrice());
				
			}			
			
		}
		
		ArrayList<String>al=new ArrayList<>();
		
		List<WebAutomation> webAutomationCourses = getCourse.getCourses().getWebAutomation();
		for(int j=0;j<webAutomationCourses.size();j++)
		{
		//System.out.println(webAutomationCourses.get(j).getCourseTitle());
		al.add(webAutomationCourses.get(j).getCourseTitle());
			
		}
		
		//converting array into arraylist
		List<String> expectedArrayList = Arrays.asList(coursesTitle);
		Assert.assertTrue(al.equals(expectedArrayList));


	}

}
