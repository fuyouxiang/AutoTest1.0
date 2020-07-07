package zc80.common.po;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import main.po.BasePage;


/**
 * 
 *@ClassName:ZiChanPeiZhi
 *@Description:资产配置
 *@author:付有翔
 *@date:2018年6月13日
 *
 */
public class ZiChanPeiZhi  extends BasePage {
	
	public ZiChanPeiZhi(){
		super();
	}
	
	
	//拉伸
	@FindBy(className="icon-navicon")
	private WebElement lashen;
	
	//资产管理
	@FindBy(className="pull-right-container")
	private WebElement zichanguanli;
	
	//资产配置申请
	@FindBy(linkText="资产配置申请")
	private WebElement zichanpeizhiadd;
	

	

		
	

	
	/**
	 * 
	 *@Method:
	 *@Description:点击拉伸按钮
	 *@author:付有翔
	 *@date:2018年6月13日
	 *
	 */	
	public void LaShen(){
		lashen.click();
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:资产管理悬浮
	 *@author:付有翔
	 *@date:2018年6月13日
	 *
	 */	
	public void GuanLiButton(){
		//调用Actions中的鼠标指针停留方法
		Actions action = new Actions(driver); 
		action.moveToElement(zichanguanli).perform();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:资产配置申请
	 *@author:付有翔
	 *@date:2018年6月13日
	 *
	 */	
	public void ZiChanPeiZhiAdd(){
		zichanpeizhiadd.click();
		zichanguanli.click();
	}
}
