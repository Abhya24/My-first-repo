package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class InventoryPage {

	// declaration
	@FindBy(xpath="//input[@name='user-name']") private WebElement userName;
	@FindBy(xpath="//input[@name='password']") private WebElement passWord;
	@FindBy(xpath="//input[@name='login-button']") private WebElement loginbtn;

	@FindBy(xpath="//span[@class='title']") private WebElement ProductLogo;
	@FindBy(xpath="//div[text()='Swag Labs']") private WebElement SwabLabLogo;
	@FindBy(xpath="") private WebElement Bagpack;
	@FindBy(xpath="") private WebElement bikeLight;
	@FindBy(xpath="") private WebElement filterField;
	
	// initialization
	public InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Usege
	
	public void setLoginPageUserName() {
		Assert.assertTrue(userName.isEnabled());
		userName.sendKeys("standard_user");
		Reporter.log("setLoginPageUserName");
	}
	
	public void setLoginPagePassWord() {
		Assert.assertTrue(passWord.isEnabled());
		passWord.sendKeys("secret_sauce");
		Reporter.log("setLoginPagePassWord");
	}
	
	public void clickLoginPageLoginBtn() {
		Assert.assertTrue(loginbtn.isEnabled());
		loginbtn.click();
		Reporter.log("clickLoginPageLoginBtn");
	}
	
	public void verifyLoginPageProductLogo() {
		Assert.assertTrue(ProductLogo.isDisplayed());
		Assert.assertEquals(ProductLogo.getText(), "Products");
		Reporter.log("verifyLoginPageProductLogo");
	}
	
	public void verifyLoginPageSwabLabLogo() {
		Assert.assertTrue(SwabLabLogo.isDisplayed());
		Assert.assertEquals(SwabLabLogo.getText(), "Swag Labs");
		Reporter.log("verifyLoginPageSwabLabLogo");
	}
}
