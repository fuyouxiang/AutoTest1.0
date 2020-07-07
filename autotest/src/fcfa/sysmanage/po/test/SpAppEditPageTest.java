package fcfa.sysmanage.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.sysmanage.po.SpAppEditPage;

/**
 * 
 *@ClassName:SpAppEditPageTest
 *@Description:系统管理-业务模块管理编辑页面测试类
 *@author:邓泽芳
 *@date:2017年2月24日
 *
 */
//@Listeners({TestNGListener.class})
public class SpAppEditPageTest {

	public SpAppEditPage spAppEditPage;
	public WebDriver driver;

	@BeforeClass
	public void setup(){
		spAppEditPage=new SpAppEditPage();
	}
	
	/**
	 * 
	 *@Method:testSpAppAdd_Save
	 *@Description:测试业务模块管理编辑页面中的保存操作
	 *@param spApp_code
	 *@param spApp_version
	 *@param spApp_name
	 *@param spApp_developer
	 * @throws InterruptedException 
	 *
	 */
	@Parameters({"spApp_code","spApp_version","spApp_name","spApp_developer"})
	@Test
	public void testSpAppAdd_Save(String spApp_code,String spApp_version,String spApp_name,String spApp_developer) throws InterruptedException{
		spAppEditPage.spAppAdd_Save(spApp_code, spApp_version, spApp_name, spApp_developer);
	}
	
}
