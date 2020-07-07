package fcfa.common.po;

import main.po.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//extends BasePage

/**
 * 
 *@ClassName:LoginPage
 *@Description:登录页面
 *@author:邓泽芳
 *@date:2017年2月22日
 *
 */
public class LoginPage extends BasePage {
	public LoginPage(){
		super();
	}

//	@FindBy(id="username")
	@FindBy(css="#username")
	private WebElement login_username;
	
//	@FindBy(id="password")
	@FindBy(css="#password")
	private WebElement login_password;
	
//	@FindBy(xpath="//*[@class='btn btn-primary']")
	@FindBy(css=".btn.btn-primary")
	private WebElement login_button;
	
//	@FindBy(xpath="//input[@id='username']/ancestor::div/ul/li")    
	@FindBy(css=".parsley-required")
	private WebElement usernameMsg;
	public String usernameMsgContent;
	
//	@FindBy(xpath="//input[@id='password']/ancestor::div/ul/li")
	@FindBy(css=".parsley-errors-list.filled>li")
	private WebElement passwordMsg;
	public String passwordMsgContent;
	
//	@FindBy(xpath="//div[@id='error_info']/font")
	@FindBy(css="#error_info>font")
	private WebElement errorMsg;
	public String errorMsgContent;
	

	/**
	 * 
	 *@Method:login
	 *@Description:输入用户名和密码，点击登录按钮
	 *@param username
	 *@param password
	 *
	 */
	public void login(String username,String password){
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);
		login_button.click();
	}
	
	public String getUsernameMsgContent(){
		usernameMsgContent=usernameMsg.getText();
		return usernameMsgContent;
	}
	
	public String getPasswordMsgContent(){
		passwordMsgContent=passwordMsg.getText();
		return passwordMsgContent;
	}
	
	public String getErrorMsgContent(){
		errorMsgContent=errorMsg.getText();
		return errorMsgContent;
	}
	
	/*
	public static WebElement login_username(WebDriver driver){
		element=driver.findElement(By.id("username"));
		return element;			
	}
	
	public static WebElement login_password(WebDriver driver){
		element=driver.findElement(By.id("password"));
		return element;			
	}
	
	public static WebElement login_button(WebDriver driver){
		element=driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
		return element;			
	}
	*/
}
