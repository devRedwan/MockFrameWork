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

public class handm {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Redwan\\workspace\\Selenium\\Jar\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www2.hm.com/en_gb/index.html");
		driver.manage().window().maximize();
		Thread.sleep(300);

		driver.findElement(By.xpath("//*[@id='gdpr-modal']/div[2]/button")).click();
		Thread.sleep(300);
		//WebElement x = driver.findElement(By.xpath("/html/body/header/div[2]/div[2]/nav/ul/li[7]/a")); //  main menu
		WebElement sub_x_area = driver.findElement(By.xpath("/html/body/footer/div")); // sub-header area
//		Actions DD = new Actions(driver);
//		DD.moveToElement(x).perform();
//
		List<WebElement> allsublinks = sub_x_area.findElements(By.tagName("a"));		
		System.out.println("The total number of links under LADIES is: "+allsublinks.size());

		for(int i=0; i<allsublinks.size(); i++) {
			 WebElement z = allsublinks.get(i);
			 String url = z.getAttribute("href");
			 verifyLink(url);
		}
		
		driver.quit();

		}

	private static void verifyLink(String urlLink) {
		
		try{
			URL link = new URL(urlLink);
			HttpURLConnection con = (HttpURLConnection)link.openConnection();
			con.setConnectTimeout(2000);
			con.connect();
			
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

