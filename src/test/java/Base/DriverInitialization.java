package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInitialization {
	public WebDriver driver;

	public WebDriver InitialationBrowsers() throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Programs\\8'30PMEST Batch\\FinalProject\\Browser.properties");
		prop.load(fis);
		String BrowserName = prop.getProperty("Browser");
		System.out.println(BrowserName);
		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equals("Firefox")) {
			System.setProperty("geckodriver", "C:\\Driver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 //Alert alert = driver.switchTo().alert();
		// alert.accept();
		return driver;

	}
}