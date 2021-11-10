package Testcase;

import org.testng.annotations.Test;

import Base.DriverInitialization;
import PageObjectM.CreatingaccountPageO;
import PageObjectM.Signinpageobj;

public class TC002SignIn extends DriverInitialization{

		@Test
			public void singin() throws Exception {
			driver = InitialationBrowsers();
			driver.get("https://www.kitchenstuffplus.com");
			CreatingaccountPageO crtact = new CreatingaccountPageO(driver);
			
			crtact.Accountbutton().click();
			Signinpageobj sb = new Signinpageobj(driver);
			
			sb.Siginbtn().click();
			sb.Emailtext().sendKeys("shanu@gmail.com");
			sb.Passtext().sendKeys("Rathore123");
			sb.Submitbtn().click();
			
	

}
}