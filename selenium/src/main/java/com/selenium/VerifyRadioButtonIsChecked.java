package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyRadioButtonIsChecked {

	
	WebDriver driver;
	@Test
	
	public void RadioButton(){
		
		System.setProperty("webdriver.chrome.driver",
				"G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.xpath("//label[contains(text(),'New York')]")).click() ;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String className = driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]")).getAttribute("class") ;
		System.out.println(className);
		if(className.contains("ui-checkboxradio-checked ui-state-active")){
			Assert.assertTrue(true, "Test VerifyRadioButtond is Pass");
			
		}
		else{
			Assert.assertTrue(false, "Test VerifyRadioButtond is Pass");

		}
		
		
		
		
		
		
	
	}
}
