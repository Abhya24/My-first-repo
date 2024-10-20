import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\ALL_drivers\\\\chromedriver-win64_119\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		// 1st window
		Set<String> wind = driver.getWindowHandles();
		Iterator<String> iterate = wind.iterator();
		String first_window = iterate.next();                     // 1st window
		driver.switchTo().window(first_window);
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
		
		//2nd window
		wind=driver.getWindowHandles();
		iterate=wind.iterator();
		iterate.next();                           // 1st window
		String second_window = iterate.next();    // 2nd window
		driver.switchTo().window(second_window);
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/payments_terms/EU_privacy']")).click();
		
		// 3rd window
		wind=driver.getWindowHandles();
		iterate=wind.iterator();
		iterate.next();                        // 1st window
		iterate.next();                        // 2nd window
		String third_window = iterate.next();  // 3rd window
		driver.switchTo().window(third_window);
		driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		
		// Back to 1st window
		driver.switchTo().window(second_window);
	}
}
