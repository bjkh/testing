package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HowToWorkWithMultipleWindows {
	
	WebDriver driver;
	@Test
	public void Exampleee(){
		
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		   driver= new ChromeDriver();
			
		   driver.get("http://automationpractice.com/index.php");
		   driver.findElement(By.xpath("//*[@id='social_block']/ul/li[3]/a")).click();
		   
		   Set<String> windowsId = driver.getWindowHandles();
		   Iterator<String> itr = windowsId.iterator();
		   
		   String parentId = itr.next();
		   String childId = itr.next();	
		   
		   driver.switchTo().window(childId);
		   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		   driver.close();
		   driver.switchTo().window(parentId);
		   
		   driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		   
	}
}
