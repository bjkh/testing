
//yo vaena

package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameInSelenium {


	WebDriver driver;
	@Test	
	public void IFrame(){
		driver = new ChromeDriver();
		driver.navigate().to("file:///F:/startbootstrap-sb-admin-2-gh-pages/startbootstrap-sb-admin-2-gh-pages/pages/forms.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().findElement(By.xpath("//iframe[@src='frame.html']"))).switchTo().frame("name");
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='frame.html']")));
		//driver.findElement(By.name("/html/body/div/form/div/input[1]")).sendKeys("userName");
		driver.switchTo().defaultContent();
	
	
	}
}
