package utils;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import values.values;

public class webdriverfunctions {
	values val= new values();
	protected WebDriver driver ; 

	public String typebyxpath(String loc, String val){
		driver.findElement(By.xpath(loc)).clear();
		driver.findElement(By.xpath(loc)).sendKeys(val);
		return val ;
	} 

	public String xpathclick (String loc){
		driver.findElement(By.xpath(loc)).click();
		return loc;
	}

	public String placeholdtext (String loc){
		return driver.findElement(By.xpath(loc)).getAttribute("placeholder");
	}

	public boolean displayverification (String loc){
		return driver.findElement(By.xpath(loc)).isDisplayed();
	}

	public String textverification (String loc)	{
		return driver.findElement(By.xpath(loc)).getAttribute("value");
	}

	public boolean txtverify(String loc, String val){
		try{assertEquals(driver.findElement(By.xpath(loc)).getAttribute("value"), val); 
		return true;
		}
		catch (Throwable t){
			System.out.println(t.getMessage()); 
			return false;
		}
	}
	
	public boolean intverify(String loc, int val){
		try{equals(Integer.parseInt((driver.findElement(By.xpath(loc)).getAttribute("value")), val)); 
		return true;
		}
		catch (Throwable t){
			System.out.println(t.getMessage()); 
			return false;
		}
	}

//	public void intverify (String loc){
//		WebElement actText = driver.findElement(By.xpath(loc));
//		String enteredValue = actText.getAttribute("value");
//		// convert string to int
//		int convertString = Integer.parseInt(enteredValue);
//		System.out.println("Actual Integer output is: " + convertString);
//		
//	}
}
