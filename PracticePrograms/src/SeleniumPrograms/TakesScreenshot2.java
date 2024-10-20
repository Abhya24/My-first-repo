package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\abhij\\OneDrive\\Desktop\\Screenshots\\Netflix.jpg");
		FileUtils.copyFile(src, dest);
		
		driver.close();
	}
}
