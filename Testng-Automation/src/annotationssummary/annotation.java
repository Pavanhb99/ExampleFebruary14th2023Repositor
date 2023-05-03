package annotationssummary;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	@Test
	public void method1()
	{
		System.out.println("this is @test Annotation method1");
	}
	@Test
	public void method2()
	{
		System.out.println("this is @test annotation method2");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is @beforemethod Annotation method");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("this is @beforeclass annotation method");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("this is @afterclass annotation method");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("this is @beforeTest annotation method");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("this is @aftertest annotation method");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("this is @beforesuite annotation method");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("this is @aftersuite annotation method");
	}
	
}
