package locators;

public class locators {
	
	// flight tab xpath
	public String flightstab   = "//div[@class='col-md-12']/ul/li[2]/a"; 
	// 1st text-box "Enter City or Airport" location from 
	public String locationfrom = "//*[@id='s2id_location_from']/a/span[1]"; 
    // 2nd text-box "Enter City or Airport" location from
	public String locationto   = "//*[@id='s2id_location_to']/a/span[1]";    
	// depart calendar date text-box
	public String departdate   = "//input[@placeholder='Depart']";            
	// return calendar date text-box
	public String returndate   = "//input[@placeholder='Return']";           
	// guests/passenger amount text-box
	public String passenger    = "//input[@name='totalManualPassenger'][@placeholder='0']"; 
	// one-way radio button under the 1st text-box
	public String onewaybtn    = "//*[@id='flights']/form/div[9]/div[1]/div/div/ins";
	// round trip radio button next to one-way
	public String rndtrpbtn    = "//*[@id='flights']/form/div[9]/div[2]/div/div/ins";  
	// search button all the way to the right
	public String srchbtn      = "//*[@id='flights']/form/div[6]/button";  
}