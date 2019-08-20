//yo vaena
package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOpenAndCollapseInSelenium {

	WebDriver driver;
	@Test
	
	public void RadioButtonNotChecked(){
		
		System.setProperty("webdriver.chrome.driver",
				"G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/ways-to-bank/bank-online/netbanking");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id='accordian1']/h3/span[1]")).click();
		String ClassName = driver.findElement(By.xpath("//*[@id='accordian1']/h3/span[1]")).getAttribute("class");
		System.out.println(ClassName);
		
		
		if(ClassName.contains("clearfix open active")){
			Assert.assertTrue(true, "Test verifyRadioButton is PASS");
		}
		else{
			Assert.assertTrue(false, "Test verifyRadioButton is PASS");

		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
