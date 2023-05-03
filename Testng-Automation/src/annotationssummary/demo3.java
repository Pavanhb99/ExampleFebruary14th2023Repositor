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

public class demo3 {
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("this is @beforemethod method");
	}
    @Test
    public void method1()
    {
    	System.out.println("this is @test method1");
    }
    @AfterSuite
    public void aftersuite()
    {
    	System.out.println("this is @afterSuite method");
    }
    @BeforeSuite
    public void beforesuite()
    {
    	System.out.println("this is @beforesuite method");
    }
    @AfterMethod
    public void aftermethod()
    {
    	System.out.println("this is @aftermethod method");
    }
    @AfterClass
    public void afterclass()
    {
    	System.out.println("this is @AfterClass method");
    }
    @Test
    public void method2()
    {
    	System.out.println("this is @test method2");
    }
    @BeforeClass
    public void beforeclass()
    {
    	System.out.println("this is @beforeclass method");
    }
    @BeforeTest
    public void beforeTest()
    {
    	System.out.println("this is @BeforeTest method");
    }
    @AfterTest
    public void aftertest()
    {
    	System.out.println("this is @AfterTest method");
    }
}
