package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorInSelenium2 {

		WebDriver driver;

		@Test
		public void JavascriptExecutor2() {
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			JavascriptExecutor webdriver = (JavascriptExecutor) driver;
			webdriver.executeScript("document.getElementById('email').setAttribute('value', 'text@gmail.com')");
			webdriver.executeScript("document.getElementById('password').setAttribute('value', 'text')");

					
			String DomainName = webdriver.executeScript("return document.domain;").toString();
			System.out.println("Domain name of this site:" 	+DomainName);
			
			
			String url = webdriver.executeScript("return document.URL;").toString();
			System.out.println("the url of this site is: " +url);
			
			webdriver.executeAsyncScript("window.scrollTo(0, document.body.scrollHeight)");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			webdriver.executeAsyncScript("window.scrollTo(0,-document.body.scrollHeight)");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			webdriver.executeAsyncScript("window.scrollBy(0,1500)");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			webdriver.executeAsyncScript("window.scrollBy(0,-1500)");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			webdriver.executeAsyncScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")));

			
	}

	
	
}
