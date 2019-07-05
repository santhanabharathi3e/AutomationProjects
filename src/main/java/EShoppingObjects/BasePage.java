package EShoppingObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver driver;
	public String browser = "chrome";
	
	public BasePage()
	{
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "");
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);			
			driver.get("http://automationpractice.com/index.php");
			
		}
		
	}
	
	public boolean elementFound(WebElement element) {
		boolean isElementFound = false;
		
		try {
		isElementFound = element.isDisplayed();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return isElementFound;
	}
	
	
	public void setText(WebElement element, String setText)
	{
		element.click();
		element.clear();
		element.sendKeys(setText);		
	}
	
	public String getTxtAttribute(WebElement element)
	{
		return element.getAttribute("value");		
	}
	
	
	public String setDropDownValue(WebElement element,String option) {
		
		Select selObj = new Select(element);	
		selObj.selectByValue(option);	
		return selObj.getFirstSelectedOption().getText();				
	}
	
	public boolean elementVisibe(WebElement element) {
		
		boolean isElementVisible = false;
		WebDriverWait waitObj = new WebDriverWait(driver,90);
		
		try {
			waitObj.until(ExpectedConditions.visibilityOf(element));
			isElementVisible = true;
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
			return isElementVisible;
		
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	

	public void quitDriver()
	{
		driver.quit();
	}
	
	

}
