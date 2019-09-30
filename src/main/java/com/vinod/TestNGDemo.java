package com.vinod;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeSuite
	public void beforeSuitMethod() {
		System.out.println("beforesuit annotation used");
	}

	@BeforeTest
 	public void beforeTest()

 	{

 		System.out.println("beforeTest annotation used");

 	}

 	@BeforeMethod
 	public void beforeMethod()

 	{

 		System.out.println("beforeMethod annotation used");

 	}

 	@BeforeMethod
 	public void beforeMethodSecond()

 	{
		System.out.println("beforeMethodSecond annotation used");

    }

	@Test
	public void testMethod() 

{
		System.out.println("TestMethod annotation used");
	}

	@AfterMethod
	public void afterMethod()

	{

		System.out.println("AfterMethod annotation used");
}
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest annotation used");
	}	

	@AfterSuite
	public void afterSuite()

	{

		System.out.println("AfterSuite annotation used");

	}

}
