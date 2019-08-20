package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropInSelenium {

	WebDriver driver;
	@Test	
	public void DragDrop(){
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		WebElement sourceObject = driver.findElement(By.cssSelector("#draggable"));
		WebElement tagetObject = driver.findElement(By.cssSelector("#droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceObject, tagetObject).build().perform();

		//yo va6aina, chromedriver update garevane hun6
		
		
	}
	
}
