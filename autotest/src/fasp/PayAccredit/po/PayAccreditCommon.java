package fasp.PayAccredit.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.po.BasePage;


/**
 * 
 *@ClassName:XianJinYeWuInput
 *@Description:授权支付流程通用描述类
 *@author:付有翔
 *@date:2017年10月12日
 *
 */
public class PayAccreditCommon  extends BasePage {
	
	public PayAccreditCommon(){
		super();
	}
	
	//用户名
	@FindBy(id="username")
	private WebElement login_username;
	
	//密码
	@FindBy(id="password")
	private WebElement login_password;
	
	//登录按钮
	@FindBy(id="login-btn")
	private WebElement login_button;
	
	
	//我的单据
	@FindBy(xpath=".//*[@id='topDanju']/img")
	private WebElement MyBill;
	
	//我的单据-经办未签私章-第一条
	@FindBy(xpath="html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[3]/div[1]/div[1]/span/span")
	private WebElement MyBillJBFirst;
	
	
	//我的单据-经办未签私章-签章
	@FindBy(id="btn-bat-stamp-sq")
	private WebElement MyBillJBStamp;

	/**
	 * 
	 *@Method:
	 *@Description:我的单据
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void MyBill(){
		MyBill.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:我的单据-经办未签章-第一条
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void MyBillJBFirst(){
		MyBillJBFirst.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:我的单据-经办未签章-签章
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void MyBillJBStamp(){
		MyBillJBStamp.click();
	}
	
	/**
	 * 
	 *@Method:login
	 *@Description:输入用户名和密码，点击登录按钮
	 *@param username
	 *@param password
	 *@author:付有翔
	 *@date:2017年10月12日
	 *
	 */
	public void login(String username,String password){
		//刷新页面
		driver.navigate().refresh();
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);
		login_button.click();
		
	}
}
