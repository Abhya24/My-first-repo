package SeleniumPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);
		
		// 1st window
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> iterate = wind.iterator();
		String first_window = iterate.next();
		driver.switchTo().window(first_window);
		WebElement RBcarriers = driver.findElement(By.xpath("//a[@href='https://www.redbus.in/careers']"));
		RBcarriers.click();
		
		//2nd window
		wind=driver.getWindowHandles();
		iterate=wind.iterator();
		iterate.next();                          // 1st window
		String second_window = iterate.next();   // 2nd window
		driver.switchTo().window(second_window);
		WebElement sitemap = driver.findElement(By.xpath("//a[@href='https://www.redbus.in/sitemap.html']"));
		sitemap.click();
	}
}
