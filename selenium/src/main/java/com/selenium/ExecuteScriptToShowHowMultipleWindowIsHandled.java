package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecuteScriptToShowHowMultipleWindowIsHandled {

	String month = "November 2019";
	String date = "21";
	
	WebDriver driver;
	@Test
	public void Exampleee(){
		
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		   driver= new ChromeDriver();
			
		   driver.get("http://www.phptravels.net/");
		   driver.findElement(By.xpath("//*[@id='dpd1']/div/input")).click();
		   
		   WebElement mon = driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]"));
		   while(true)
		   {
			if(mon.getText().equals(month)){
				break;
			}   
			else{
				driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/thead/tr[1]/th[3]")).click();
				
					
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				
			}
		   }
			driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][1]/div[1]/table/tbody/tr/td[contains(text(),'"+date+"')]")).click();

		   }
}
