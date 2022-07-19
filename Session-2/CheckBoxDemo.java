package com.simplilearn.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
		public static void main(String[] args) {
	
			
			//step:1 declare the path
			String path="D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			
			//Step:2 initialisizng webdriver
			WebDriver driver = new ChromeDriver();
			
			//step:3 give base url
			String url="https://www.shine.com/registration/";
			driver.get(url);
			 
			
			WebElement Check= driver.findElement(By.id("id_privacy"));
			
			if(Check.isSelected()) {
				System.out.println("CheckBox is Selected by Default");
				System.out.println("Status of checkbox :"+Check.isSelected());
			}
			else {
				System.out.println("Check box is not Selected");
			}
			Check.click();
			System.out.println("Status of checkbox :"+Check.isSelected());
			
			driver.close();
			
		}
}
