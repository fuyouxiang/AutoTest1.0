package fcfa.assetmanage.po.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.assetmanage.po.AssetSplitPage;
/**
 * 
 *@ClassName:AssetSplitPage
 *@Description:资产管理-资产拆分页面测试类
 *@author:邓泽芳
 *@date:2017年3月27日
 *
 */
public class AssetSplitPageTest {

	AssetSplitPage assetSplitPage;
	
	@BeforeClass
	public void setup(){
		assetSplitPage=new AssetSplitPage();
	}
	
	
	@Parameters("assetCode")
	@Test
	public void testSave(String assetCode){
		assetSplitPage.save(assetCode);
	}
	
	
}
