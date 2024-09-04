package com.RunnerClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runnnermethods 
{
	public static WebDriver driver;
	
	public static void browserinvoke() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void browserclose() 
	{
		driver.close();
	}
	
	public static void clickanelement(WebElement element) 
	{
		element.click();
	}
	
	public static void tosendvalue(WebElement element, String value) 
	{
		element.sendKeys(value);
	}
	
	public static void urldata(String url) 
	{
		driver.get(url);
	}
	
	public static void maximize() 
	{
		driver.manage().window().maximize();
	}
	
	

}
