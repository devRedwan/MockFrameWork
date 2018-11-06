package tests;

import org.testng.annotations.Test;

import base.config;
import locators.locators;
import values.values;

public class Bfirst2textbox extends config {

	locators loc = new locators();
	values val = new values();
	@Test
	public void tc02(){
	
		String locfrom = placeholdtext (loc.locationfrom);
		System.out.println(locfrom);
		String locto = placeholdtext (loc.locationto);
		System.out.println(locto);
		
	
		
	}

}
