package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FlipkartHomePage {

	//Declaration
	@FindBy(xpath="//span[text()='✕']") private WebElement cancelTab;
	@FindBy(xpath="//a[@aria-label='Flipkart']") private WebElement logo;
	@FindBy(xpath="//input[@title='Search for Products, Brands and More']") private WebElement searchBar;
	@FindBy(xpath="//a[text()='Become a Seller']") private WebElement BSellerTab;
	@FindBy(xpath="//a[@href='/account/login?ret=/']") private WebElement signInTab;
	@FindBy(xpath="//a[text()='Cart']") private WebElement cart;
	@FindBys({@FindBy(xpath="//div[@class='css-1dbjc4n r-13awgt0 r-eqz5dr']//img")}) private List<WebElement> all_productLinks;
	
	// Initialization
	public FlipkartHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Usage
	public void clickFlipkartHomePageCancelTab() {
		Assert.assertTrue(cancelTab.isDisplayed());
		cancelTab.click();
		Reporter.log("clickFlipkartHomePageCancelTab");
	}
	
	public void verifyFlipkartHomePageLogo() {
		Assert.assertTrue(logo.isDisplayed());
		Reporter.log("verifyFlipkartHomePageLogo");
	}
	
	public void verifyFlipkartHomePageSearchTab() {
		Assert.assertTrue(searchBar.isDisplayed());
		Reporter.log("verifyFlipkartHomePageSearchTab");
	}
	
	public void verifyFlipkartHomePageBecameSellerTab() {
		Assert.assertTrue(BSellerTab.isDisplayed());
		Assert.assertEquals(BSellerTab.getText(), "Become a Seller");
		Reporter.log("verifyFlipkartHomePageBecameSellerTab");
	}
	
	public void verifyFlipkartHomePageSignInTab() {
		Assert.assertTrue(signInTab.isDisplayed());
		Reporter.log("verifyFlipkartHomePageSignInTab");
	}
	
	public void verifyFlipkartHomePageCartTab() {
		Assert.assertTrue(cart.isDisplayed());
		Assert.assertEquals(cart.getText(), "Cart");
		Reporter.log("verifyFlipkartHomePageCartTab");
	}
	
//	public void verifyFlipkartHomePageProductLinks(WebDriver driver) {
	//	Assert.assertEquals(all_productLinks.size(),"27" );
	//	for(int i=0; i<all_productLinks.size(); i++)
	//	{
	//		WebElement link = all_productLinks.get(i);
		
	//		Actions action = new Actions(driver);
	//		action.moveToElement(link);
	//		action.build().perform();
	//		System.out.println(link.getText());
			
	//	}
//	}

}
