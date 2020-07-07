package fcfa.basedata.po;

import main.po.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 *@ClassName:SysElementStandardPage
 *@Description:基础数据管理-要素代码集定义编辑界面-规范标准定义
 *@author:邓泽芳
 *@date:2017年3月23日
 *
 */
public class SysElementStandardPage extends BasePage{
	
	
	@FindBy(css="#sysElement_codeRule")
	private WebElement sysElement_codeRule;
	
	@FindBy(css="#sysElement_scope")
	private WebElement sysElement_scope;

	@FindBy(css="#sysElement_eleStandard")
	private WebElement sysElement_eleStandard;
	
	
	@FindBy(css="#sysElement_Next2")
	private WebElement btn_next2;
	
		
	public void save_next2(String codeRule,String scope,String eleStandard){
		sysElement_codeRule.clear();
		sysElement_codeRule.sendKeys(codeRule);
		sysElement_scope.clear();
		sysElement_scope.sendKeys(scope);
		sysElement_eleStandard.clear();
		sysElement_eleStandard.sendKeys(eleStandard);
		btn_next2.click();
	}
	
	
}
