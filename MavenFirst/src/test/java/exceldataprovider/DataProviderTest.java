package exceldataprovider;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	WebDriver driver=null;
	
	@BeforeTest
	public void setUp() {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");		
	}
	
	@Test(dataProvider="excel-data" , dataProviderClass = GetExcelData.class)
	public void signIn(String username, String password) {				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
		String msg = driver.findElement(By.xpath("//div[@id='flash']")).getText();	
		
		Assert.assertEquals(msg.contains("is invalid!"), true);		
	}

	@AfterTest
	public void closeBrowser() {		
		driver.quit();
	}
	

}
