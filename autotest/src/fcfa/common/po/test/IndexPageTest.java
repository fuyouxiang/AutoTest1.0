package fcfa.common.po.test;

import main.util.GlobalContant;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.common.po.IndexPage;
import fcfa.sysmanage.po.SysUserEditPage;

/**
 * 
 *@ClassName:IndexPageTest
 *@Description:登录系统之后的主页面测试类
 *@author:邓泽芳
 *@date:2017年2月22日
 *
 */
//@Listeners({TestNGListener.class})
public class IndexPageTest {
	public IndexPage indexPage;
	public WebDriver driver;

	
	@BeforeClass
	public void setup(){
		indexPage=new IndexPage();
	}
	
	
	@Test
	public void testClickCardItem() throws InterruptedException{
		indexPage.clickCardItem();
	}
	
	@Test
	public void testClickAssetItemMapping() throws InterruptedException{
		indexPage.clickAssetItemMapping();
	}
	
	@Test
	public void testClickAddBtn() throws InterruptedException{
		indexPage.clickAddBtn();
	}
	
	@Test
	public void testClickModifyBtn() throws InterruptedException{
		indexPage.clickModifyBtn();
	}
	
	@Test
	public void testClickDeleteBtn() throws InterruptedException{
		indexPage.clickDeleteBtn();
	}
	
	@Test
	public void testClickEnableBtn() throws InterruptedException{
		indexPage.clickEnableBtn();
	}
	
	@Test
	public void testClickDisableBtn() throws InterruptedException{
		indexPage.clickDisableBtn();
	}
	
	@Test
	public void testClickLogoutUserBtn() throws InterruptedException{
		indexPage.clickLogoutUserBtn();
	}
	
	//@Parameters("selectRow")
	@Test
	public void testSelectRow(){   
		indexPage.selectRow(GlobalContant.selectRow);
	}
	
	



	@Test
	public void testClickSpApp() throws InterruptedException{
		indexPage.clickSpApp();
	}
	
	@Test
	public void testClickSpAppRole() throws InterruptedException{
		indexPage.clickSpAppRole();
	}
	
	
	@Test
	public void testClickSysUser() throws InterruptedException{
		indexPage.clickSysUser();
	}
	
	
	@Test
	public void testClickLogoutBtn() throws InterruptedException{
		indexPage.clickLogoutBtn();
	}
	
	@Test
	public void testClickSysElement() throws InterruptedException{
		indexPage.clickSysElement();
	}
	
	
	@Test
	public void testClickAssetSplit(){
		indexPage.clickAssetSplit();
	}
	
	@Test
	public void testClickAssetImport(){
		indexPage.clickAssetImport();
	}
	
	@Test
	public void testClickAssetList(){
		indexPage.clickAssetList();
	}
	
	//@AfterClass
	public void quit(){
		driver.quit();
	}
	
}
