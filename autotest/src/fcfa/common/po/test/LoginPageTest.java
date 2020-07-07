package fcfa.common.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.common.po.LoginPage;

/**
 * 
 *@ClassName:LoginPageTest
 *@Description:登录页面测试类
 *@author:邓泽芳
 *@date:2017年2月22日
 *
 */
//@Listeners({TestNGListener.class})
public class LoginPageTest{
	
	public LoginPage loginPage;
	public WebDriver driver;
	
	@BeforeClass
	public void setup(){
		loginPage=new LoginPage();
	}
	 
		 
	@Parameters({"username","password"})
	@Test
	public void testLogin(String username,String password){
		loginPage.login(username, password);
		
	}
	
	@Parameters("usernameMsg")
	@Test
	public void testAssertUsername(String usernameMsg){
		Reporter.log("验证用户名为空时系统提示信息是否正确");
		Assert.assertEquals(loginPage.getUsernameMsgContent(), usernameMsg);
		
	}
	
	
	@Parameters("passwordMsg")
	@Test
	public void testAssertPassword(String passwordMsg){
		Assert.assertEquals(loginPage.getPasswordMsgContent(), passwordMsg);
	}
	
	
	@Parameters("errorMsg")
	@Test
	public void testAssertError(String errorMsg){
		Assert.assertEquals(loginPage.getErrorMsgContent(), errorMsg);
	}
	
	
	//@AfterClass
	public void close(){
		driver.close();
	}

}
