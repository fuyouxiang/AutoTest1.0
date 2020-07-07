package fcfa.basedata.po.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.basedata.po.SysElementRemarkPage;

/**
 * 
 *@ClassName:SysElementRemarkPage
 *@Description:基础数据管理-要素代码集定义编辑界面-编码方法信息测试类
 *@author:邓泽芳
 *@date:2017年3月23日
 *
 */
public class SysElementRemarkPageTest {

	public SysElementRemarkPage sysElementRemarkPage;
	
	@BeforeClass
	public void setup(){
		sysElementRemarkPage=new SysElementRemarkPage();
	}
	
	@Parameters("remark")
	@Test
	public void testSaveNext3(String remark){
		sysElementRemarkPage.save_next3(remark);
	}
}
