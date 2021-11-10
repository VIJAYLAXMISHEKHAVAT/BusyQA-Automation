package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import PageObjectM.CreatingaccountPageO;

public class TC001Landing extends DriverInitialization{

	@Test
		public void Homepage() throws Exception {
		driver = InitialationBrowsers();
		driver.get("https://www.kitchenstuffplus.com");
	String Actualpage = driver.getTitle();
	String Expectedpage = "Kitchen Stuff Plus | Houseware & Home Decor Retailer";
	Assert.assertEquals(Actualpage, Expectedpage);	
	driver.close();

}
}