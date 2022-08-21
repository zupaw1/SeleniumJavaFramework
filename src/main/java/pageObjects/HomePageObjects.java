package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {
	//only page objects + respective methods
	
	@FindBy(id="nav_automobile") 
	WebElement link_automobile;
	
	@FindBy(tagName="a") 
	List<WebElement> link_all;
	
	@FindBy(id="search_form")
	WebElement search_field;
	
	@FindBy(id="tricentis_logo")
	public WebElement logo_img;
	
	@FindBy(id="nav_truck")
	WebElement link_truck;

	@FindBy(id="nav_camper")
	WebElement link_camper;
	
	@FindBy(id="nav_motorcycle")
	WebElement link_motorcycle;

	public Object getLogo_img;
	
	//constructor - to use initElement method
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	//for click on motorcycle link on homepage
	public void clickOnMotorCycleLink() {
		System.out.println(driver);
		link_motorcycle.click();
	}
	
	public void clickOnSearchField() {
		search_field.click();
	}
	
	
	public void findLinkandText() {
		int size = link_all.size();
		System.out.println(size);
		for(int j=0; j<size; j++)
        {
            //Printing the links
            System.out.println(link_all.get(j).getText());
        }
		
	}
	public int LinksNumber() {
		int size = link_all.size();
		return size;
		
	}
	public void enterSearchData(String data) {
		search_field.sendKeys(data);
		search_field.sendKeys(Keys.RETURN);
	}

	public WebElement getLogo_img() {
		return logo_img;
	}

	public void setLogo_img(WebElement logo_img) {
		this.logo_img = logo_img;
	}
}