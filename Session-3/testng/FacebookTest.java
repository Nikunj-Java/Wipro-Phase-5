package com.simplileaern.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookTest {
	
	WebDriver driver;
	
  @Test
  public void Facebook() {
	  
	   driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		//loacating webpage element: email
		WebElement email= driver.findElement(By.id("email"));
		//printing attribute value
		System.out.println(email.getAttribute("placeholder"));
		//send data using send keys
		email.sendKeys("nikunj@gmail.com");
		
		
		//loacating webpage element: password
		WebElement password=driver.findElement(By.name("pass"));
		//printing attribute value				
		System.out.println(password.getAttribute("placeholder"));
		//send data using send keys
		password.sendKeys("Nikunj@123");
		
		
		//finding login button
		WebElement login= driver.findElement(By.name("login"));
		//click on login button
		login.click();
		 
		//driver.close();
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe");			
		driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  
		driver=null;
  }

}
