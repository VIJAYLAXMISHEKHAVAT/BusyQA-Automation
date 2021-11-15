package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import PageObjectM.CreatingaccountPageO;

public class TC001Landing extends DriverInitialization {

	@Test(testName="test1")
		public static void Homepage() throws Exception {
		
	String Actualpage = driver.getTitle();
	
	logger.info("Getting actual name of page ");
	String Expectedpage = "Kitchen Stuff Plus | Houseware & Home Decor Retailer";
	
	Assert.assertEquals(Actualpage, Expectedpage);	
	logger.info("Matching Actual page name and expected page name");
	
	
	
	

}}
