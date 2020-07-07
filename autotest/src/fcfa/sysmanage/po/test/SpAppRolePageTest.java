package fcfa.sysmanage.po.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.sysmanage.po.SpAppRolePage;
/**
 * 
 *@ClassName:SpAppRolePageTest
 *@Description:系统管理-角色管理页面测试类
 *@author:邓泽芳
 *@date:2017年3月28日
 *
 */
public class SpAppRolePageTest {

	SpAppRolePage spAppRolePage;
	
	@BeforeTest
	public void setup(){
		spAppRolePage=new SpAppRolePage();
	}
	
	
	@Parameters({"roleCode","roleName","roleDescription"})
	@Test
	public void testSave(String role_code,String role_name,String description) throws InterruptedException{
		spAppRolePage.save(role_code, role_name, description);
	}
	
}
