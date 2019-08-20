package com.selenium.javascript;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public  class ZoomInZoomOutInSelenium{
WebDriver driver;
@Test
public void zoomInZoomOutSelenium(){
   driver = new ChromeDriver();
   driver.get("http://automationpractice.com/index.php");
   ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='40%'");
   ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='100%'");
 }
}
