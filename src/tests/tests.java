package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.config;
import locators.locators;
import values.values;

public class tests extends config {

	locators loc = new locators();
	values val = new values();
	
	@Test
	public void tc01(){
		
		
	}
	
	@Test
	public void tc02(){
	
		String locfrom = placeholdtext (loc.locationfrom); // test
		System.out.println(locfrom);
		String locto = placeholdtext (loc.locationto);
		System.out.println(locto);
		
	
		
	}
	
}
