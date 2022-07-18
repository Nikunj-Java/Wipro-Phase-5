package com.simplilearn.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class Timeouts {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe");
		//Step:2 initialisizng webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//step:3 give base url
		driver.get("http://www.facebook.com");
		
		
		//implicit wait timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//scripted timeout
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		//page loadtimeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("teat@xyz.com");
		
		//driver.close();
		
	}
}
