package com.Xpath.createuser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static WebDriver oBroswer=null;
	public static void main(String[]args) {
		
		luchbroswer();
		navigete();
		closeappliction();
		login();
		minimizeflyoutwindow();
		logout();
		creatuser();
		deleteuser();
	}
	private static void luchbroswer()
	{
		try
		{
		System.setProperty("webDriver,Chrome,Driver", "D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		oBroswer =new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigete()
	{
		try
		{
			oBroswer.get("http://localhost/login.do");
            Thread.sleep(4000);			
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
			oBroswer.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private  static void minimizeflyoutwindow()
	{
		try
		{
			oBroswer.findElement(By.id("GettingStanderdShortcutPanelId")).click();
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
			oBroswer.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void creatuser()
	{
		try
		{
			oBroswer.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBroswer.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBroswer.findElement(By.name("firstname")).sendKeys("demo");
			oBroswer.findElement(By.name("lastname")).sendKeys("user1");
			oBroswer.findElement(By.name("email")).sendKeys("demo@gmail.comm");
			oBroswer.findElement(By.name("username")).sendKeys("demouser1");
			oBroswer.findElement(By.name("password")).sendKeys("welcome1");
			oBroswer.findElement(By.className("copypassword")).sendKeys("welcome1");
			oBroswer.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oBroswer.findElement(By.xpath("//span[text()='User1, demo']")).click();
			Thread.sleep(2000);
			oBroswer.findElement(By.id("UserDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBroswer.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
