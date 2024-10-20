package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RedBusBookingPage {

	// Declaration
	@FindBy(xpath="//img[@class='rb_logo']") private WebElement Redbuslogo;
	@FindBy(xpath="//span[text()='Bus Tickets']") private WebElement Busstickets;
	@FindBy(xpath="//span[text()='Cab Rental']") private WebElement CabRental;
	@FindBy(xpath="//span[text()='Train Tickets']") private WebElement TrainTickets;
	@FindBy(xpath="//span[text()='Help']") private WebElement Help;



	// Initialization
	
	public RedBusBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Usage
	
	public void verifyRedBusBookingPageLogo() {
		Assert.assertTrue(Redbuslogo.isDisplayed());
		Reporter.log("verifyRedBusBookingPageLogo");
	}
	
	public void verifyRedBusBookingPageBusBookingTab() {
		Assert.assertTrue(Busstickets.isDisplayed());
		Assert.assertEquals(Busstickets.getText(), "Bus Tickets");
		Reporter.log("verifyRedBusBookingPageBusBookingTab");
	}
	
	public void verifyRedBusBookingPageCabRentalTab() {
		Assert.assertTrue(CabRental.isDisplayed());
		Assert.assertEquals(CabRental.getText(), "Cab Rental");
		Reporter.log("verifyRedBusBookingPageCabRentalTab");
	}
	
	public void verifyRedBusBookingPageTrainTicketsTab() {
		Assert.assertTrue(TrainTickets.isDisplayed());
		Assert.assertEquals(TrainTickets.getText(), "Train Tickets");
		Reporter.log("verifyRedBusBookingPageTrainTicketsTab");
	}
	
	public void verifyRedBusBookingPageHelpTab() {
		Assert.assertTrue(Help.isDisplayed());
		Assert.assertEquals(Help.getText(), "Help");
		Reporter.log("verifyRedBusBookingPageHelpTab");
	}
	
}
