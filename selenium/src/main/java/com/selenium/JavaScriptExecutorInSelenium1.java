package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorInSelenium1 {

	WebDriver driver;

	@Test
	public void JavascriptExecutor1() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		JavascriptExecutor webdriver = (JavascriptExecutor) driver;
		webdriver.executeScript("document.getElementById('email').setAttribute('value', 'text@gmail.com')");
		webdriver.executeScript("document.getElementById('password').setAttribute('value', 'text')");
		webdriver.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id='u_0_2']")));

	}
}
