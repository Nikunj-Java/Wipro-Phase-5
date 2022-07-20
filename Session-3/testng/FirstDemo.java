package com.simplileaern.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstDemo {
   
	@Test
	public void Hello() {
		
		System.out.println("Welcome to TestNG");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class Method");
	}
	@AfterClass
	public  void afterClass() {
		System.out.println("After Class Method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("Before Suit");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suit");
	}
	
	
	
}
