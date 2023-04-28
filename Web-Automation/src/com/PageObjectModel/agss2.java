package com.PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class agss2 {
public static WebDriver oBrowser = null;
public static ActiTimePage oPage = null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
		Login();
		minimizeFlyoutWindow();
		CreateUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oPage = new ActiTimePage(oBrowser);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void navigateURL()
	{
		try
		{
			
			oBrowser.get("http://localhost:82/login.do");
			Thread.sleep(4000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void Login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutWindow()
	{
		try
		{
			
			oPage.getFlyoutWindow().click();
			Thread.sleep(2000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void CreateUser()
	{
		try
		{
		   
			oPage.getoClickUser().click();
			Thread.sleep(3000);
			oPage.getoClickAddUser().click();
			Thread.sleep(3000);
			oPage.getFirstName().sendKeys("user");
			oPage.getLastName().sendKeys("tester");
			oPage.getEmail().sendKeys("User1@gmail.com");
			oPage.getUserDetails().sendKeys("UserDemo1");
			oPage.getUserPassword().sendKeys("password1");
			oPage.getRetypePassword().sendKeys("password1");
			Thread.sleep(3000);
			oPage.getSaveUser().click();
			Thread.sleep(3000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser()
	{
		try
		{
		   
			oPage.getClickOnUserModify().click();
			Thread.sleep(4000);
			oPage.getUserPassword().sendKeys("user");
			Thread.sleep(4000);
			oPage.getRetypePassword().sendKeys("user");
			Thread.sleep(4000);
			oPage.getSaveChanges().click();
			Thread.sleep(2000);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
		   
			oPage.getSelectusertoDelete().click();
			Thread.sleep(2000);
			oPage.getClickOnDelete().click();
			Thread.sleep(2000);
			
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
		   
			oPage.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try 
		{
			
			oBrowser.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}
