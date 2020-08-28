package testcases;

import org.testng.annotations.Test;

import POMPages.homePage;
import library.BaseTest;

public class CreateContactTest extends BaseTest {
  @Test
  public void CreateContactTestCase() throws InterruptedException {
	  homePage h = new homePage(driver, webActionTools);
 	 Thread.sleep(2000);
 	 h.clickCreateContact();
 	 Thread.sleep(4000);
 	 h.setFirstName("Akash");
 	 h.setLastName("Kumar");
 	 h.setEmailName("AkaashKumar78@example.com");
 	 h.setStreetName("123 Bull Street");
 	 h.setCityName("Columbia");
 	 h.setStateName("South Carolina");
 	 h.setCountryName("United States");
 	 h.setZip("29201");
 	 Thread.sleep(1000);
 	 h.clickSave();
 	 Thread.sleep(1000);
 	 h.clickLogOut();
 	
  }
}
