package zc80.common.po;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import main.po.BasePage;


/**
 * 
 *@ClassName:LoginPage
 *@Description:登录-登录页面类
 *@author:付有翔
 *@date:2017年5月16日
 *
 */
public class LoginPage extends BasePage  {
	
	
	public LoginPage(){
		super();
	}
	
	//用户名
	@FindBy(id="username")
	private WebElement login_username;
	
	//密码
	@FindBy(id="password")
	private WebElement login_password;
	
	//登录按钮
	@FindBy(id="loginBtn")
	private WebElement login_button;
	
	//提示
	@FindBy(id="error")
	private WebElement errorMsg;
	public String errorMsgContent;
	

	
	
	
	
	
	
	/**
	 * 
	 *@Method:login
	 *@Description:输入用户名和密码，点击登录按钮
	 *@param username
	 *@param password
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */
	public void login(String username,String password){
		//刷新页面
		driver.navigate().refresh();
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);		
	}
	
	/**
	 * 
	 *@Method:login
	 *@Description:输入用户名和密码，点击登录按钮
	 *@param username
	 *@param password
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */
	public void clicklogin(){
		//刷新页面
		login_button.click();
		
	}
	
	/**
	 * 
	 *@Method:login
	 *@Description:获取用户名为空的text
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public String getUsernameMsgContent(){
		errorMsgContent=errorMsg.getText();
		System.out.println("前台获取："+errorMsgContent);
		return errorMsgContent;
	}
	
	

	
	//driver.switchTo().alert().accept(); 点击alter提示框确定按钮
}
