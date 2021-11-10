package Testcase;

import org.testng.annotations.Test;

import Base.DriverInitialization;
import PageObjectM.CreatingaccountPageO;

public class TC003Creatingaccount extends DriverInitialization{
	@Test
	public void AccountCreation() throws Exception {
	driver = InitialationBrowsers();
	driver.get("https://www.kitchenstuffplus.com");
	CreatingaccountPageO crtact = new CreatingaccountPageO(driver);
	crtact.Accountbutton().click();
	crtact.Creatingact().click();	
	crtact.firstname().sendKeys("Shanu");
	crtact.Lasrtname().sendKeys("Shekhavat");
	crtact.emailid().sendKeys("shanu@gmail.com");
	crtact.password().sendKeys("Rathore123");
	crtact.Confirmpassword().sendKeys("Rathore123");
	crtact.submit().click();

}}
