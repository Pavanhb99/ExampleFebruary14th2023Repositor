package com.advancePageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	public static WebDriver oBrowser = null;
	public static ActiTimePageAdvanceTwo oPage2 = null;
	public static void main(String[] args) {

		launchBrowser();
		navigateURL();
		Login();
		minimizeFlyoutWindow();
		createUser1();
		logout();

		loginUser1();
		createUser2();
		logoutUser1();

		loginUser2();
		createUser3();
		logoutUser2();

		loginUser3();
		logoutUser3();

		loginUser2a();
		modifyUser3();
		logoutUser2();

		loginModifiedUser3();
		logoutModifiedUser3();

		loginUser1a();
		modifyUser2();
		logoutUser1();

		loginModifiedUser2();
		logoutModifiedUser2();

		Login();
		modifyUser1();
		logout();

		loginModifiedUser1();
		logoutModifiedUser1();

		loginModifiedUser2();
		deleteUser3();
		logoutModifiedUser2();


		loginModifiedUser1();
		deleteUser2();
		logoutModifiedUser1();

		Login();
		deleteUser1();
		logout();
		closeApplication();

	}


	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver,chrome,driver","D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oPage2 = new ActiTimePageAdvanceTwo(oBrowser);

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
			oPage2.getUserName().sendKeys("admin");
			oPage2.getPassword().sendKeys("manager");
			oPage2.getLogin().click();
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

			oPage2.getFlyoutWindow().click();
			Thread.sleep(2000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createUser1()
	{
		try 
		{
			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getoClickAddUser().click();
			Thread.sleep(3000);
			oPage2.getFirstName().sendKeys("User1");
			Thread.sleep(3000);
			oPage2.getLastName().sendKeys("Demo");
			Thread.sleep(3000);
			oPage2.getEmail().sendKeys("user1@gmail.com");
			Thread.sleep(3000);
			oPage2.getUserDetails().sendKeys("UserDemo1");	
			Thread.sleep(3000);
			oPage2.getUserPassword().sendKeys("Welcome1");	
			Thread.sleep(3000);
			oPage2.getRetypePassword().sendKeys("Welcome1");
			Thread.sleep(3000);
			oPage2.getSaveUser().click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			// TODO: handle exception
		}
	}

	private static void logout()
	{
		try
		{

			oPage2.getLogout().click();
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

			oPage2.getUserName().sendKeys("UserDemo1");
			Thread.sleep(2000);
			oPage2.getPassword().sendKeys("Welcome1");
			Thread.sleep(2000);
			oPage2.getLogin().click();
			Thread.sleep(3000);
			oPage2.getClickOnStartExplore1().click();
			Thread.sleep(3000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void createUser2()
	{
		try 
		{

			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getoClickAddUser().click();
			Thread.sleep(3000);
			oPage2.getFirstName().sendKeys("User2");
			Thread.sleep(3000);
			oPage2.getLastName().sendKeys("Demo");
			Thread.sleep(3000);
			oPage2.getEmail().sendKeys("user2@gmail.com");
			Thread.sleep(3000);
			oPage2.getUserDetails().sendKeys("UserDemo2");	
			Thread.sleep(3000);
			oPage2.getUserPassword().sendKeys("Welcome2");	
			Thread.sleep(3000);
			oPage2.getRetypePassword().sendKeys("Welcome2");
			Thread.sleep(3000);
			oPage2.getSaveUser().click();
			Thread.sleep(3000);


		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logoutUser1()
	{
		try 
		{
			oPage2.getLogout().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void loginUser2()
	{
		try 
		{
			oPage2.getUserName().sendKeys("UserDemo2");
			Thread.sleep(2000);
			oPage2.getPassword().sendKeys("Welcome2");
			Thread.sleep(2000);
			oPage2.getLogin().click();
			Thread.sleep(3000);
			oPage2.getClickOnStartExplore2().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void createUser3()
	{
		try 
		{

			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getoClickAddUser().click();
			Thread.sleep(3000);
			oPage2.getFirstName().sendKeys("User3");
			Thread.sleep(3000);
			oPage2.getLastName().sendKeys("Demo");
			Thread.sleep(3000);
			oPage2.getEmail().sendKeys("user3@gmail.com");
			Thread.sleep(3000);
			oPage2.getUserDetails().sendKeys("UserDemo3");	
			Thread.sleep(3000);
			oPage2.getUserPassword().sendKeys("Welcome3");	
			Thread.sleep(3000);
			oPage2.getRetypePassword().sendKeys("Welcome3");
			Thread.sleep(3000);
			oPage2.getSaveUser().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void logoutUser2()
	{
		try 
		{
			oPage2.getLogout().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void loginUser3()
	{
		try 
		{

			oPage2.getUserName().sendKeys("UserDemo3");
			Thread.sleep(2000);
			oPage2.getPassword().sendKeys("Welcome3");
			Thread.sleep(2000);
			oPage2.getLogin().click();
			Thread.sleep(3000);
			oPage2.getClickOnStartExplore3().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void logoutUser3()
	{
		try 
		{

			oPage2.getLogout().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	//Login As User2 Modify User3


	private static void loginUser2a()
	{
		try 
		{
			oPage2.getUserName().sendKeys("UserDemo2");
			Thread.sleep(2000);
			oPage2.getPassword().sendKeys("Welcome2");
			Thread.sleep(2000);
			oPage2.getLogin().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	private static void modifyUser3()
	{
		try 
		{

			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getClickOnUser3().click();
			Thread.sleep(3000);
			oPage2.getUserPassword().sendKeys("Password3");
			Thread.sleep(3000);
			oPage2.getRetypePassword().sendKeys("Password3");
			Thread.sleep(3000);
			oPage2.getSaveChangesUser().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void loginModifiedUser3()
	{
		try 
		{

			oPage2.getUserName().sendKeys("UserDemo3");
			Thread.sleep(2000);
			oPage2.getPassword().sendKeys("Password3");
			Thread.sleep(3000);
			oPage2.getLogin().click();
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
			oPage2.getLogout().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	//Login User1 Modify User2


	private static void loginUser1a()
	{
		try 
		{

			oPage2.getUserName().sendKeys("UserDemo1");
			Thread.sleep(2000);
			oPage2.getPassword().sendKeys("Welcome1");
			Thread.sleep(2000);
			oPage2.getLogin().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void modifyUser2()
	{
		try 
		{

			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getClickOnUser2().click();
			Thread.sleep(3000);
			oPage2.getUserPassword().sendKeys("Password2");
			Thread.sleep(3000);
			oPage2.getRetypePassword().sendKeys("Password2");
			Thread.sleep(3000);
			oPage2.getSaveChangesUser().click();
			Thread.sleep(3000);




		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void loginModifiedUser2()
	{
		try 
		{


			oPage2.getUserName().sendKeys("UserDemo2");
			Thread.sleep(2000);
			oPage2.getPassword().sendKeys("Password2");
			Thread.sleep(3000);
			oPage2.getLogin().click();
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
			oPage2.getLogout().click();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	//Login As Admin modify User1

	private static void modifyUser1()
	{
		try 
		{

			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getClickOnUser1().click();
			Thread.sleep(3000);
			oPage2.getUserPassword().sendKeys("Password1");
			Thread.sleep(3000);
			oPage2.getRetypePassword().sendKeys("Password1");
			Thread.sleep(3000);
			oPage2.getSaveChangesUser().click();
			Thread.sleep(3000);



		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void loginModifiedUser1()
	{
		try 
		{
			oPage2.getUserName().sendKeys("UserDemo1");
			Thread.sleep(2000);
			oPage2.getPassword().sendKeys("Password1");
			Thread.sleep(3000);
			oPage2.getLogin().click();
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
			oPage2.getLogout().click();
			Thread.sleep(3000);



		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	// login as User2 delete User3


	private static void deleteUser3()
	{
		try 
		{
			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getClickOnUser3().click();
			Thread.sleep(3000);
			oPage2.getClickOnDelete().click();
			Thread.sleep(3000);
			Alert oAlert3 = oBrowser.switchTo().alert();
			String content3 = oAlert3.getText();
			System.out.println(content3);
			oAlert3.accept();
			Thread.sleep(3000);


		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	//Login as User1 delete User2

	private static void deleteUser2()
	{
		try 
		{
			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getClickOnUser2().click();
			Thread.sleep(3000);
			oPage2.getClickOnDelete().click();
			Thread.sleep(3000);
			Alert oAlert2 = oBrowser.switchTo().alert();
			String content2 = oAlert2.getText();
			System.out.println(content2);
			oAlert2.accept();
			Thread.sleep(3000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	//Login As Admin Delete User1

	private static void deleteUser1()
	{
		try 
		{

			oPage2.getoClickUser().click();
			Thread.sleep(3000);
			oPage2.getClickOnUser1().click();
			Thread.sleep(3000);
			oPage2.getClickOnDelete().click();
			Thread.sleep(2000);
			Alert oAlert1 = oBrowser.switchTo().alert();
			String content1 = oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(3000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try 
		{

			oBrowser.quit();
			Thread.sleep(3000);

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}

