package com.simplileaern.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  
	WebDriver driver=null;
	SoftAssert  soft= null;
	
	@Test
	public void titleTest() {
		
		//test case
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		soft.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		soft.assertAll();
		driver.close();
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		soft= new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe");			
		driver = new ChromeDriver();
		
	}
	@AfterMethod
	public void afterMethod() {
		soft=null;
		driver=null;
	}
   
}
