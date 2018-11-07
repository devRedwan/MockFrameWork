package tests;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.config;
import locators.locators;
import values.values;

public class Bfirst2textbox extends config {

	locators loc = new locators();
	values val = new values();
	
	
	@Test
	public void tc02(){
	    // Verify that first 2 text-boxes have “Enter City or Airport” text displayed by default, when not focused
		String locfrom = placeholdtext (loc.locationfrom);
		String locto   = placeholdtext (loc.locationto);

		if (locfrom == "Enter City or Airport"){System.out.println("PASS: correct placeholder text in-place for TEXTBOX#1");}
		else                                   {System.out.println("FAIL: correct placeholder text NOT in-place for TEXTBOX#1");}
	
		if (locto == "Enter City or Airport"){System.out.println("PASS: correct placeholder text in-place for TEXTBOX#2");}
		else                                 {System.out.println("FAIL: correct placeholder text NOT in-place for TEXTBOX#2");}
		throw new SkipException("This test is not needed right now");
	}
	
	
	
	@Test
	public void tc03 (){
		//User should be able to enter only letters in the "Enter Ciry or Airport" text-boxes
		
		typebyxpath (loc.locationfrom, val.tc03txtbx);
		typebyxpath (loc.locationto, val.tc03txtbx);
		
		
//		if (locfromtxt==val.tc03txtbx){System.out.println("PASS: textbox#1 is active");}
//		else                          {System.out.println("FAIL: textbox#1 is NOT active");}
//		
//		if (loctotxt==val.tc03txtbx)  {System.out.println("PASS: textbox#1 is active");}
//		else                          {System.out.println("FAIL: textbox#2 is NOT active");}
		
	}

}
