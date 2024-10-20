package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartHomePageTest {

	WebDriver driver;
	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void FKhomePageTest() {
		FlipkartHomePage FK= new FlipkartHomePage(driver);
		FK.clickFlipkartHomePageCancelTab();
		FK.verifyFlipkartHomePageLogo();
		FK.verifyFlipkartHomePageSearchTab();
		FK.verifyFlipkartHomePageBecameSellerTab();
		FK.verifyFlipkartHomePageSignInTab();
		FK.verifyFlipkartHomePageCartTab();
	//	FK.verifyFlipkartHomePageProductLinks(driver);
	}
}
