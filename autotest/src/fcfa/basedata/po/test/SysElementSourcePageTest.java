package fcfa.basedata.po.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.basedata.po.SysElementSourcePage;

/**
 * 
 *@ClassName:SysElementSourcePage
 *@Description:基础数据管理-要素代码集定义编辑界面-代码表信息测试类
 *@author:邓泽芳
 *@date:2017年3月23日
 *
 */
public class SysElementSourcePageTest {

	public SysElementSourcePage sysElementSourcePage;
	
	@BeforeClass
	public void setup(){
		sysElementSourcePage=new SysElementSourcePage();
	}
	
	@Parameters("eleCode")
	@Test
	public void testSave(String eleCode) throws InterruptedException{
		sysElementSourcePage.save("1",eleCode); 
	}
}
