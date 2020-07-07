package zc80.common.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import zc80.common.po.LoginPage;



/**
 * 
 *@ClassName:LoginPageTest
 *@Description:登录页面测试类
 *@author:付有翔
 *@date:2017年5月15日
 *
 */
public class LoginPageTest {

	public LoginPage loginPage;
	public WebDriver driver;
	
	//
	@BeforeClass
	public void setup(){
		loginPage=new LoginPage();
	}
	 
	//登录操作
	@Parameters({"username","password"})
	@Test
	public void testLogin(String username,String password){
		loginPage.login(username, password);
		
	}
	
	//登录点击
	@Parameters()
	@Test
	public void clicklogin(){
		loginPage.clicklogin();;
		
	}
	
	//验证登录时用户名为空提示是否正确
	@Parameters("errorMsg")
	@Test
	public void testAssertUsername(String errorMsg){
		System.out.println("后台判断："+errorMsg);
		Assert.assertEquals(loginPage.getUsernameMsgContent(), errorMsg);
		
	}
	
	//线程睡眠
	@Test
	public void Sleep10(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(10000);
			System.out.println("----10秒睡眠完成！----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	 
	
}
