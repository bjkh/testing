package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCookieInSelenium {

	
	WebDriver driver;
	@Test	
	public void AddCookie(){
		driver = new ChromeDriver();
		driver.navigate().to("https://boxofficeindia.com/");

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);;
		Cookie cookie = new Cookie("MEROCOOKIE", "2222222");
		Set<Cookie> cookies = driver.manage().getCookies();
		for (Cookie cook : cookies) {
		System.out.println(cook);
		
	
	}
	
	//add vayo tara dekhaena add vako cookie
	
	
}
}