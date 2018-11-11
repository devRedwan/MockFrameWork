package utils;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import values.values;


public class webdriverfunctions {

	protected WebDriver driver ; 
	values val= new values();
	
    public String typebyxpath(String loc, String val){
    	driver.findElement(By.xpath(loc)).clear();
    	driver.findElement(By.xpath(loc)).sendKeys(val);return val ;} 
	
	public String xpathclick (String loc){driver.findElement(By.xpath(loc)).click();return loc;	}
	
	public String placeholdtext (String loc){return driver.findElement(By.xpath(loc)).getAttribute("placeholder");}
	
	public boolean displayverification (String loc){return driver.findElement(By.xpath(loc)).isDisplayed();}
	
	public String textverification (String loc)
	{return driver.findElement(By.xpath(loc)).getAttribute("value");}

	public boolean txtverify(String loc, String value){
		try{
			assertEquals(Integer.parseInt(driver.findElement(By.xpath(loc)).getAttribute("value")), val);
		
		return true;
	
		}
		catch(Throwable t){
			System.out.println(t.getMessage());
			return false;
		}
	}
}
