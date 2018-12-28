package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import locators.locators;
import utils.webdriverfunctions;


@SuppressWarnings("unused")
public class config extends webdriverfunctions {
	locators loc = new locators();

	// Browser opening decider
	String browser = "chrome"; 

	@BeforeTest
	public void initialbrowsers1(){

		// Open Chrome Browser 
		if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver(); 		
		}

		// Open FireFox Browser 
		if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// open the browser
		driver.get("https://www.phptravels.net/"); 
		// after opening, maximize the window
		driver.manage().window().maximize();
		// CLick on flights tab
		xpathclick (loc.flightstab);

		//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS); // for loading pages with huge stress
		//	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); // wait 30 seconds after maximizing to load all the necessary elements

	}


	@AfterTest
	public void initialbrowsers(){
        //after testing, quit the browsers
		driver.close();
	}
}