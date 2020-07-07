package fcfa.assetmanage.po.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.assetmanage.po.AssetCardImportPage;
/**
 * 
 *@ClassName:AssetCardImportPage
 *@Description:资产管理-资产导入页面测试类
 *@author:邓泽芳
 *@date:2017年3月30日
 *
 */
public class AssetCardImportPageTest {

	AssetCardImportPage assetCardImportPage;
	
	@BeforeTest
	public void setup(){
		assetCardImportPage=new AssetCardImportPage();
	}
	
	@Parameters("filePath")
	@Test
	public void testImportFile(String filePath){
		assetCardImportPage.importFile(filePath);
	}
	
}
