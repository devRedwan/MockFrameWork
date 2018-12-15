package tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiraBhaiProject {

	public static void main(String[] args) throws InterruptedException {

		// initiate driver+browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Redwan\\workspace\\MockFrameWork\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open the browser
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(300);

		//Clicking on Bootstrap menu
		WebElement x = driver.findElement(By.xpath("//a[@title='Google apps']"));
		x.click();
		Thread.sleep(300);
		
		// the Bootstrap menu area 
		WebElement menus = driver.findElement(By.xpath("//div[@class='gb_9 gb_nd gb_R gb_g']/div[2]/ul"));
		List<WebElement> sublinks = menus.findElements(By.tagName("a"));
		
		WebElement morebutton = driver.findElement(By.xpath("//*[@id='gbwa']/div[2]/a[1]"));
		morebutton.click();
		WebElement moreMenu = driver.findElement(By.xpath("//*[@id='gbwa']/div[2]/ul[2]"));
		List<WebElement> moresublinks = moreMenu.findElements(By.tagName("a"));

		//obtaining all hyper link under that bootstrap menu
		for(int i=0; i<sublinks.size(); i++) {
			 WebElement z = sublinks.get(i);
			 String url1 = z.getAttribute("href");

			 //calling the method below to check if the URL is broken or good
			 verifyLink(url1);
		}
		
		for (int k=0; k<moresublinks.size();k++){
			WebElement y= moresublinks.get(k);
			String url2 = y.getAttribute("href");
			verifyLink(url2);
		}
		
		 driver.quit();

		}

	private static void verifyLink(String urlLink) {
		
		try{
			URL link = new URL(urlLink);
			HttpURLConnection con = (HttpURLConnection)link.openConnection();
			con.setConnectTimeout(2000);
			con.connect();
			Thread.sleep(3000);
			
			if (con.getResponseCode()==200){
				System.out.println(urlLink+" - "+con.getResponseMessage());
			}
			else{
				System.out.println( " === Something is wrong with this one======>>>>>"+ urlLink );
			}
			
		}
		
		catch (Exception e){
			
		}
		
	}
	}

