package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScauceDemoLoginPageTest {

	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\All_Drivers and Libery\\Chromedriver_126\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void LoginPage() {
		ScauceDemoLoginPage DLP= new ScauceDemoLoginPage(driver);
		DLP.verifyPageLoginCredintial();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
