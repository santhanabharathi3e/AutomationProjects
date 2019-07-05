package EShoppingTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import EShoppingObjects.BasePage;
import EShoppingObjects.HomePageObjects;

public class HomePageTests {
	
	HomePageObjects homePageObj;
	BasePage basePageObj;
	
	public HomePageTests(){
		homePageObj = new HomePageObjects();
		basePageObj = new BasePage();
	}
	
	@Test
	public void verifyWomenTabPagesPresent()
	{
		boolean isWomenTabPresent = basePageObj.elementFound(homePageObj.getWomenTabElement());
		
	    Assert.assertTrue(isWomenTabPresent, "Women Tab is not Present");
				
	}
	
	
	@Test
	public void verifyDressesTabPagesPresent()
	{
		boolean isDressesTabPresent = basePageObj.elementFound(homePageObj.getDressesTabElement());
		
	    Assert.assertTrue(isDressesTabPresent,"Dresses Tab is not Present");
				
	}
	
	
	@Test
	public void verifyTShirtTabPagesPresent()
	{
		boolean isTShirtTabPresent = basePageObj.elementFound(homePageObj.getTShirtTabElement());

	    Assert.assertTrue(isTShirtTabPresent,"T-Shirt Tab is not Present");
				
	}
	
	
	@Test
	public void verifyNavigationToWomenPage()
	{
		homePageObj.navigateToWomenPage();
		
		basePageObj.elementVisibe(homePageObj.getWomenPageElement());
		
		Assert.assertTrue(basePageObj.elementFound(homePageObj.getWomenPageElement()),"Navigation to Women page is not successful");
				
	}
	
	
	@Test
	public void verifyNavigationToDressesPage()
	{
		homePageObj.navigateToDressesPage();
		
		basePageObj.elementVisibe(homePageObj.getDressesPageElement());
		
		Assert.assertTrue(basePageObj.elementFound(homePageObj.getDressesPageElement()),"Navigation to Dresses page is not successful");
				
	}
	
	
	@Test
	public void verifyNavigationToTShirtPage()
	{
		homePageObj.navigateToTShirtPage();
		
		basePageObj.elementVisibe(homePageObj.getTShirtPageElement());
		
		Assert.assertTrue(basePageObj.elementFound(homePageObj.getTShirtPageElement()),"Navigation to TShirt page is not successful");
				
	}
	
	
	

}
