package fcfa.assetmanage.po.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.assetmanage.po.AssetItemMappingPage;
/**
 * 
 *@ClassName:AssetItemMappingPage
 *@Description:资产管理-资产必填项页面测试类
 *@author:邓泽芳
 *@date:2017年4月6日
 *
 */
public class AssetItemMappingPageTest {
	AssetItemMappingPage assetItemMappingPage;
	
	@BeforeTest
	public void setup(){
		assetItemMappingPage=new AssetItemMappingPage();
	}
	
	@Test
	public void testSelectType(){
		assetItemMappingPage.selectType();;
	}
	
	
	@Test
	public void testAddSave() throws InterruptedException{
		assetItemMappingPage.addSave();
	}
}
