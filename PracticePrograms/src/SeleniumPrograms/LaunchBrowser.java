package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ALL_drivers\\chromedriver-win64_117\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement Openacc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Openacc.click();
		
	//  WebElement Signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	//	Signup.click();
		
		Thread.sleep(2000);
		
		WebElement Fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		Fname.sendKeys("Raghav");
		
		//Birth day
		WebElement birth_day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select b_day= new Select(birth_day);
		b_day.selectByValue("14");
		
		// birth month
		WebElement birth_month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select b_month= new Select(birth_month);
		b_month.selectByVisibleText("May");
		
		// to get list of months
		List<WebElement> All_months = b_month.getOptions();
		for(int i=0; i<All_months.size(); i++ )
		{
			String months = All_months.get(i).getText();
			System.out.println(months);
		}
		
	}
}
