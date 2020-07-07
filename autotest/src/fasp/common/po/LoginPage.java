package fasp.common.po;


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
	
	//密码登录模式
	@FindBy(id="userheadbtn")
	private WebElement login_type;
	
	//用户名
	@FindBy(id="username")
	private WebElement login_username;
	
	//密码
	@FindBy(id="password")
	private WebElement login_password;
	
	//登录按钮
	@FindBy(id="login-btn")
	private WebElement login_button;
	
	//用户名提示
	@FindBy(className="hint hint-user")
	private WebElement usernameMsg;
	public String usernameMsgContent;
	
	//密码提示
	@FindBy(className="hint hint-pwd")
	private WebElement passwordMsg;
	public String passwordMsgContent;

	
	//门户二级页面-集中支付
	@FindBy(className="jizhongzhifuh")
	private WebElement jizhongzhifuh;
	
	
	//退出
	@FindBy(xpath=".//span[text()='退出']")
	private WebElement loginout_btn;
	
	
	
	
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
		System.out.println("----首页加载start----");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----首页加载end----");
		driver.navigate().refresh();
		System.out.println("----首页刷新----");
		login_type.click();
		System.out.println("----选择密码登录----");
		
		//login_username.clear();
		login_username.sendKeys(username);
		System.out.println("----用户名已输入----");
		//login_password.clear();
		login_password.sendKeys(password);
		System.out.println("----密码已输入----");
		login_button.click();
		System.out.println("----登录按钮已点击----");		
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
		usernameMsgContent=usernameMsg.getText();
		System.out.println("前台获取："+usernameMsgContent);
		return usernameMsgContent;
	}
	
	
	/**
	 * 
	 *@Method:login
	 *@Description:获取密码为空的text
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public String getPasswordMsgContent(){
		passwordMsgContent=passwordMsg.getText();
		return passwordMsgContent;
	}
	
	
	/**
	 * 
	 *@Method:login
	 *@Description:门户二级点击集中支付
	 *@author:付有翔
	 *@date:2018年10月15日
	 *
	 */	
	public void  MenHuZhiFu(){

		jizhongzhifuh.click();
		
	}
	
	/**
	 * 
	 *@Method:loginout
	 *@Description:门户二级点击集中支付
	 *@author:yuanff
	 *@date:2018年10月23日
	 *
	 */	
	public void  loginOut(){

		loginout_btn.click();
		
	}
}
