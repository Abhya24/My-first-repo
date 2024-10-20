package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RedBusBookingPageTest {

	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void RBBookingPage() {
		RedBusBookingPage RBB = new RedBusBookingPage(driver);
		
		RBB.verifyRedBusBookingPageLogo();
		RBB.verifyRedBusBookingPageBusBookingTab();
		RBB.verifyRedBusBookingPageCabRentalTab();
		RBB.verifyRedBusBookingPageTrainTicketsTab();
		RBB.verifyRedBusBookingPageHelpTab();
	}
}
