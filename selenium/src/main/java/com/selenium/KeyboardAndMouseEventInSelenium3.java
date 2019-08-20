//yesma arko tab ma kunai link kholne

package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAndMouseEventInSelenium3 {

	
	WebDriver driver;
	@Test
	
	public void KeyboardAndMouseEvent(){
		
		System.setProperty("webdriver.chrome.driver",
				"G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
	
	
		WebElement link = driver.findElement(By.xpath("//*[@id='menu_projects']/a"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(link).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}								
	
	
}
