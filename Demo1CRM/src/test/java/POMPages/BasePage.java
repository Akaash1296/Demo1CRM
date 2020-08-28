package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import library.WebActionTools;

public class BasePage {
  public WebDriver driver;
  public WebActionTools webActionTools;
  
  public BasePage(WebDriver driver, WebActionTools webActionTools) {
	  this.driver = driver;
	  this.webActionTools = webActionTools;
	  PageFactory.initElements(driver, this);
  }
}
