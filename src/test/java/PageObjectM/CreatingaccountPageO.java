package PageObjectM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.DriverInitialization;

public class CreatingaccountPageO extends DriverInitialization {
	public WebDriver driver;
	public CreatingaccountPageO(WebDriver driver){
		this.driver = driver;
	}

	By accountbtn = By.cssSelector("div.customer-icon.customer-menu-toggle");	
	By creataccount = By.cssSelector("body.cms-home.page-layout-1column.cms-index-index.page-layout-cms-full"
			+ "-width.document-loaded:nth-child(2) div.off-canvas-header:nth-child(9) header.page-header "
			+ "div.header.wrapper:nth-child(2) div.header.content li.customer-welcome.active div.customer-menu-wrapper"
			+ " div.customer-menu-header ul.customer-menu-item-wrapper.actions "
			+ "li.customer-menu-item:nth-child(2) > a.action.register");
	By click =  By.cssSelector("from.needsclick.klaviyo-form.klaviyo-form-version-cid_1.kl-private-reset-css-Xuajs1");
	By fname = By.id("firstname");
	By lname = By.id("lastname");
	By email = By.id("email_address");
	By pword = By.id("password");
	By cnfpword = By.id("password-confirmation");
	By submitbtn = By.cssSelector("button.action.submit.primary");
	
	
	public WebElement Accountbutton() {
		return driver.findElement(accountbtn);
			}
	
	public WebElement Creatingact() {
		return driver.findElement(creataccount);
	}
	

	public WebElement firstname() {
		return driver.findElement(fname);
	}

	public WebElement Lasrtname() {
		return driver.findElement(lname);
	}

	public WebElement emailid() {
		return driver.findElement(email);
	}

	public WebElement password() {
		return driver.findElement(pword);

	}

	public WebElement Confirmpassword() {
		return driver.findElement(cnfpword);
	}

	public WebElement submit() {
		return driver.findElement(submitbtn);
	}

}
