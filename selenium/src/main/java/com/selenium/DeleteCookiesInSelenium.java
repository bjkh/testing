
//yo mileko chaina

package com.selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookiesInSelenium {

	WebDriver driver;
	@Test
	public void Cookies(){
	driver = new ChromeDriver();
	driver.navigate().to("https://boxofficeindia.com/");
	
	Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("size of cookies: " +cookies.size());
	 
	for(Cookie cookie: cookies){
		
		System.out.println("Name - "+cookie.getName());
		System.out.println("Domain - "+cookie.getDomain());
		System.out.println("Path - "+cookie.getPath());
		System.out.println("Value - "+cookie.getValue());
		System.out.println("***********************************************************");
	
	}
	
		
	//delete vaena
	//driver.manage().deleteAllCookies();
	//driver.manage().deleteCookieNamed("KRTBCOOKIE_107");
	//Set<Cookie> afterDelete = driver.manage().getCookies();
	//System.out.println("size of cookies after delete: " +afterDelete.size());
	
	
	}	
}
