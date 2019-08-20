package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverInSelenium {
	
	WebDriver driver;
	@Test
	public void Examplee(){
		
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		   driver= new ChromeDriver();
			
		   driver.get("https://www.actitime.com/");
		   
		    WebElement features= driver.findElement(By.xpath("/html/body/header/div/nav/ul/li[2]/a"));
		   
		   Actions action = new Actions(driver);
		   
		   action.moveToElement(features).build().perform();
		

	}
	

}
