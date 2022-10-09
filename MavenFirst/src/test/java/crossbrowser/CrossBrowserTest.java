package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver = null;
    
	@Parameters("browser")
	@Test
	public void setup(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			// execute in chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KESHAV\\Documents\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			// execute in firefox browser
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\KESHAV\\Documents\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}

		else if (browserName.equalsIgnoreCase("edge")) {
			// execute in edge browser
			System.setProperty("webdriver.edge.driver", "C:\\Users\\KESHAV\\Documents\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com");
		}
	}
	
}
