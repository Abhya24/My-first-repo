package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FBloginPage {

	// Declaration
		@FindBy(xpath="//img[@alt='Facebook']") private WebElement fblogo;
		@FindBy(xpath="//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement fbtagline;
		@FindBy(name="email") private WebElement email;
		@FindBy(name="pass") private WebElement password;
		@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forgotpassword;
		
		// Initialization
		
		public FBloginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		// Usage
		
		public void verifyFBloginPageFBLgogo() {
			Assert.assertTrue(fblogo.isDisplayed(), "Logo is visible");
			Reporter.log("verifyFBloginPageFBLgogo");
		}
		
		public void verifyFBloginPageFBTagline() {
			Assert.assertEquals(fbtagline.getText(), "Facebook helps you connect and share with the people in your life.");
			Reporter.log("verifyFBloginPageFBTagline");
		}
		
		public void setFBloginPageFBemailID() {
			Assert.assertTrue(email.isEnabled());
			email.sendKeys("Rajesh Kumar");
			Reporter.log("setFBloginPageFBemailID");
		}
		
		public void setFBloginPageFBpassword() {
			Assert.assertTrue(password.isEnabled());
			password.sendKeys("1425369870");
			Reporter.log("setFBloginPageFBpassword");
		}
		
		public void verifyFBloginPageFBforgotPassword() {
			Assert.assertEquals(forgotpassword.getText(), "Forgotten password?");
			Assert.assertTrue(forgotpassword.isEnabled());
			Reporter.log("verifyFBloginPageFBforgotPassword");
		}

}
