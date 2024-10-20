package ActionClass;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoweringWebelements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		List<WebElement> all_links = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
		System.out.println("Total links are = "+all_links.size());
		
		for(int i=0; i<all_links.size(); i++)
		{
			WebElement link = all_links.get(i);
			// howering the element
			Actions action = new Actions(driver);
			action.moveToElement(link);
			action.build().perform();
			Thread.sleep(2000);
			System.out.println(link.getText());
		}
	}
}
