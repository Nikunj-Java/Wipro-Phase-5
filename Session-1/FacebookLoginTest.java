package com.simplilearn.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	
	public static void main(String[] args) {
		//step:1 declare the path
				String path="D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", path);
				
				//Step:2 initialisizng webdriver
				WebDriver driver = new ChromeDriver();
				
				//step:3 give base url
				String url="http://www.facebook.com";
				driver.get(url);
				
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
				//login.submit();
				
				//driver.close();
				 
	}
}
