package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public  WebDriver driver = null;
	public Properties prop=null;
	public WebDriver initializeDriver() throws IOException 
	{
		
		 prop = new Properties();
		// we need to pass the location of properties file as as an argument of FIS class
		
		 //path is hardcoded here
		FileInputStream fis = new FileInputStream(
				"G:\\SeleniumPractice\\E2EProject\\src\\main\\java\\resources\\data.properties");	
		prop.load(fis);
		
		// to remove the path hardcoding and make dynamic		
		/* FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");  */
		
		//mvn test -Dbrowser=chrome
		/*String browserName = System.getProperty("browser");  //controlling the browser property through maven command
		System.out.println("browserName"); */
		
		String browserName = prop.getProperty("browser");  //getting the value from data.properties file
		System.out.println("BrowserName");

		if (browserName.equals("chrome"))
		{
			// execute in chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");			
			driver = new ChromeDriver();			
			
			//running test in headless mode
			/*ChromeOptions options=new ChromeOptions();
			if(browserName.contains("headless"))
			{
			options.addArguments("headless");
			}
			driver = new ChromeDriver(options); */
		} 
		
		else if (browserName.equals("firefox"))
		{
			// execute in chrome browser
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\KESHAV\\Documents\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if (browserName.equals("edge"))
		{
			// execute in chrome browser
			System.setProperty("webdriver.edge.driver", "C:\\Users\\KESHAV\\Documents\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;		
	}
	
	public String getScreenshotPath(String testCaseName,WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
				
		File source = ts.getScreenshotAs(OutputType.FILE);	
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";		
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		
	}
	
	

}
