package com.simplilearn.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageTest {
	
	public static void main(String[] args) {
		//download selenium-server-3.5.0.zip from previous releses from below link
		//link:https://www.selenium.dev/downloads/
		
		//download google chrome driver as per you google chrome version
		//goto>google chrome>help>about google chrome> check your version
		//to download driver: https://chromedriver.chromium.org/downloads
		
		
		//step:1 declare the path
		String path="D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Step:2 initialisizng webdriver
		WebDriver driver = new ChromeDriver();
		
		//step:3 give base url
		String url="http://www.google.com";
		driver.get(url);
		driver.close();
		System.out.println("Driver Working Perfectly");
	}

}
