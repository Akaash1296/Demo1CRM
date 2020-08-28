package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.WebActionTools;

public class homePage extends BasePage {
	@FindBy(xpath="(//a[@class='appbar-menu'])[5]")
	private WebElement explore;


	@FindBy(xpath="//div[text()='Logout']")
	private WebElement logOut;

	@FindBy(xpath="//div[text()='Sales & Marketing']")
	private WebElement salesMarketing;

	@FindBy(xpath="//div[text()='Order Management']")
	private WebElement orderManagement;

	@FindBy(xpath="//div[text()='Project Management']")
	private WebElement projectManagement;

	@FindBy(xpath="//div[text()='Create Contact']")
	private WebElement createContact;

	@FindBy(name="first_name")
	private WebElement firstName;

	@FindBy(name="last_name")
	private WebElement lastName;

	@FindBy(name="email1")
	private WebElement emailID;

	@FindBy(name="primary_address_street")
	private WebElement street;

	@FindBy(name="primary_address_city")
	private WebElement city;

	@FindBy(name="primary_address_state")
	private WebElement state;

	@FindBy(name="primary_address_country")
	private WebElement country;

	@FindBy(name="primary_address_postalcode")
	private WebElement zipCode;

	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(xpath="//div[text()='Contacts']")
	private WebElement contactsMenu;

	@FindBy(xpath="//div[text()='Account Name']")
	private WebElement accntName;

	@FindBy(xpath="//div[text()='Akash Kumar']")
	private WebElement names;

	@FindBy(id="DetailForm_delete-label")
	private WebElement delete;

	@FindBy(id="DetailForm_save2")
	private WebElement save;


	public homePage(WebDriver driver, WebActionTools webActionTools) {
		super(driver, webActionTools);
	}

	public void clickExplore() {
		webActionTools.elementClickable(explore, "menuBar");
	}


	public void clickOrderManagement(){
		webActionTools.elementClickable(orderManagement, "Order Management");
	}

	public void clickProjectManagement(){
		webActionTools.elementClickable(projectManagement, "Project Management");
	}

	public void clickSalesMarketing(){
		webActionTools.elementClickable(salesMarketing, "Sales and Marketing");
	}

	public void clickCreateContact() {
		webActionTools.elementClickable(createContact, "Create a contact");
	}

	public void clickContacts() {
		webActionTools.elementClickable(contacts, "Contacts");
	}
	
	public void clickContactsMenu() {
		webActionTools.elementClickable(contactsMenu, "Contacts");
	}

	public void clickAccountName() {
		webActionTools.elementClickable(accntName, "Account Name");
	}

	public void clickPerson() {
		webActionTools.elementClickable(names, "Clicking a Name Link");
	}



	public void clickDelete() {
		webActionTools.elementClickable(delete, "Deleting a contact");
	}
	public void clickSave() {
		webActionTools.elementClickable(save, "Saving the contact");
	}

	public void setFirstName(String name1) {
		webActionTools.typeText(firstName, "First name", name1);
	}

	public void setLastName(String name2) {
		webActionTools.typeText(lastName, "Last name", name2);
	}

	public void setEmailName(String email) {
		webActionTools.typeText(emailID, "Email", email);

	}

	public void setStreetName(String streetName) {
		webActionTools.typeText(street, "Address", streetName);

	}

	public void setCityName(String cityName) {
		webActionTools.typeText(city, "City", cityName);

	}

	public void setStateName(String stateName) {
		webActionTools.typeText(state, "State", stateName);

	}

	public void setCountryName(String countryName) {
		webActionTools.typeText(country, "Country", countryName);

	}

	public void setZip(String postal) {
		webActionTools.typeText(zipCode, "Zip Code", postal);

	}
	public void clickLogOut() {	
		webActionTools.elementClickable(explore, "menuBar");
		webActionTools.elementClickable(logOut, "'Logout' button");
	}
}
