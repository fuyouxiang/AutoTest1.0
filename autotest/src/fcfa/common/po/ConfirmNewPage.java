package fcfa.common.po;

import main.po.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 *@ClassName:ConfirmNewPage
 *@Description:确认提示新界面
 *@author:邓泽芳
 *@date:2017年3月8日
 *
 */
public class ConfirmNewPage extends BasePage{
	public ConfirmNewPage(){
		super();
	}

	@FindBy(xpath="//div[@class='u-message u-messuccess']")
	private WebElement msgElement;
	
	public String msgContent;
	
	public String getMsgContent(){
		msgContent=msgElement.getText();
		return msgContent;
	}

}
