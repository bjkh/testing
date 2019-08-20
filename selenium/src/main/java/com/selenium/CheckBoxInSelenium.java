package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxInSelenium {

	WebDriver driver;

	@Test
	public void CheckBox() {

		System.setProperty("webdriver.chrome.driver",
				"G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://my.monsterindia.com/create_account.html?from=Enggwave_Aggregator&spl=IN_Enggwave_Aggregator&WT.mc_n=olm_sk_IN_Enggwave_Aggregator&gd=1&job=22453051&action=apply");

				
		driver.findElement(By.xpath("//div[@id='ind']")).click();
		driver.findElement(By.xpath("//div[@id='other_ind_8_check']")).click();
		driver.findElement(By.xpath("//div[@id='other_ind_11_check']")).click();
		driver.findElement(By.xpath("//*[@id='ind']/div[2]")).click();		
		
	}
}
