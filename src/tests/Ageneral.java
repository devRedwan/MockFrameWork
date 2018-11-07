package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.config;
import locators.locators;
import values.values;

@SuppressWarnings("unused")
public class Ageneral extends config {

	locators loc = new locators();
	values val = new values();
	
	@Test
	public void tc01(){
		// Verify that all fields are visible with the search button
		boolean displayver[] = new boolean [8];		
		displayver[0] = displayverification(loc.locationfrom); 
		displayver[1] = displayverification(loc.locationto);
		displayver[2] = displayverification(loc.departdate);
		displayver[3] = displayverification(loc.returndate);
		displayver[4] = displayverification(loc.passenger);
		displayver[5] = displayverification(loc.onewaybtn);
		displayver[6] = displayverification(loc.rndtrpbtn);
		displayver[7] = displayverification(loc.srchbtn);
		
		if (displayver[0]==true){System.out.println("PASS: 1st textbox is displayed");}
		else                    {System.out.println("FAIL: 1st textbox is NOT displayed");}
		
		if (displayver[1]==true){System.out.println("PASS: 2nd textbox is displayed");}
		else                    {System.out.println("FAIL: 2nd textbox is NOT displayed");}
		
		if (displayver[2]==true){System.out.println("PASS: 'Depart' textbox is displayed");}
		else                    {System.out.println("FAIL: 'Depart' textbox is NOT displayed");}
		
		if (displayver[3]==true){System.out.println("PASS: 'Return' textbox is displayed");}
		else                    {System.out.println("FAIL: 'Return' textbox is NOT displayed");}
		
		if (displayver[4]==true){System.out.println("PASS: 'Guests/Passengers' textbox is displayed");}
		else                    {System.out.println("FAIL: 'Guests/Passengers' textbox is NOT displayed");}
		
		if (displayver[5]==true){System.out.println("PASS: 'One way' radio-button is displayed");}
		else                    {System.out.println("FAIL: 'One way' radio-button is NOT displayed");}
		
		if (displayver[6]==true){System.out.println("PASS: 'Round trip' radio-button is displayed");}
		else                    {System.out.println("FAIL: 'Round trip' radio-button is NOT displayed");}
		
		if (displayver[7]==true){System.out.println("PASS: 'Search' button is displayed");}
		else                    {System.out.println("FAIL: 'Search' button is NOT displayed");} 
		
	}
	
}
