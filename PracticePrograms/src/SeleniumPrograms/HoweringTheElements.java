package SeleniumPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoweringTheElements {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\All_Drivers and Libery\\chromedriver-win64-129\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> all_links = driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//a"));
		System.out.println("Lenght of string = "+all_links.size());
		
		for(int i=0; i<all_links.size(); i++)
		{
			WebElement link = all_links.get(i);
			Actions action = new Actions(driver);
			action.moveToElement(link);
			action.build().perform();
			System.out.println(link.getText());
			Thread.sleep(2000);
		}
		driver.close();
	}
}
