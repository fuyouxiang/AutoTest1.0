package fcfa.common.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.po.BasePage;

public class DeleteConfirmPage extends BasePage{
	
	@FindBy(css=".u-msg-ok.u-button.u-button-primary.raised")
	private WebElement delConfirmBtn;
	
	@FindBy(css=".u-msg-cancel.u-button")
	private WebElement delCancelBtn;
	
	public void clickdelConfirmBtn(){
		delConfirmBtn.click();
	}
	
	
	public void clickdelCancelBtn(){
		delCancelBtn.click();
	}

}
