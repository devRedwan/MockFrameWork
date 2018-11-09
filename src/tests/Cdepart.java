package tests;

import org.testng.annotations.Test;

import base.config;
import locators.locators;
import values.values;

public class Cdepart extends config {

	locators loc = new locators();
	values val = new values();
	
	@Test
	public void tc04a (){
		//User should be able to enter integer values in the "Depart" & "Guests" text-boxes

		String locdepartint = typebyxpath (loc.departdate, val.tc03txtbxinteger);
		if (locdepartint==val.tc03txtbxinteger){System.out.println("PASS: depart textbox is active for integers");}
		else                                   {System.out.println("FAIL: depart textbox rejects integers");}
		
		String locguestsint   = typebyxpath (loc.passenger, val.tc03txtbxinteger);
		if (locguestsint==val.tc03txtbxinteger){System.out.println("PASS: guests textbox is active for integers");}
		else                                   {System.out.println("FAIL: guests textbox allows integers");}
		
		
	}
	
	@Test
	public void tc04b(){
	// User should NOT be able to enter letters in the "Depart", "Guests" text-fields
		String locdepartltr = typebyxpath (loc.departdate, val.tc03txtbxletters);
		if (locdepartltr==val.tc03txtbxletters){System.out.println("FAIL: depart textbox is active for letters");}
		else                                   {System.out.println("PASS: depart textbox is NOT active for letters");}
		
		String locguestsltr  = typebyxpath (loc.passenger, val.tc03txtbxletters);
		if (locguestsltr==val.tc03txtbxletters){System.out.println("FAIL: Guests textbox allows letters");}
		else                                   {System.out.println("PASS: Guests textbox rejects letters");}
		
	}
	
}
