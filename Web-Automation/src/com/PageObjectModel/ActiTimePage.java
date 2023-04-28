package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
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

	//Delete User
	@FindBy(xpath="//span[text()='tester, user']")
	private WebElement deleteuser;
	public WebElement getSelectusertoDelete()
	{
		return deleteuser;
	}

	//ClickDelete User
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement ClickOndeleteuser;
	public WebElement getClickOnDelete()
	{
		return ClickOndeleteuser;
	}



	//logOut Button Field
	//@FindBy(linkText="Logout")
	private WebElement logoutLink;
	public WebElement getLogout()
	{
		return logoutLink;
	}


	//Modify User
	
	@FindBy(xpath="//span[text()='tester, user']")
	private WebElement ClickOnUserToModify;
	public WebElement getClickOnUserModify()
	{
		return ClickOnUserToModify;
	}
	
//	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
//	private WebElement userDataLightBox_passwordField;
//	public WebElement getClickOnPasswordModify()
	{
	//	return userDataLightBox_passwordField;
	}

//	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
//	private WebElement userDataLightBox_passwordCopyField;
//	public WebElement getClickOnPasswordModifyRetype()
	{
//		return userDataLightBox_passwordCopyField;
	}

	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement ClickOnSaveChanges;
	public WebElement getSaveChanges()
	{
		return ClickOnSaveChanges;
	}


	//click On Task
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement ClickOnTask;
	public WebElement getClickOnTask()
	{
		return ClickOnTask;

	}

	//ClickOnAddNew
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement ClickOnAddNew;
	public WebElement getClickOnAddNew()
	{
		return ClickOnAddNew;
	}

	//Click On Add Customer
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement ClickOnAddCustomer;
	public WebElement getClickOnAddCustomer()
	{
		return ClickOnAddCustomer;
	}

	private WebElement customerLightBox_nameField;
	public WebElement getClickOnCustomerName()
	{
		return customerLightBox_nameField;
	}

	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement ClickOnCreate;
	public WebElement getClickOnCreateCustomer()
	{
		return ClickOnCreate;
	}

	//Modify Customer

	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement ClickOnModifyCustomer;
	public WebElement getClickOnModifyCustomer()
	{
		return ClickOnModifyCustomer;
	}

	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement ClickOnDescription;
	public WebElement getClickOnDescription()
	{
		return ClickOnDescription;
	}


	//Click On Customer
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")
	private WebElement ClickOnCustomer;
	public WebElement getClickOnCustomer()
	{
		return ClickOnCustomer;
	}
	//DeleteCustomer
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
	private WebElement ClickOnAction;
	public WebElement getClickOnAction()
	{
		return ClickOnAction;
	}

	@FindBy(xpath="//div[text()='Delete']")
	private WebElement ClickOnDelete;
	public WebElement getClickOnDeleteCustomerOrProject()
	{
		return ClickOnDelete;
	}


	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getClickOnDeletePermanantly()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}

	//Create Project
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement ClickOnAddNewProject;
	public WebElement getClickOnAddNewProject()
	{
		return ClickOnAddNewProject;
	}

	//Create Project Name
	private WebElement projectPopup_projectNameField;
	public WebElement getclickOnProjectName()
	{
		return projectPopup_projectNameField;
	}

	//Click On Create Project

	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement ClickOnCreateProject;
	public WebElement getClickOnCreateProject()
	{
		return ClickOnCreateProject;
	}

	//Delete Project

	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement ClickOnModifyProject;
	public WebElement getClickOnModifyProject()
	{
		return ClickOnModifyProject;
	}

	//Delete Project step2

	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement ClickOnActionProject;
	public WebElement getClickOnActionProject()
	{
		return ClickOnActionProject;
	}

	//Delete Project step3

	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement ClickOnDeleteProject;
	public WebElement getClickOnDeleteProject()
	{
		return ClickOnDeleteProject;
	}

	//Delete Project step3


	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getClickOnDeleteProjectpermanantly()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}

	
	//Modify Project
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement ClickOnSettingsProject;
	public WebElement getClickOnSettingsProject()
	{
		return ClickOnSettingsProject;
	}
	
	
	//Click On ProjectName to Modify(Step 1)
	@FindBy(xpath="//div[Text()='Developing The Software Application']")
	private WebElement ClickOnProjectNameTOEdit;
	public WebElement getClickOnProjectNameTOEdit()
	{
		return ClickOnProjectNameTOEdit;
	}
	
	//modify Project Step 2
	@FindBy(xpath="//*[@id=\\'taskListBlock\\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement ClickOnBoxProjectName;
	public WebElement getClickOnBoxProjectNameToEdit()
	{
		return ClickOnBoxProjectName;
	}
	
	//Clear Project name
	@FindBy(xpath="//*[@id=\\'taskListBlock\\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement ClickOnEditProjectName;
	public WebElement getClickOnEditProjectName()
	{
		return ClickOnEditProjectName;
	}
	
	
	//New Project name
		@FindBy(xpath="//*[@id=\\'taskListBlock\\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
		private WebElement ClickOnEditNewProjectName;
		public WebElement getClickOnEditNewProjectName()
		{
			return ClickOnEditNewProjectName;
		}
	
	//Save Modified Project Name
		@FindBy(xpath="//*[@id=\\'cpTreeBlock\\']/div[2]/div[2]/div/div[2]/div")
		private WebElement ClickOnNewNameProjectSave;
		public WebElement getClickOnNewNameProjectSave()
		{
			return ClickOnNewNameProjectSave;
		}
	
	
	
	
	
	

	//Add New Tasks
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement ClickOnAddNewTask;
	public WebElement getClickOnAddNewTask()
	{
		return ClickOnAddNewTask;
	}

	//Click On Add Create New Tasks
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement ClickOnCreateNewTask;
	public WebElement getClickOnCreateNewTask()
	{
		return ClickOnCreateNewTask;
	}

	//Create A new Task Name
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement ClickOnNameBox;
	public WebElement getClickOnNameBox()
	{
		return ClickOnNameBox;
	}

	//Click On Create Task Button
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement ClickOnCreatTask;
	public WebElement getClickOnCreatTask()
	{
		return ClickOnCreatTask;
	}

	//Click On Created Task 
	@FindBy(xpath="//div[text()='Complete Design of Application']")
	private WebElement ClickOnTaskName;
	public WebElement getClickOnTaskName()
	{
		return ClickOnTaskName;
	}

	//click On Task Action
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement ClickOnTaskAction;
	public WebElement getClickOnTaskAction()
	{
		return ClickOnTaskAction;
	}

	//click On Task Delete
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement ClickOnTaskDelete;
	public WebElement getClickOnTaskDelete()
	{
		return ClickOnTaskDelete;
	}

	//click On Task Delete Permanantly
	@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
	private WebElement ClickOnTaskDeletePermanantly;
	public WebElement getClickOnTaskDeletePermanantly()
	{
		return ClickOnTaskDeletePermanantly;
	}

}

