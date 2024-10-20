package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takesscreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oracle.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\abhij\\OneDrive\\Desktop\\Screenshots\\oracle.jpg");
		FileUtils.copyFile(src, dest);
	}
}
