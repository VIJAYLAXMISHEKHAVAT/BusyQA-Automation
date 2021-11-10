package PageObjectM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.DriverInitialization;

public class Signinpageobj extends DriverInitialization {
	public WebDriver driver;

	public Signinpageobj(WebDriver driver) {
		this.driver = driver;
	}

	By signbtn = By.cssSelector(
			"body.cms-home.page-layout-1column.cms-index-index.page-layout-cms-full-width.document-loaded:nth-child(2) div.off-canvas-header:nth-child(9) header.page-header div.header.wrapper:nth-child(2) div.header.content li.customer-welcome.active div.customer-menu-wrapper div.customer-menu-header ul.customer-menu-item-wrapper.actions > li.customer-menu-item:nth-child(1)");
	By email = By.id("email");
	By passwd = By.id("pass");
	By Submit = By.cssSelector("button#send2.action.login.primary");

	public WebElement Siginbtn() {
		return driver.findElement(signbtn);
	}

	public WebElement Emailtext() {
		return driver.findElement(email);
	}

	public WebElement Passtext() {
		return driver.findElement(passwd);
	}

	public WebElement Submitbtn() {
		return driver.findElement(Submit);
	}

}