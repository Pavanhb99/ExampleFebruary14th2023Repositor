package com.DataProviderbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class agss2 {
public static WebDriver oBrowser=null;
	
@Test(priority=1)
private static void LaunchBrowser()
{
	try
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
	oBrowser=new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
@Test(priority=2)
private static void Navigate()
{
try 
{
	oBrowser.get("http://localhost:82/login.do");
} catch (Exception e) {
	e.printStackTrace();
}
}

@Test(priority=3,dataProvider="logindetails")
private  void login(String name,String password)             
{
try 
{
oBrowser.findElement(By.id("username")).sendKeys(name);
Thread.sleep(2000);
oBrowser.findElement(By.name("pwd")).sendKeys(password);
Thread.sleep(2000);
oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
Thread.sleep(1000);

} catch (Exception e) {
	e.printStackTrace();
}
}
@Test(priority=4)
private static void minimizewindow()
{
try {
	oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
	Thread.sleep(1000);
	
} catch (Exception e) {
	e.printStackTrace();
}
}
@Test(priority=5,dataProvider="creteuserlogindetails")
private static void createuser(String fname,String lname,String email,String uname,String pwd,String copypwd)
{
try {
	oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
	Thread.sleep(2000);
	oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
	Thread.sleep(1000);
	oBrowser.findElement(By.name("firstName")).sendKeys(fname);
	Thread.sleep(2000);
	oBrowser.findElement(By.name("lastName")).sendKeys(lname);
	Thread.sleep(2000);
	oBrowser.findElement(By.name("email")).sendKeys(email);
	
	Thread.sleep(2000);
	oBrowser.findElement(By.name("username")).sendKeys(uname);
	Thread.sleep(1000);
	oBrowser.findElement(By.name("password")).sendKeys(pwd);
	Thread.sleep(2000);
	oBrowser.findElement(By.name("passwordCopy")).sendKeys(copypwd);
	Thread.sleep(1000);
	oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
	} catch (Exception e) {
	e.printStackTrace();
}
}
@Test(priority=6,dataProvider="modifydetails")
private static void modifyuser(String pass,String paascopy)
{
	try {
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pass);
		Thread.sleep(1000);
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(paascopy);
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(1000);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
@Test(priority=7)
private static void deleteuser()
{
try {
	oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")).click();
	Thread.sleep(1000);
	oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
	Thread.sleep(1000);
	Alert oalert=oBrowser.switchTo().alert();
	String content=oalert.getText();
    System.out.println(content);
	oalert.accept();
	
} catch (Exception e) {
	e.printStackTrace();
}
}
@Test(priority=8)
private static void logout()
{
try {
	oBrowser.findElement(By.id("logoutLink")).click();
} catch (Exception e) {
	e.printStackTrace();
}
}
@Test(priority=9)
private static void closeAplication()
{
try
{
	oBrowser.quit();
} catch (Exception e) {
	e.printStackTrace();
}
}
	

@DataProvider(name="logindetails")
public Object[][] getLoginData()
{
	return new Object[][] {{"admin","manager"}};
}
@DataProvider(name="creteuserlogindetails")
public Object[][] getcreateuserLoginData()
{
	return new Object[][] {{"user2","user2","user1@gmail.com","pavan","user1","user1"}};
}
	
@DataProvider(name="modifydetails")
public Object[][] getmodifyData()
{
	return new Object[][] {{"pwd1","pwd1"}};
}	
	
	
	
	
	
	
	
	
}

