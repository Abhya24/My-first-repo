package POM2;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FBfooterLinksPageTest {

	WebDriver driver;
	@BeforeClass
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ALL_drivers\\chromedriver-win64_119\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void FaceBookFBfooterLinksPage() {
		FBfooterLinksPage FFL = new FBfooterLinksPage(driver);
		FFL.verifyFBfooterLinksPageAll_links(driver);
	}
}
