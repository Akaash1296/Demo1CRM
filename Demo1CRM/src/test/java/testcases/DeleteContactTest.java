package testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import POMPages.homePage;
import library.BaseTest;

public class DeleteContactTest extends BaseTest {
	@Test
	public void DeleteContactTestCase() throws InterruptedException {
		homePage h = new homePage(driver, webActionTools);
		Thread.sleep(2000);
		h.clickPerson();
		Thread.sleep(1000);
		h.clickDelete();
		Thread.sleep(1000);
		Alert a  = driver.switchTo().alert();
		a.accept();
	}
}
