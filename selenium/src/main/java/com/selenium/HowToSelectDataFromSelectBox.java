package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HowToSelectDataFromSelectBox {
	WebDriver driver;

	@Test
	

   public void enterText(){
	
	   System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
	   driver= new ChromeDriver();
		
	   driver.get("http://www.facebook.com");
	   
	   WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	   
	   Select select = new Select(month);
	   select.selectByValue("10");
	   
	   
	   WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	   Select selectday = new Select(day);
	   selectday.selectByIndex(29);
	   
	   WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	   Select Year = new Select(year); 
	   Year.selectByVisibleText("2016");
}

	
}
