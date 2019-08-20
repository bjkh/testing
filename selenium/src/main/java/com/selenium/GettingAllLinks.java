package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettingAllLinks {
	
	WebDriver driver;
	@Test

	public void AllLinks() {

		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		driver= new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> Links = driver.findElements(By.xpath("//a"));
			
		System.out.println(Links.size());
		ArrayList<String> data = new ArrayList<String>();
		for(int i = 0;i<Links.size();i++){
			
			System.out.println(Links.get(i).getText()); //text of all the http links display garne
			System.out.println(Links.get(i).getAttribute("href")); //http links display garne
			
			
			data.add(Links.get(i).getAttribute("href"));  //array data vanne ma Links vanne web element ma vako each we belementa(i) ko href attribute ko kuraharu add gareko  

					
		}
		System.out.println(data.size());
		
		
	}

}
