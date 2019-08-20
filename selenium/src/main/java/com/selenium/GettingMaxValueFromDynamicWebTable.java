package com.selenium;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettingMaxValueFromDynamicWebTable {

	
	
	@Test
	public void MaxValue(){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		driver= new ChromeDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String row  = "//*[@id='leftcontainer']/table/tbody/tr"; 
		int rowData = driver.findElements(By.xpath(row)).size();
		
		WebElement currentPrice = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[4]"));//td[4] vaneko fourth column of all the rows vaneko current price column ko sab values ho
		
		String firstPart = "//*[@id='leftcontainer']/table/tbody/tr[";
		String secondPart = "]/td[4]";
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 1;i<= rowData;i++){    //first row is starting from 1 so i=1
			String finalPart = firstPart+i+secondPart;
			System.out.println(finalPart);
			String price = driver.findElement(By.xpath(finalPart)).getText();
			
			
			
			
			NumberFormat numberFormat = NumberFormat.getInstance();
			Number num = numberFormat.parse(price);
			price = num.toString();
			System.out.println(price);
			Double m = Double.parseDouble(price);
			
			int intPrice = m.intValue();
			array.add(intPrice);//aba sab data array list ma haalya

		}
		   Collections.sort(array);//sab data sort garne
		   System.out.println(array.get(0));
		   System.out.println(array.get(array.size()));
		   
		   
		   
		   
	}
		   
}