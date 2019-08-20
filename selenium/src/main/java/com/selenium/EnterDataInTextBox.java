package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterDataInTextBox {
	WebDriver driver;
	@Test
	
	public void enterDateInTextField()
	{
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bijay_khanal@hotmail.com");
		
		
	}

}
