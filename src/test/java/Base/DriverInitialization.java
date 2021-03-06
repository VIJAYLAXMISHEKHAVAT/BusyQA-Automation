package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverInitialization {
	public static WebDriver driver;
	public static Properties prop = new Properties();;
	public static FileInputStream fis;
	public static Logger logger = Logger.getLogger("qaLogger");

	
	@BeforeSuite
	public static WebDriver WebdriverInit()throws Exception {

		fis = new FileInputStream(
				"D:\\Programs\\8'30PMEST Batch\\FinalProject\\src\\test\\resource\\properties\\Browser.properties");
		prop.load(fis);

		String BrowserName = prop.getProperty("Browser");
		
		//System.out.println(BrowserName);
		
		logger.info(BrowserName + "BrowserName is chrome ");
		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equals("Firefox")) {
			System.setProperty("geckodriver", "C:\\Driver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("Url"));
		logger.info("Loading url");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}

	@AfterSuite
	public static void tearDown() {

		driver.quit();
	}
}
