package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePageAdvance {

	public ActiTimePageAdvance(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);

	}

	//UserNAme Text Field
	private WebElement username;
	public WebElement getUserName()

	{
		return username;
	}

	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	//login Button Field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}

	//Minimize FlyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyoutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Adding User
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oClickUser;
	public WebElement getoClickUser()
	{
		return oClickUser;
	}

	//Adding NewUser
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement oClickAddUser;
	public WebElement getoClickAddUser()
	{
		return oClickAddUser;
	}

	//Create  FirstName
	private WebElement firstName;
	public WebElement getFirstName()
	{
		return firstName;
	}

	//Create  LastName
	private WebElement lastName;
	public WebElement getLastName()
	{
		return lastName;
	}

	//Create  Email
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}

	//Create  loginUserName
	private WebElement userDataLightBox_usernameField;
	public WebElement getUserDetails()
	{
		return userDataLightBox_usernameField;
	}

	//Create  loginUserPassword1
	private WebElement password;
	public WebElement getUserPassword()
	{
		return password;
	}

	//Create  loginUserPassword2
	private WebElement passwordCopy;
	public WebElement getRetypePassword()
	{
		return passwordCopy;
	}	

	//Save User

	private WebElement userDataLightBox_commitBtn;
	public WebElement getSaveUser()
	{
		return userDataLightBox_commitBtn;
	}	


	//logOut Button Field
	//@FindBy(linkText="Logout")
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}

	//Click On User1
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement ClickOnUser1;
	public WebElement getClickOnUser1()
	{
		return ClickOnUser1;
	}


	//Modify User Password
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement userDataLightBox_passwordField;
	public WebElement getClickOnpasswordUser()
	{
		return userDataLightBox_passwordField;
	}

	//Modify User ReTypePassword
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getClickpasswordRetypeUser()
	{
		return userDataLightBox_passwordCopyField;
	}

	//Save Changes
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement SaveChangesUser;
	public WebElement getSaveChangesUser()
	{
		return SaveChangesUser;
	}

	//Click On User2
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement ClickOnUser2;
	public WebElement getClickOnUser2()
	{
		return ClickOnUser2;
	}

	//Click On User3
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement ClickOnUser3;
	public WebElement getClickOnUser3()
	{
		return ClickOnUser3;
	}

	//Delete User1
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement ClickOnDelete;
	public WebElement getClickOnDelete()
	{
		return ClickOnDelete;
	}

	//Delete User2
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement ClickOnDelete2;
	public WebElement getClickOnDelete2()
	{
		return ClickOnDelete2;
	}

	//Delete User3
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table")
	private WebElement ClickOnDelete3;
	public WebElement getClickOnDelete3()
	{
		return ClickOnDelete3;
	}
	
	//Start Eploring ActiTime 1
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
    private WebElement ClickOnStartExplore1;
	public WebElement getClickOnStartExplore1()
	{
		return ClickOnStartExplore1;
	}
	
	//Start Eploring ActiTime 2
		@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	    private WebElement ClickOnStartExplore2;
		public WebElement getClickOnStartExplore2()
		{
			return ClickOnStartExplore2;
		}
		
		//Start Eploring ActiTime 2
				@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
			    private WebElement ClickOnStartExplore3;
				public WebElement getClickOnStartExplore3()
				{
					return ClickOnStartExplore3;
				}




}
