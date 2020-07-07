package fasp.common.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fasp.common.po.LoginPage;



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
	
	//门户二级页面点击集中支付
	@Test
	public void MenHuXuanZe(){
		loginPage.MenHuZhiFu();
		
	}
	
	//线程睡眠
	@Test
	public void Sleep5(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(5000);
			System.out.println("----5秒睡眠完成！----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}	

	
	//验证登录时用户名为空提示是否正确
	@Parameters("usernameMsg")
	@Test
	public void testAssertUsername(String usernameMsg){
		System.out.println("后台判断："+usernameMsg);
		Assert.assertEquals(loginPage.getUsernameMsgContent(), usernameMsg);
		
	}
	 
	//验证登录时密码为空提示是否正确
	@Parameters("passwordMsg")
	@Test
	public void testAssertPassword(String passwordMsg){
		Assert.assertEquals(loginPage.getPasswordMsgContent(), passwordMsg);
	}
	
	//退出登录
	@Parameters("")
	@Test
	public void loginOutTest(){
		loginPage.loginOut();
	}
}
