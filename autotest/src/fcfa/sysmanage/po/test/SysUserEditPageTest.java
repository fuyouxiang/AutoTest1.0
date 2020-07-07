package fcfa.sysmanage.po.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.sysmanage.po.SysUserEditPage;
/**
 * 
 *@ClassName:SysUserEditPage
 *@Description:系统管理-用户管理测试类
 *@author:邓泽芳
 *@date:2017年4月1日
 *
 */
public class SysUserEditPageTest {

	SysUserEditPage sysUserEditPage;
	String user_code;
	
	@BeforeTest
	public void setup(){
		sysUserEditPage=new SysUserEditPage();
	}
	
	@Parameters({"usercode","username","password","confirmPwd","mobile","remark"})
	@Test
	public void testSave(String usercode,String username,String password,String confirmPwd,String mobile,String remark) throws InterruptedException{
		sysUserEditPage.save(usercode, username, password, confirmPwd, mobile, remark);
		
		
	}
	

}
