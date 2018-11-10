package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import locators.locators;
import utils.webdriverfunctions;


@SuppressWarnings("unused")
public class config extends webdriverfunctions {

	locators loc = new locators();
	String browser = "firefox"; // Browser opening decider
	
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
		xpathclick (loc.flightstab);
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS); // for loading pages with huge stress
	//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // wait 30 seconds after maximizing to load all the necessary elements
		
		
	}
	
}
