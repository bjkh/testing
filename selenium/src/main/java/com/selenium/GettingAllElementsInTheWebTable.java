package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GettingAllElementsInTheWebTable {
	@Test

	public void AllElementsFromWebTable(){
		WebDriver driver;
		
		
		 
		System.setProperty("webdriver.chrome.driver", "G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe" );
		driver= new ChromeDriver();
			
		 driver.get("http://demo.guru99.com/test/web-table-element.php"); 

	 
		 List<WebElement> myList=driver.findElements(By.className("dataTable"));
		    //To store all web elements into list

		    List<String> all_elements_text=new ArrayList<String>();
		    //If you want to get all elements text into array list

		    for(int i=0; i<myList.size(); i++){

		        all_elements_text.add(myList.get(i).getText());
		        //loading text of each element in to array all_elements_text
		        System.out.println(myList.get(i).getText());
		        
		        
		        
		        
		        
		        
		        
		    }	
	}

}


