package POM2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class AmazonHomePage {

	// Declaration
	@FindBy(xpath="//a[@aria-label='Amazon.in']") private WebElement logo;
	@FindBy(xpath="//div[@id='glow-ingress-block']") private WebElement SelectAddress;
	@FindBy(xpath="//div[@id='nav-search']") private WebElement SearchTab;
	@FindBys({@FindBy(xpath="//div[@id='nav-xshop']//a")}) private List<WebElement> ProductLinks;
	
	// Initialization
	
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Usage
	
	public void verifyAmazonHomePageLogo() {
		Assert.assertTrue(logo.isDisplayed());
		Reporter.log("verifyAmazonHomePageLogo");
	}
	
	public void verifyAmazonHomePageSelectAddressTab() {
		Assert.assertTrue(SelectAddress.isDisplayed());
		Assert.assertTrue(SelectAddress.isEnabled());
		Reporter.log("verifyAmazonHomePageSelectAddressTab");
	}
	
	public void verifyAmazonHomePageSearchTab() {
		Assert.assertTrue(SearchTab.isDisplayed());
		Reporter.log("verifyAmazonHomePageSearchTab");
	}
	
	public void verifyAmazonHomePageProductLinks(WebDriver driver) {
		Assert.assertEquals(ProductLinks.size(),31);
		for(int i=0; i<ProductLinks.size(); i++)
		{
			WebElement link = ProductLinks.get(i);
			Actions action = new Actions(driver);
			action.moveToElement(link);
			action.build().perform();
			System.out.println(link.getText());
		}
		Reporter.log("verifyAmazonHomePageProductLinks");
	}

}
