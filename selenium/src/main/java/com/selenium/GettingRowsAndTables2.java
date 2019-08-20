package com.selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class GettingRowsAndTables2 {
	
	WebDriver driver;
	@Test
	public void Exampleee(){
		
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		   driver= new ChromeDriver();
	
		   driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    String rowData = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[3]/td[4]")).getText();
		    System.out.println("data of row is: "+rowData);
		    
		    rowData = driver.findElement(By.xpath("//a[contains(text(), 'Bank of India')]/parent::*/following-sibling::td[3]")).getText();
		    System.out.println("data of row is : "+rowData);
		    
	}
}
