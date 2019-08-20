package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardAndMouseEventInSeleniumLecture2 {

	
	WebDriver driver;
	@Test
	
	public void KeyboardAndMouseEvent(){
		
		System.setProperty("webdriver.chrome.driver",
				"G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
	
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname =  driver.findElement(By.name("lastname"));
		WebElement email = driver.findElement(By.name("reg_email__"));
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		
		Actions action = new Actions(driver);
		action.keyDown(firstname, Keys.SHIFT).sendKeys("robert").keyUp(firstname, Keys.SHIFT).build().perform();//entering data in capital letter
		action.keyDown(lastname, Keys.SHIFT).sendKeys("gis").keyUp(lastname, Keys.SHIFT).build().perform();
		action.keyDown(email, Keys.SHIFT).sendKeys("hj@gmail.com").keyUp(email, Keys.SHIFT).build().perform();
		action.keyDown(pass, Keys.SHIFT).sendKeys("68678678").keyUp(pass, Keys.SHIFT).build().perform();

	}
}
