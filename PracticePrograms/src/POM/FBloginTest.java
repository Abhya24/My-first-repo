package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FBloginTest {

	WebDriver driver;
	@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver","D:\\\\All_Drivers and Libery\\\\Chromedriver_126\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void FBloginPageTest() throws InterruptedException {
		FBloginPage LP = new FBloginPage(driver);
		LP.verifyFBloginPageFBLgogo();
		LP.verifyFBloginPageFBTagline();
		LP.verifyFBloginPageFBforgotPassword();
		LP.setFBloginPageFBemailID();
		LP.setFBloginPageFBpassword();
		Thread.sleep(2000);
		
	}
}
