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
		
		if (displayver[0]!=true){
			System.out.println("FALSE: 1st textbox is NOT displayed");
			}
	
		if (displayver[1]!=true){
			System.out.println("FALSE: 2nd textbox is NOT displayed");
		}
		
		if (displayver[2]!=true){
			System.out.println("FALSE: 'Depart' textbox is NOT displayed");
		}
		
		if (displayver[3]!=true){
			System.out.println("FALSE: 'Return' textbox is NOT displayed");
			}
		
		if (displayver[4]!=true){
			System.out.println("FALSE: 'Guests/Passengers' textbox is NOT displayed");
			}
		
		if (displayver[5]!=true){
			System.out.println("FALSE: 'One way' radio-button is NOT displayed");
			}
		
		if (displayver[6]!=true){
			System.out.println("FALSE: 'Round trip' radio-button is NOT displayed");
			}
		
		if (displayver[7]!=true){
			System.out.println("FALSE: 'Search' button is NOT displayed");
			}
	}	
}
