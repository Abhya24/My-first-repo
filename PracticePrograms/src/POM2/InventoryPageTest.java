package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InventoryPageTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","D:\\All_Drivers and Libery\\Chromedriver_126\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void SwabLabInventoryPage() throws InterruptedException {
		InventoryPage IP = new InventoryPage(driver);
		IP.setLoginPageUserName();
		IP.setLoginPagePassWord();
		IP.clickLoginPageLoginBtn();
		Thread.sleep(2000);
		IP.verifyLoginPageProductLogo();
		IP.verifyLoginPageSwabLabLogo();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
