package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import PageObjectM.CreatingaccountPageO;

public class TC002Creatingaccount extends DriverInitialization{
	
	@Test(testName="test2")
	public static void AccountCreation() throws Exception {
	
	CreatingaccountPageO crtact = new CreatingaccountPageO(driver);	
	crtact.Accountbutton().click();
	logger.info("Clicked on button");	
	crtact.Creatingact().click();	
	logger.info("Clicked on Create account button");	
	crtact.firstname().sendKeys("Shanu");
	logger.info("Entered First Name");
	crtact.Lasrtname().sendKeys("Shekhavat");
	logger.info("Entered Last Name");
	crtact.emailid().sendKeys("shanu@gmail.com");
	logger.info("Entered email ");
	crtact.password().sendKeys("Rathore123");
	logger.info("Entered Password");
	crtact.Confirmpassword().sendKeys("Rathore123");
	logger.info("Entered Confirm Password");
	crtact.submit().click();
	logger.info("Clicked on Submit button");
	String actualtext = driver.getTitle();
	String expectedtext = "Create New Customer Account | Kitchen Stuff Plus";
	Assert.assertEquals(actualtext, expectedtext);
	
	
	
}}
