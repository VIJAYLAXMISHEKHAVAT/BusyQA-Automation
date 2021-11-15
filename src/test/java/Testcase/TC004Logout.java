package Testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.DriverInitialization;
import PageObjectM.Sign_out_PageObj;

public class TC004Logout extends DriverInitialization
{
	@Test(testName="test4")
	public static <singin> void Loggingout() throws Exception {
		
		
		TC003SignIn sn = new TC003SignIn();
		sn.singin();
		Sign_out_PageObj snobj = new Sign_out_PageObj(driver);
		String acttext =snobj.PullingText().getText();
		System.out.println("Successfully logged in So now we are on -->"+acttext +" page");		
		snobj.AccountIcon().click();
		logger.info("Click on Account button");		
		snobj.Signout().click();
		logger.info("Successfully Signout ");
		String Title = driver.getTitle();
		 String ExpectedTitle = "Customer Login | Kitchen Stuff Plus";
		 Assert.assertEquals(Title, ExpectedTitle);
		// String text =snobj.Signouttext().getText();
		// System.out.println(text);
		
	}
}
