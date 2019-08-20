package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowToVerifyIfcheckboxIscCheckedOrNot
 {

	WebDriver driver;

	@Test
	public void CheckBox() {

	System.setProperty("webdriver.chrome.driver","G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://my.monsterindia.com/create_account.html?from=Enggwave_Aggregator&spl=IN_Enggwave_Aggregator&WT.mc_n=olm_sk_IN_Enggwave_Aggregator&gd=1&job=22453051&action=apply");
	
	driver.findElement(By.xpath("//div[@id='cat_value']")).click();	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("//div[@id='other_cat_907_check']")).click();
	driver.findElement(By.xpath("//div[@id='other_cat_3_check']")).click();
	driver.findElement(By.xpath("//*[@id='cat']/div[2]")).click();
	
	String check1 = driver.findElement(By.xpath("//*[@id='cat_popup']/div/div[2]/div/div[2]/input")).getAttribute("checked");//input tag ko xpath line kinavane checkded ra unchecked attribute tesmai au6 
	System.out.println(check1);
	String check2 = driver.findElement(By.xpath("//*[@id='cat_popup']/div/div[2]/div/div[3]/input")).getAttribute("checked");
	System.out.println(check2);
	String check3 = driver.findElement(By.xpath("//*[@id='cat_popup']/div/div[2]/div/div[4]/input")).getAttribute("checked");
	System.out.println(check3);
		
	if (check1.contentEquals("true") && check2.contentEquals("true") && check3 == null){
		Assert.assertTrue(true);
	}
	else{
		Assert.assertTrue(false, "one of the data is not right");
		}
	}	
 }
	

			
			
			
			
			
			
			
