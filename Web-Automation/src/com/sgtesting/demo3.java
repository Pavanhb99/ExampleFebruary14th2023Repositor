package com.sgtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {
	
    public static WebDriver oBroswer=null;
	public static void main(String[] args) {
	
		luchbroswer();	
		navigate();
		closeapplication();
		login();
		FlyoutWindow();
		logout();
	}
	private static void luchbroswer()
	{
		try
		{
			System.setProperty("WebDriver.chrome.driver","D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBroswer=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigate()
	{
		try
		{
			oBroswer.get("http://localhost:82/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			oBroswer.close();
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
			oBroswer.findElement(By.name("pwd")).sendKeys("manager");
			oBroswer.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void FlyoutWindow()
	{
		try
		{
			oBroswer.findElement(By.id("gettingStartedSortcutPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBroswer.findElement(By.linkText("logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
