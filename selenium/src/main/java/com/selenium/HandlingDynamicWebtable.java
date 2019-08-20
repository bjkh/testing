
///From guru99

package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingDynamicWebtable {

	WebDriver driver;

	@Test

	public void fetchingtotalnumberofrowsandcolumns() {
		System.setProperty("webdriver.chrome.driver",
				"G:/Programming and qa/QA/maile sikeko sab/java for qa complete/selenium/drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/web-table-element.php");

		java.util.List<WebElement> col = driver.findElements(By.xpath(".//*[@id=\'leftcontainer\']/table/thead/tr/th"));
		System.out.println("the number of columns are: " + col.size());
		java.util.List<WebElement> row = driver
				.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		System.out.println("the number of rows are: " + row.size());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement baseTable = driver.findElement(By.tagName("table"));

		
		//to get 3rd row
		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		String rowtext = tableRow.getText();
		System.out.println("Third row of table: " + rowtext);

		
		
		//to get 3rd row's 2nd column data
		WebElement cellIneed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		String valueIneed = cellIneed.getText();
		System.out.println("the data in the 2nd coumn of the third row is: " + valueIneed);
		driver.close();


		
		
		    
	}
}
