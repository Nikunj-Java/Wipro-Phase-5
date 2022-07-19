package com.simplilearn.driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) {
		    
		    String path="D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);			
			WebDriver driver = new ChromeDriver();
			driver.get("D:\\Phase-5\\iframe.html");
			
			//find iframes from the website:https://www.freecodecamp.org/news/what-is-an-iframe-html-example/
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

			//by finding list of webelements using iframe tag
			List<WebElement> frame= driver.findElements(By.tagName("iframe"));
			
			System.out.println("Total number of iFrame Found: "+frame.size());
			
			//driver.quit();
	}
}
