package POM2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FBfooterLinksPage {

	// Declaration
	@FindBys({@FindBy(xpath="//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//a")}) private List<WebElement> footerLinks;
	
	// initialization
	public FBfooterLinksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Usage
	
	public void verifyFBfooterLinksPageAll_links(WebDriver driver) {
		Assert.assertEquals(footerLinks.size(), 31);
		for(int i=0; i<footerLinks.size(); i++)
		{
			WebElement link = footerLinks.get(i);
			Actions action = new Actions(driver);
			action.moveToElement(link);
			action.build().perform();
			System.out.println(link.getText());
		}
	}
}
