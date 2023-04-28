package com.advancePageObjectModel;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjectModel.ActiTimePageAdvance;

public class demo1 {
	public static WebDriver oBrowser = null;
	public static ActiTimePageAdvance oPage1 = null;
	public static void main(String[] args) {
		launchBrowser();
		navigateURL();
	    Login();
		minimizeFlyoutWindow();
		CreateUser1User2User3();
    	logout();
    	loginUser1();
		logoutUser1();
		loginUser2();
		logoutUser2();
		loginUser3();
		logoutUser3();
	//	LoginAdmin();
	//	minimizeFlyoutWindowUser1();
	//	modifyUser1User2User3();
	//	logoutAdmin();
	//	loginModifiedUser1();
	//	logoutModifiedUser1();
	//	loginModifiedUser2();
	//	logoutModifiedUser2();
	//	loginModifiedUser3();
	//	logoutModifiedUser3();
	//	LoginAdminNew();
		minimizeFlyoutWindowUser2();
		deleteUsers();
		logoutAdminNew();
		closeApplication();
	}

	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oPage1 = new ActiTimePageAdvance(oBrowser);

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
			oPage1.getUserName().sendKeys("admin");
			oPage1.getPassword().sendKeys("manager");
			oPage1.getLogin().click();
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

			oPage1.getFlyoutWindow().click();
			Thread.sleep(2000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void CreateUser1User2User3()
	{
		try 
		{
			
			oPage1.getoClickUser().click();
			Thread.sleep(3000);
			oPage1.getoClickAddUser().click();
			Thread.sleep(3000);
			oPage1.getFirstName().sendKeys("user1");
			oPage1.getLastName().sendKeys("tester1");
			oPage1.getEmail().sendKeys("User1@gmail.com");
			oPage1.getUserDetails().sendKeys("UserDemo1");
			oPage1.getUserPassword().sendKeys("password1");
			oPage1.getRetypePassword().sendKeys("password1");
			Thread.sleep(3000);
			oPage1.getSaveUser().click();
			Thread.sleep(3000);
			
			oPage1.getoClickAddUser().click();
			Thread.sleep(3000);
			oPage1.getFirstName().sendKeys("user2");
			oPage1.getLastName().sendKeys("tester2");
			oPage1.getEmail().sendKeys("User2@gmail.com");
			oPage1.getUserDetails().sendKeys("UserDemo2");
			oPage1.getUserPassword().sendKeys("password2");
			oPage1.getRetypePassword().sendKeys("password2");
			Thread.sleep(3000);
			oPage1.getSaveUser().click();
			Thread.sleep(3000);
			
			
			oPage1.getoClickAddUser().click();
			Thread.sleep(3000);
			oPage1.getFirstName().sendKeys("user3");
			oPage1.getLastName().sendKeys("tester3");
			oPage1.getEmail().sendKeys("User3@gmail.com");
			oPage1.getUserDetails().sendKeys("UserDemo3");
			oPage1.getUserPassword().sendKeys("password3");
			oPage1.getRetypePassword().sendKeys("password3");
			Thread.sleep(3000);
			oPage1.getSaveUser().click();
			Thread.sleep(3000);
			
			
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
		   
			oPage1.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void loginUser1()
	{
		try
		{
			oPage1.getUserName().sendKeys("UserDemo1");
			oPage1.getPassword().sendKeys("password1");
			oPage1.getLogin().click();
			Thread.sleep(3000);
			oPage1.getClickOnStartExplore1().click();
			Thread.sleep(2000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutUser1()
	{
		try
		{
		   
			oPage1.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void loginUser2()
	{
		try
		{
			oPage1.getUserName().sendKeys("UserDemo2");
			oPage1.getPassword().sendKeys("password2");
			oPage1.getLogin().click();
			Thread.sleep(3000);
			oPage1.getClickOnStartExplore2().click();
			Thread.sleep(2000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutUser2()
	{
		try
		{
		   
			oPage1.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginUser3()
	{
		try
		{
			oPage1.getUserName().sendKeys("UserDemo3");
			oPage1.getPassword().sendKeys("password3");
			oPage1.getLogin().click();
			Thread.sleep(3000);
			oPage1.getClickOnStartExplore3().click();
			Thread.sleep(2000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutUser3()
	{
		try
		{
		   
			oPage1.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginAdmin()
	{
		try
		{
			oPage1.getUserName().sendKeys("admin");
			oPage1.getPassword().sendKeys("manager");
			oPage1.getLogin().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutWindowUser1()
	{
		try
		{

			oPage1.getFlyoutWindow().click();
			Thread.sleep(2000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser1User2User3()
	{
		try 
		{
			oPage1.getoClickUser().click();
			Thread.sleep(2000);
			
			oPage1.getClickOnUser1().click();
			Thread.sleep(2000);
			oPage1.getClickOnpasswordUser().sendKeys("password11");
			Thread.sleep(2000);
			oPage1.getClickpasswordRetypeUser().sendKeys("password11");
			Thread.sleep(2000);
			oPage1.getSaveChangesUser().click();
			Thread.sleep(2000);
			
			oPage1.getClickOnUser2().click();
			Thread.sleep(2000);
			oPage1.getClickOnpasswordUser().sendKeys("password22");
			Thread.sleep(2000);
			oPage1.getClickpasswordRetypeUser().sendKeys("password22");
			Thread.sleep(2000);
			oPage1.getSaveChangesUser().click();
			Thread.sleep(2000);
			
			oPage1.getClickOnUser3().click();
			Thread.sleep(2000);
			oPage1.getClickOnpasswordUser().sendKeys("password33");
			Thread.sleep(2000);
			oPage1.getClickpasswordRetypeUser().sendKeys("password33");
			Thread.sleep(2000);
			oPage1.getSaveChangesUser().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutAdmin()
	{
		try
		{
		   
			oPage1.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void loginModifiedUser1()
	{
		try
		{
			oPage1.getUserName().sendKeys("UserDemo1");
			oPage1.getPassword().sendKeys("password11");
			oPage1.getLogin().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutModifiedUser1()
	{
		try
		{
		   
			oPage1.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	
	private static void loginModifiedUser2()
	{
		try
		{
			oPage1.getUserName().sendKeys("UserDemo2");
			oPage1.getPassword().sendKeys("password22");
			oPage1.getLogin().click();
			Thread.sleep(3000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutModifiedUser2()
	{
		try
		{
		   
			oPage1.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void loginModifiedUser3()
	{
		try
		{
			oPage1.getUserName().sendKeys("UserDemo3");
			oPage1.getPassword().sendKeys("password33");
			oPage1.getLogin().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutModifiedUser3()
	{
		try
		{
		   
			oPage1.getLogout().click();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void LoginAdminNew()
	{
		try
		{
			oPage1.getUserName().sendKeys("admin");
			oPage1.getPassword().sendKeys("manager");
			oPage1.getLogin().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyoutWindowUser2()
	{
		try
		{

			oPage1.getFlyoutWindow().click();
			Thread.sleep(2000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUsers()
	{
		try
		{
			
			oPage1.getoClickUser().click();
			Thread.sleep(2000);
			
			oPage1.getClickOnUser1().click();
			Thread.sleep(2000);
			oPage1.getClickOnDelete().click();
			Thread.sleep(2000);
			
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
			oPage1.getClickOnDelete2().click();
			Thread.sleep(2000);
			oPage1.getClickOnDelete().click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String content1=oAlert1.getText();
			System.out.println(content1);
			oAlert.accept();
			Thread.sleep(2000);
			
			oPage1.getClickOnDelete3().click();
			Thread.sleep(2000);
			oPage1.getClickOnDelete().click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String content2=oAlert2.getText();
			System.out.println(content2);
			oAlert.accept();
			Thread.sleep(2000);
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void logoutAdminNew()
	{
		try
		{
		   
			oPage1.getLogout().click();
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



