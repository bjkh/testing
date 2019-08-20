package com.selenium.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollInSelenium {
	WebDriver driver;

	@Test

	
	public void Scroll(){
		
		System.setProperty("webdriver.chrome.driver","G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tirerack.com/content/tirerack/desktop/en/homepage.html");
		
		
		driver.findElement(By.xpath("/html/body/div[7]/div/span")).click();
		
		
		
		
		 //yo overloaded method use garne:((JavascriptExecutor)driver).executeScript(arg0, arg1)
		 ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 ((JavascriptExecutor)driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		 //pixel anusar scroll gar6
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 2500)");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-2500)");
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  //xpath anusar scroll garne
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);" , driver.findElement(By.xpath("//a[contains(text(),'Start Shopping (and Saving)')]")));

		 
		



		 
		
		
		
	}
	
}
