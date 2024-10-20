package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ScauceDemoLoginPage {

	// declaration
	@FindBy(xpath="//input[@name='user-name']") private WebElement userName;
	@FindBy(xpath="//input[@name='password']") private WebElement passWord;
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginbtn;

	// initialization
	
	public ScauceDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// usege
	
	public void verifyPageLoginCredintial() {
		Assert.assertTrue(userName.isEnabled());
		userName.sendKeys("standard_user");
		Assert.assertTrue(passWord.isEnabled());
		passWord.sendKeys("secret_sauce");
		Assert.assertTrue(loginbtn.isDisplayed());
		loginbtn.click();
	}
}
