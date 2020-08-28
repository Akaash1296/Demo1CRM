package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionTools;

public class loginPage extends BasePage {
	@FindBy(id="login_user")
	private WebElement userID;
	
	@FindBy(id="login_pass")
	private WebElement pwd;
	
	@FindBy(xpath="//span[@class='uii uii-arrow-right']")
	private WebElement signIn;
	
	public loginPage(WebDriver driver, WebActionTools webActionTools) {
		super(driver, webActionTools);
	}
	
	public void setUserName(String username) {
		webActionTools.typeText(userID, "user name", username);
	}
	
	public void setPassword(String password) {
		webActionTools.typeText(pwd, "password", password);
	}
	
	public void clickSignIn() {
		webActionTools.elementClickable(signIn, "'LogIn' button");
	}

	
	
}
