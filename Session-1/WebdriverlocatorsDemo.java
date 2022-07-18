package com.simplilearn.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.WebWindow;

public class WebdriverlocatorsDemo {
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\chromedriver_win32_new\\chromedriver.exe");
		//Step:2 initialisizng webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//step:3 give base url
		driver.get("http://www.facebook.com");
		
		//by id
		WebElement email_id= driver.findElement(By.id("email"));
		
		//by name
		WebElement email_name= driver.findElement(By.name("email"));
		
		System.out.println("Email by name and id is: "+email_id.equals(email_name));
		
		//LINK TEXT
		WebElement link= driver.findElement(By.linkText("Forgotten password?"));
		//link.click();
		
		
		
		
		//by relative path(x path)
		
		WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		System.out.println("Email by id and xpath is : "+email_id.equals(email_xpath));
		
		//by full x path
		WebElement email_fullxpath=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		System.out.println("Email by xpath and fullxpath : "+email_xpath.equals(email_fullxpath));
		
		//by using selector
		WebElement email_cssSelector= driver.findElement(By.cssSelector("#email"));
		System.out.println("Email by css selector and Fullxpath is : "+email_cssSelector.equals(email_fullxpath));
		
		//get the list of webelement
		List<WebElement> list= driver.findElements(By.cssSelector("input.inputtext"));
		
		for(WebElement e:list) {
			System.out.println("List of Webelements : "+e.getAttribute("placeholder"));
		}
		
		//by Tag
		
		WebElement password= driver.findElement(By.cssSelector("input[name=pass]"));
		System.out.println("Password using Tag: "+password.getAttribute("placeholder"));
		
		
		driver.close();
	}

}
