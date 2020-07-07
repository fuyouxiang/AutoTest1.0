package fcfa.common.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

/**
 * 
 *@ClassName:ConfirmPage
 *@Description:确认提示页面
 *@author:邓泽芳
 *@date:2017年2月23日
 *
 */
public class ConfirmPage extends BasePage{
	
	public ConfirmPage(){
		super();
	}
	
	@FindBy(xpath="//button[@class='u-msg-button u-button u-button-primary raised']")
	private WebElement confirmBtn;
	
	//@FindBy默认每次方法调用元素的时候，需要查询该元素
	@FindBy(xpath="//button[@class='u-msg-button u-button u-button-primary raised']/ancestor::div/div[2]/p")
	@CacheLookup  //定位到该元素后进行缓存
	private WebElement msgElement;
		
	public String msgContent;
	
	
//	public WebDriver driver;

	
	/**
	 * 
	 *@Method:clickConfirmBtn
	 *@Description:点击确认按钮
	 *
	 */
	public void clickConfirmBtn(){
		confirmBtn.click();
//		return PageFactory.initElements(driver,IndexPage.class);
	}
	
	
	/**
	 * 
	 *@Method:getMsgContent
	 *@Description:获取提示信息内容
	 *@return
	 *
	 */
	public String getMsgContent(){
		msgContent=msgElement.getText();
		return msgContent;
	}
		
	
	
}
