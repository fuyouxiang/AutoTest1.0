package fcfa.basedata.po.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.basedata.po.SysElementStandardPage;

/**
 * 
 *@ClassName:SysElementStandardPage
 *@Description:基础数据管理-要素代码集定义编辑界面-规范标准定义测试类
 *@author:邓泽芳
 *@date:2017年3月23日
 *
 */
public class SysElementStandardPageTest {

	public SysElementStandardPage sysElementStandardPage;
	
	@BeforeClass
	public void setup(){
		sysElementStandardPage=new SysElementStandardPage();
	}
	
	
	
	@Parameters({"codeRule","scope","eleStandard"})
	@Test
	public void testSaveNext2(String codeRules,String scopes,String eleStandards){
		sysElementStandardPage.save_next2(codeRules,scopes,eleStandards);
	}
	
	
	
}
