package fcfa.basedata.po;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.po.BasePage;
import main.po.InitTest;
import main.util.GlobalContant;

/**
 * 
 *@ClassName:SysElementBasePage
 *@Description:基础数据管理-要素代码集定义编辑界面-代码集基本信息
 *@author:邓泽芳
 *@date:2017年3月23日
 *
 */
public class SysElementBasePage extends BasePage {
	
	public SysElementBasePage(){
		super();
		
	}
	
	@FindBy(css="input[u-meta*='sysElement_eleCode']")
	private WebElement ele_code;
	
	@FindBy(css="input[u-meta*='sysElement_eleName']")
	private WebElement ele_name;
	
	@FindBy(css="#status")
	private WebElement status;
	private Select selStatus=new Select(status);
	
	@FindBy(css="#eleTypeName")
	private WebElement eleTypeName;
	private Select selTypeName=new Select(eleTypeName);
	
	@FindBy(id="sysElement_Next1")
	private WebElement btn_next1;
	

	public void save_next1(String eleCode,String eleName) {
		ele_code.clear();
		ele_code.sendKeys(eleCode);
		ele_name.clear();
		ele_name.sendKeys(eleName);
		selStatus.selectByValue("1");
//		selTypeName.selectByValue("E103");
		eleTypeName.findElements(By.tagName("option")).get(3).click();
		btn_next1.click();
		
		
	}

}
