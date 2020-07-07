package fcfa.basedata.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

/**
 * 
 *@ClassName:SysElementRemarkPage
 *@Description:基础数据管理-要素代码集定义编辑界面-编码方法信息
 *@author:邓泽芳
 *@date:2017年3月23日
 *
 */
public class SysElementRemarkPage extends BasePage {
	
	@FindBy(id="sysElement_remark")
	private WebElement sysElement_remark;
	
	@FindBy(id="sysElement_Next3")
	private WebElement save_next3;
	
	
	public void save_next3(String remark){
		sysElement_remark.clear();
		sysElement_remark.sendKeys(remark);
		save_next3.click();
	}

}
