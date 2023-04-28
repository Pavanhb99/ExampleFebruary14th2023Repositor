package com.DataProviderbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class agss3 {
	public static WebDriver obrowser=null;
	
	 @Test(priority=1)
	private static void launch()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 @Test(priority=2)
	private static void navigate()
	{
		try {
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    @Test(priority=3,dataProvider="logindetails")
private  void login(String name,String password)             
{
	try 
	{
	obrowser.findElement(By.id("username")).sendKeys(name);
	Thread.sleep(2000);
	obrowser.findElement(By.name("pwd")).sendKeys(password);
	Thread.sleep(2000);
	obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
	Thread.sleep(1000);
	
} catch (Exception e) {
		e.printStackTrace();
	}
}
    @Test(priority=4,dataProvider="customerdetails")
	private static void createcustomer(String cust1)
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(cust1);
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    @Test(priority=5)
	private static void deletecustomer()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    @Test(priority=6)
    private static void minimizewindow()
    {
    	try {
    		obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
    		Thread.sleep(2000);
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    }
    @Test(priority=7)
	private static void logout()
	{
		try {
			obrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    @Test(priority=8)
	private static void closeapp()
	{
		try {
			obrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
   

	@DataProvider(name="logindetails")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider(name="customerdetails")
	public Object[][] getcustomerLoginData()
	{
		return new Object[][] {{"pavan"}};
	}







	}


