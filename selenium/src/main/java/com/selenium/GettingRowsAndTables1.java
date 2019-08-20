//dynamic webtables bata rows column nikalne

package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class GettingRowsAndTables1 {

	
	WebDriver driver;
	@Test
	public void Exampleee(){
		
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		   driver= new ChromeDriver();
	
		   driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   int rowsNumber = ( driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"))).size();
		   System.out.println("number of rows are: "+rowsNumber);
		   
		   int colsNumber = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		   System.out.println("number of cols are: "+colsNumber);
		   
		   
		   
	}
	
	
	
}
