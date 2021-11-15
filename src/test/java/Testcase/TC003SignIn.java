package Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import PageObjectM.CreatingaccountPageO;
import PageObjectM.Signinpageobj;

public class TC003SignIn extends DriverInitialization{
	
     	@Test(testName="test3")
			public static  void singin() throws Exception {
			
     		CreatingaccountPageO crt= new CreatingaccountPageO(driver);			
					
			crt.Accountbutton().click();
			
			Signinpageobj sb = new Signinpageobj(driver);			
			
			sb.Siginbtn().click();
			
			logger.info("Clicked on Sigin button");	
			sb.Emailtext().sendKeys("email");
			logger.info("Entered email");	
			sb.Passtext().sendKeys("password");
			logger.info("Entered Password");
			sb.Submitbtn().click();
			logger.info("Clicked on Submit button");
			
			String Actualpage = driver.getTitle();
			
			System.out.println(Actualpage);
			
			logger.info("Getting actual name of page ");
			String Expectedpage = "Customer Login | Kitchen Stuff Plus";
			
			Assert.assertEquals(Actualpage, Expectedpage);	
			logger.info("Matching Actual page name and expected page name");
			
		}
		
}