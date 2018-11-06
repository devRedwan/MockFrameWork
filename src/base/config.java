package base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import utils.webdriverfunctions;

@SuppressWarnings("unused")
public class config extends webdriverfunctions {

	String browser = "chrome"; // Browser opening decider
	String hello = "hello";
	
	@BeforeTest
	public void initialbrowsers(){
		
		// Chrome Browser Opening
		if (browser.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver() ; 
		
		}
		
		// FireFox Browser Opening
		if (browser.equalsIgnoreCase("firefox")){
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		}
		
		driver.get("https://www.phptravels.net/"); // open the browser
		driver.manage().window().maximize(); // after opening, maximize the window
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS); // for loading pages with huge stress
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // wait 30 seconds after maximizing to load all the necessary elements
		
	}
	
}
