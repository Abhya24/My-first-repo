package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// 1st window
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> iterate = wind.iterator();
		String first_window = iterate.next();
		driver.switchTo().window(first_window);
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
		Thread.sleep(2000);
		
		// 2nd window
		wind=driver.getWindowHandles();
		iterate=wind.iterator();
		iterate.next();                         // 1st window
		String second_window = iterate.next();  // 2nd window
		driver.switchTo().window(second_window);
		driver.findElement(By.xpath("//a[text()='Payments Privacy Policy']")).click();
		Thread.sleep(2000);
	}
}
