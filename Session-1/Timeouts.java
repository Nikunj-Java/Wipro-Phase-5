package com.simplilearn.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timeouts {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe");
		//Step:2 initialisizng webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		//implicit wait timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//scripted timeout
		 driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		//The pageLoadTimeout is the method used to set the time for 
		//the entire page load prior to throwing an exception. 
		//If the timeout time is set to negative, then the time taken 
		//to load the page is endless.
		
		//page loadtimeout
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		 
		 
		driver.get("http://www.facebook.com");
				
		//explicit wait
		WebDriverWait explicitwait= new WebDriverWait(driver, 10);
		explicitwait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("email")));
	   
		WebElement email= driver.findElement(By.id("email"));
	    email.sendKeys("teat@xyz.com");
		
		driver.close();
		
	}
}
