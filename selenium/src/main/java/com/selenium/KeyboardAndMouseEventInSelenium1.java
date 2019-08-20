package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAndMouseEventInSelenium1 {

	
	
	WebDriver driver;
	@Test
	
	public void KeyboardAndMouseEvent(){
		
		System.setProperty("webdriver.chrome.driver",
				"G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement text = driver.findElement(By.xpath("//input[@name='q']"));
	
	Actions action = new Actions(driver);
	Action action1 = action.keyDown(text, Keys.SHIFT).sendKeys("robert").keyUp(text, Keys.SHIFT).build();//capital letter ma sendkey garne

	action1.perform();
	
	}
}
