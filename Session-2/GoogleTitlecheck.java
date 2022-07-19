package com.simplilearn.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitlecheck {
	
	public static void main(String[] args) {
		 
				String path="D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
				String actualTitle="";
				String expectedTitel="Google";
				
				WebDriver driver = new ChromeDriver();
				
				 
				String url="http://www.google.com";
				driver.get(url);
				
				actualTitle=driver.getTitle();
				
				//comparison
				if(actualTitle.contentEquals(expectedTitel)){
					System.out.println("Test Case Passed");
				}
				else {
					System.out.println("Test Case Failed!");
				}
				
				driver.close();
				
				
				
				 
	}

}
