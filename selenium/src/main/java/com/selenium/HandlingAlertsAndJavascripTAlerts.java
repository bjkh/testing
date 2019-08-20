package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingAlertsAndJavascripTAlerts {

	
	
	
	WebDriver driver;
	@Test	
	public void Alerts(){
		driver = new ChromeDriver();
		driver.navigate().to("file:///F:/startbootstrap-sb-admin-2-gh-pages/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='side-menu']/li[7]/a")).click();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		String data = driver.findElement(By.xpath("//*[@id='demo']")).getText();
		if(data.equals("You pressed Cancel!")){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertEquals(data,"You pressed OK!");
		}

		driver.navigate().to("file:///F:/startbootstrap-sb-admin-2-gh-pages/startbootstrap-sb-admin-2-gh-pages/pages/index.html");
		driver.findElement(By.xpath("//*[@id='side-menu']/li[8]/a")).click();
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//yo part chai vaena
		driver.switchTo().alert().accept();
		
	}	
}
