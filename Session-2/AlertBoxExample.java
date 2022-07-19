package com.simplilearn.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {

	
	public static void main(String[] args) {
		   String path="D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);			
			WebDriver driver = new ChromeDriver();
			driver.get("https://nxtgenaiacademy.com/alertandpopup/");
			
			//simple alertbox
			driver.findElement(By.name("alertbox")).click();
			driver.switchTo().alert().accept();
			
			//confirm alert box
			driver.findElement(By.name("confirmalertbox")).click();
			driver.switchTo().alert().accept();
			
			System.out.println(driver.findElement(By.id("demo")).getText());
			
			
			
			//prompt alert box
			driver.findElement(By.name("promptalertbox1234")).click();
			driver.switchTo().alert().sendKeys("yes");
			driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();
			
			System.out.println(driver.findElement(By.id("demoone")).getText());
			
			
			
			
			 driver.close();
	}
}
