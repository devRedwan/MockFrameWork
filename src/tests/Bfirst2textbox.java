package tests;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.config;
import locators.locators;
import values.values;

@SuppressWarnings("unused")
public class Bfirst2textbox extends config {

	locators loc = new locators();
	values val = new values();
	
	
	@Test
	public void tc02(){
	    // Verify that first 2 text-boxes have “Enter City or Airport” text displayed by default, when not focused
		String locfrom = placeholdtext (loc.locationfrom);
		if (locfrom == "Enter City or Airport"){System.out.println("PASS: correct placeholder text in-place for TEXTBOX#1");}
		else                                   {System.out.println("FAIL: correct placeholder text NOT in-place for TEXTBOX#1");}

		String locto   = placeholdtext (loc.locationto);
		if (locto == "Enter City or Airport")  {System.out.println("PASS: correct placeholder text in-place for TEXTBOX#2");}
		else                                   {System.out.println("FAIL: correct placeholder text NOT in-place for TEXTBOX#2");}
//		throw new SkipException("This test is not needed right now");
	}
	
	
	
	@Test
	public void tc03a (){
		//User should be able to enter only letters in the "Enter Ciry or Airport" text-boxes

		String locfromltr = typebyxpath (loc.locationfrom, val.tc03txtbxletters);
		if (locfromltr==val.tc03txtbxletters){System.out.println("PASS: textbox#1 is active for letters");}
		else                                 {System.out.println("FAIL: textbox#1 is NOT active for letters");}
		
		String loctoltr  = typebyxpath (loc.locationto, val.tc03txtbxletters);
		if (loctoltr==val.tc03txtbxletters)  {System.out.println("PASS: textbox#1 is active");}
		else                                 {System.out.println("FAIL: textbox#2 is NOT active");}
		
	}
	
	@Test
	public void tc03b (){
		//User should NOT be able to enter integer values in the "Enter Ciry or Airport" text-boxes

		String locfromint = typebyxpath (loc.locationfrom, val.tc03txtbxinteger);
		if (locfromint!=val.tc03txtbxinteger){System.out.println("PASS: textbox#1 is active for only letters");}
		else                                 {System.out.println("FAIL: textbox#1 allows integers");}
		
		String loctoint   = typebyxpath (loc.locationto, val.tc03txtbxinteger);
		if (loctoint!=val.tc03txtbxinteger)  {System.out.println("PASS: textbox#1 is active for only letters");}
		else                                 {System.out.println("FAIL: textbox#2 allows integers");}
		
		
	}
	

}
