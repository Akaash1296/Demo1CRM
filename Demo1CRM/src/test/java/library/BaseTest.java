package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import POMPages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements IAutoConstants {
	public WebDriver driver;
	public WebActionTools webActionTools;
	@BeforeClass
	public void openApp() throws InterruptedException {
		if(browserName.equalsIgnoreCase("safari")) {
			System.setProperty("", driverPath);
			driver = new SafariDriver();	  
		}
		else {
			WebDriverManager.chromedriver().setup();	  
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(wTime, TimeUnit.SECONDS);
		System.out.println("Open the browser");
		webActionTools = new WebActionTools(driver);
		loginPage l = new loginPage(driver, webActionTools);
		Thread.sleep(1000);
		l.setUserName(userName);
		l.setPassword(passWord);
		l.clickSignIn();
		driver.manage().window().maximize();

	}
	@AfterClass
	public void CloseApp() {
		driver.quit();
	}
}
