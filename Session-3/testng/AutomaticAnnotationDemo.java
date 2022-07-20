package com.simplileaern.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AutomaticAnnotationDemo {
  @Test
  public void Hello() {
	  System.out.println("Test CaseExecuted");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method Called");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method Called");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class Called");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class Called");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Called");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Called");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit Called");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After Suit Called");
  }
  

}
