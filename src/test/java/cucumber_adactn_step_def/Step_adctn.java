package cucumber_adactn_step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber_adactn_runner.Runner_adctn;
import io.cucumber.core.runner.Runner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step_adctn 
{
	public static WebDriver driver = Runner_adctn.driver;
//    private WebDriverWait wait;
	
	@Given("User invoke the adactin hotel page")
	public void user_invoke_the_adactin_hotel_page() 
	{
		driver.get("https://adactinhotelapp.com/index.php");
	}
	
	@Given("user enter the username in texbox field")
	public void user_enter_the_username_in_texbox_field() 
	{
		
		driver.findElement(By.id("username")).sendKeys("kartickkn");
	}

	@Given("user enter the password in textbox field")
	public void user_enter_the_password_in_textbox_field() 
	{
		driver.findElement(By.id("password")).sendKeys("Kartikeyan@1234");
	}

	@Then("The login page navigate to the Search hotel page")
	public void the_login_page_navigate_to_the_search_hotel_page()  
	{
		driver.findElement(By.id("login")).click();
				
	}

	@When("User can able to pick desired location")
	public void user_can_able_to_pick_desired_location()  
	{
//		WebElement loctn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("location")));
		WebElement loctn = driver.findElement(By.id("location"));
		Select l=new Select(loctn);
		l.selectByValue("Sydney");
	}

	@When("User can able to pick the Hotel")
	public void user_can_able_to_pick_the_hotel() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement htl = driver.findElement(By.id("hotels"));
		Select h=new Select(htl);
		h.selectByValue("Hotel Creek");
	}

	@When("User can able to pick the Room Type")
	public void user_can_able_to_pick_the_room_type() 
	{
		WebElement rtype = driver.findElement(By.id("room_type"));
		Select rt=new Select(rtype);
		rt.selectByVisibleText("Standard");
	}

	@When("User can able to pick the Number of rooms")
	public void user_can_able_to_pick_the_number_of_rooms() 
	{
		WebElement rmno = driver.findElement(By.id("room_nos"));
		Select nor=new Select(rmno);
		nor.selectByIndex(3);
	}

	@When("User can able to send the check in date")
	public void user_can_able_to_send_the_check_in_date() 
	{
		WebElement datein = driver.findElement(By.id("datepick_in"));
		System.out.println(datein.getText());		
	}

	@When("User can able to send the valid Check out date")
	public void user_can_able_to_send_the_valid_check_out_date() 
	{
		WebElement daot = driver.findElement(By.id("datepick_out"));
		System.out.println(daot.getText());		
	}

	@When("User can able to select adults per room")
	public void user_can_able_to_select_adults_per_room() 
	{
		WebElement adrom = driver.findElement(By.id("adult_room"));
		Select adrm=new Select(adrom);
		adrm.selectByValue("2");
	}

	@When("User can able to select childrens per room")
	public void user_can_able_to_select_childrens_per_room() 
	{
		WebElement chldrm = driver.findElement(By.id("child_room"));
		Select cdrm=new Select(chldrm);
		cdrm.selectByValue("2");
		
	}

	@Then("User can navigate to selected hotel page")
	public void user_can_navigate_to_selected_hotel_page() 
	{
		WebElement regbutn = driver.findElement(By.className("reg_button"));
		regbutn.click();
	}

	@When("user able to select the selected Hotel")
	public void user_able_to_select_the_selected_hotel()
	{
		WebElement rdbtn = driver.findElement(By.id("radiobutton_0"));
		rdbtn.click();
	}

	@Then("user can navigate to book hotel page")
	public void user_can_navigate_to_book_hotel_page() 
	{
		WebElement contin = driver.findElement(By.id("continue"));
		contin.click();
	}

	@Given("user can be able to send firstname and lasename")
	public void user_can_be_able_to_send_firstname_and_lasename() 
	{
		driver.findElement(By.id("first_name")).sendKeys("Karthick");
		driver.findElement(By.id("last_name")).sendKeys("Mohan");
		
	}

	@Given("user can be able to send billing address")
	public void user_can_be_able_to_send_billing_address() 
	{
		driver.findElement(By.id("address")).sendKeys("Chennai");
		
	}

	@Given("user can be able to send valid credit card details")
	public void user_can_be_able_to_send_valid_credit_card_details() 
	{
		driver.findElement(By.id("cc_num")).sendKeys("9876543210123456");
		
	}

	@Given("user can be able to send valid credit card type")
	public void user_can_be_able_to_send_valid_credit_card_type()
	{
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select cty=new Select(cctype);
		cty.selectByValue("VISA");
		
	}

	@Given("user can be able to send valid card expiry date and month")
	public void user_can_be_able_to_send_valid_card_expiry_date_and_month() 
	{
		WebElement ccmnt = driver.findElement(By.id("cc_exp_month"));
		Select cmon=new Select(ccmnt);
		cmon.selectByValue("2");
		WebElement ccyer = driver.findElement(By.id("cc_exp_year"));
		Select cyr=new Select(ccyer);
		cyr.selectByIndex(12);
		
	}

	@Given("user can be able to send valid ccv number")
	public void user_can_be_able_to_send_valid_ccv_number() 
	{
		driver.findElement(By.id("cc_cvv")).sendKeys("564");
		
	}

	@Then("user can be able to navigate to Booking confirmation page")
	public void user_can_be_able_to_navigate_to_booking_confirmation_page() throws InterruptedException 
	{
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(40000);
		
	}

	@Given("user can be able to select myitnery")
	public void user_can_be_able_to_select_myitnery()
	{
		driver.findElement(By.id("my_itinerary")).click();
	}
	
	@Then("user can able to navigate the Booked Itinerary page and logout")
	public void user_can_able_to_navigate_the_booked_itinerary_page_and_logout() 
	{
		driver.findElement(By.id("logout")).click();
	}
}
