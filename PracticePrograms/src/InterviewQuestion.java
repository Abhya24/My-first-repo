import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\ALL_drivers\\\\chromedriver-win64_117\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
		searchBox.sendKeys("SDautomation");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	}
}
