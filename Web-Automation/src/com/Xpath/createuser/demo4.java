package com.Xpath.createuser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	public static WebDriver oBroswer=null;
	public static void main(String[]args) {
		lunchbroswer();
		navigete();
		closeappliction();
		login();
		minmizeflyoutwindow();
		logout();
	}
	private static void lunchbroswer()
	{
		try
		{
			System.setProperty("WebDriver,Chrome,Driver", "D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBroswer=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigete()
	{
		try
		{
			oBroswer.get("http://localhost:82/user/submit_tt.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeappliction()
	{
		try
		{
			oBroswer.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBroswer.findElement(By.id("username")).sendKeys("admin");
			oBroswer.findElement(By.name("password")).sendKeys("manager");
			oBroswer.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minmizeflyoutwindow()
	{
		try
		{
			oBroswer.findElement(By.id("GettingStandardShortPanelId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBroswer.findElement(By.linkText("Logout")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
