package testcases;

import org.testng.annotations.Test;

import POMPages.homePage;
import library.BaseTest;

public class mainPageTests extends BaseTest {
     @Test
     public void mainPageTestCase() throws InterruptedException {
    	 homePage h = new homePage(driver, webActionTools);
    	 Thread.sleep(2000);
    	 h.clickSalesMarketing();
    	 Thread.sleep(1000);
    	 h.clickOrderManagement();
    	 Thread.sleep(1000);
    	 h.clickProjectManagement();
    	 Thread.sleep(1000);
    	 h.clickLogOut();
    	 
     }
}
