package annotationssummary;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo1 {
	@Test
	public void method1()
	{
		System.out.println("this @test method1");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("this @beforeSuite method");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this @beforemethod method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("this @afterClass method");
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("this @Aftermethod method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this @beforeclass method");
	}
	@Test
	public void method2()
	{
		System.out.println("this @test method2");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("this @aftersuite method");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("this @aftertest method");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("this @beforetest method");
	}
	@Test
	public void method3()
	{
		System.out.println("this @test method3");
	}
}
