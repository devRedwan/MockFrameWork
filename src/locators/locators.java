package locators;

public class locators {
	
	public String locationfrom = "//*[@id='s2id_location_from']/a/span[1]";  // 1st text-box "Enter City or Airport" location from 
	
	
	public String locationto   = "//*[@id='s2id_location_to']/a/span[1]";    // 2nd text-box "Enter City or Airport" location from 
	public String departdate   = "//input[@placeholder='Depart']";           // depart calendar date textbox 
	public String returndate   = "//input[@placeholder='Return']";           // return calendar date text-box
	public String passenger    = "//input[@name='totalManualPassenger'][@placeholder='0']"; // guests/passenger amount text-box
	public String onewaybtn    = "//div[@role='tabpanel']/form/div[9]/div/div/div/input[@id='oneway']"; // one-way radio button under the 1st text-box
	public String rndtrpbtn    = "//div[@role='tabpanel']/form/div[9]/div/div/div/input[@id='round']"; // round trip radio button next to one-way 
	public String srchbtn      = "//*[@id='flights']/form/div[6]/button"; // search button all the way to the right 
	public String flightstab   = "//div[@class='col-md-12']/ul/li[2]/a"; // flight tab xpath

}