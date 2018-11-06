package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webdriverfunctions {

	protected WebDriver driver ; 
	
	
	public void typebyxpath (String loc, String val){
		
		driver.findElement(By.xpath(loc)).sendKeys(val);
		
	}
	
	public void xpathclick (String loc){
		
		driver.findElement(By.xpath(loc)).click();
		
	}
	
	public String placeholdtext (String loc){
		
		return driver.findElement(By.xpath(loc)).getAttribute("placeholder");
	}
	
	public void displayverification (String loc){
		
		driver.findElement(By.xpath(loc)).isDisplayed();
	}
	
}
