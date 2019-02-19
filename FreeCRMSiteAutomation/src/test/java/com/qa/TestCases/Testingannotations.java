package com.qa.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingannotations 
{
	@BeforeSuite
	public void Test1_suite()
	{
		System.out.println("Before Suite--Test1");
	}
	@BeforeTest
	public void Test2_Test()
	{
		System.out.println("Before Test--Test2");
	}
	@BeforeClass
	public void Test3_Class()
	{
		System.out.println("Before Class--Test3");
	}
	@BeforeMethod
	public void Test4_Method()
	{
		System.out.println("Before Method--Test4");
	}
	@Test
	public void Test5_Test()
	{
		System.out.println("Test--Test5");
	}
	
	@AfterMethod
	public void Test6_Method()
	{
		System.out.println("After Method--Test6");
	}
	@AfterTest
	public void Test7()
	{
		System.out.println("After Test---Test7");
	}
	@AfterClass
	public void Test8()
	{
		System.out.println("After Class --Test8");
	}
	@AfterMethod
	public void Test9()
	{
		System.out.println("After Method Test 10");
	}
	@AfterSuite
	public void Test10()
	{
		System.out.println("After Suite--Test11");
	}
	
	
	
	
	
	

}
