package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AmazonHomePageTest {

	WebDriver driver;
	@BeforeClass
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void AmazonSiteHomePageTest() {
		AmazonHomePage AHP= new AmazonHomePage(driver);
		AHP.verifyAmazonHomePageLogo();
		AHP.verifyAmazonHomePageSelectAddressTab();
		AHP.verifyAmazonHomePageSearchTab();
		AHP.verifyAmazonHomePageProductLinks(driver);
	}
}
