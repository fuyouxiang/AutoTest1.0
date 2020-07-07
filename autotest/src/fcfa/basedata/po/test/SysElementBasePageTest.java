package fcfa.basedata.po.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.basedata.po.SysElementBasePage;


/**
 * 
 *@ClassName:SysElementBasePage
 *@Description:基础数据管理-要素代码集定义编辑界面-代码集基本信息测试类
 *@author:邓泽芳
 *@date:2017年3月23日
 *
 */
public class SysElementBasePageTest {

	public SysElementBasePage sysElementBasePage;
	
	@BeforeClass
	public void setup(){
		sysElementBasePage=new SysElementBasePage();
	}
	
	@Test
	@Parameters({"eleCode","eleName"})
	public void testSaveNext(String eleCode,String eleName){
		sysElementBasePage.save_next1(eleCode, eleName);
	}
}
