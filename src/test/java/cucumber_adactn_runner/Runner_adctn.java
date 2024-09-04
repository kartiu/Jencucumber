package cucumber_adactn_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\cucumber\\adactn\\feature",
glue = "cucumber_adactn_step_def", monochrome = true , dryRun = false , stepNotifications = false,
plugin = {"pretty","html:Reports/htmreport.html","json:Reports/jsnreport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class Runner_adctn 

{
	public static WebDriver driver;
	
	@BeforeClass
	public static void invoke() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public static void close()
	{
		driver.close();
		
	}

}
