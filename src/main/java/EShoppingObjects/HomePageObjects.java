package EShoppingObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	
	@FindBy(xpath =  "//*[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/*[text() = 'Women']")
	private WebElement womenTab;
	
	@FindBy(xpath = "//*[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/*[text() = 'Dresses']")
	private WebElement dressesTab;
	
	@FindBy(xpath = "//*[@class = 'sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/*[text() = 'T-shirts']")
	private WebElement tShirtTab;
	
	@FindBy(xpath = "//*[text() = 'You will find here all woman fashion collections.']")
	private WebElement womenPageTxtElement;
	
	@FindBy(xpath = "//*[text() = 'We offer dresses for every day, every style and every occasion.']")
	private WebElement dressesPageTxtElement;
	
	
	@FindBy(xpath = "//*[text() = 'shapes and style of our collection!']")
	private WebElement tShirtPageTxtElement;
	
	
	
	public HomePageObjects()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getWomenTabElement() {
		
		return womenTab;
	}	
	
	public WebElement getDressesTabElement() {
		
		return dressesTab;
	}
	
	public WebElement getTShirtTabElement() {
	
		return tShirtTab;
	}
	
	public WebElement getWomenPageElement() {
		
		return womenPageTxtElement;
	}
	
	public WebElement getDressesPageElement() {
		
		return dressesPageTxtElement;
	}
	
	public WebElement getTShirtPageElement() {
		
		return tShirtPageTxtElement;
	}
	
	
	public void navigateToWomenPage()
	{
		womenTab.click();
	}
	
	public void navigateToDressesPage()
	{
		dressesTab.click();
	}
	
	public void navigateToTShirtPage()
	{
		tShirtTab.click();
	}


	
}
