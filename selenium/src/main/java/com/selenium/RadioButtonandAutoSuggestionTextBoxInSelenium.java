package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonandAutoSuggestionTextBoxInSelenium {

	WebDriver driver;

	@Test
	public void RadioButtonandAutoSuggestionTextBoxInSelenium1() {

		System.setProperty("webdriver.chrome.driver",
				"G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://my.monsterindia.com/create_account.html?from=Enggwave_Aggregator&spl=IN_Enggwave_Aggregator&WT.mc_n=olm_sk_IN_Enggwave_Aggregator&gd=1&job=22453051&action=apply");

		driver.findElement(By.xpath("//input[@id='firstName_id']")).sendKeys("bj");
		driver.findElement(By.xpath("//input[@id='lastName_id']")).sendKeys("kh");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bj@hotmail.com");
		driver.findElement(By.xpath("//input[@id='passwd_id']")).sendKeys("gg");

		
		// yaha javascript bata highlight garera click garya close buttonlai
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red; ')",
		driver.findElement(By.xpath("//div[@id='emailmsg_close']")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[@id='emailmsg_close']")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//span[@class='select2-arrow']//b")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/ul[1]/li[3]/div[1]")).click();
		driver.findElement(By.xpath("//input[@id='mobile2']")).sendKeys("9878");
		driver.findElement(By.xpath("//div[@id='expYrMonth']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='exp_year3']")).click();
		driver.findElement(By
				.xpath("/html[1]/body[1]/metaâ[1]/div[2]/div[3]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[5]/label[5]/div[1]/div[1]/input[1]"))
				.click();
		driver.findElement(By.xpath("//div[@class='right clip_image closedropdown']")).click();
		driver.findElement(By.xpath("//input[@id='skills']")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='skills']")).sendKeys("jav");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id='ui-id-2']")).click();

		
	//aba checkbox select garne 6
		
		
		
		driver.findElement(By.xpath("//div[@id='ind_value']")).click();
		driver.findElement(By.xpath("//div[@id='other_ind_8_check']")).click();
		driver.findElement(By.xpath("//div[@id='other_ind_11_check']")).click();
		driver.findElement(By.xpath("//div[@id='other_ind_74_check']")).click();
		driver.findElement(By.xpath("//div[@class='right clip_image closedropdown']")).click();

		
		
		
		
		
		
		
		
	}
}
