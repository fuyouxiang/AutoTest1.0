package fcfa.sysmanage.po;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.po.BasePage;
import main.po.InitTest;
import main.util.GlobalContant;

/**
 * 
 *@ClassName:SysUserEditPage
 *@Description:系统管理-用户管理
 *@author:邓泽芳
 *@date:2017年4月1日
 *
 */
public class SysUserEditPage extends BasePage {

	@FindBy(css="input[u-meta*='code']")
	private WebElement usercodeElement;
	
	@FindBy(css="input[u-meta*='name']")
	private WebElement usernameElement;
	
	@FindBy(css="input[placeholder='请输入用户的密码']")
	private WebElement passwordElement;
	
	@FindBy(css="input[u-meta*='confirmpasswd']")
	private WebElement confirmPwdElement;
	
	@FindBy(css="input[u-meta*='mob']")
	private WebElement mobileElement;
	
	@FindBy(css="input[u-meta*='remark']")
	private WebElement remarkElement;
	
	@FindBy(css=".card-btn2")
	private WebElement save_btn;
	
	int rowcount=1;
	
	public void save(String usercode,String username,String password,String confirmPwd,String mobile,String remark) throws InterruptedException{
		usercodeElement.clear();
		usercodeElement.sendKeys(usercode);
		usernameElement.clear();
		usernameElement.sendKeys(username);
		passwordElement.clear();
		passwordElement.sendKeys(password);
		confirmPwdElement.clear();
		confirmPwdElement.sendKeys(confirmPwd);
		mobileElement.clear();
		mobileElement.sendKeys(mobile);
		remarkElement.clear();
		remarkElement.sendKeys(remark);
		save_btn.click();
	
		Thread.sleep(500);
		
		WebDriverWait wait=new WebDriverWait(InitTest.instance.driver,GlobalContant.TIMEOUT);
		List<WebElement> rowsElement=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("tbody#sysUserGrid_content_tbody>tr")));
		
//		List<WebElement> rowsElement=InitTest.instance.driver.findElements(By.cssSelector("tbody#sysUserGrid_content_tbody>tr"));
		
		Iterator<WebElement> iterator=rowsElement.iterator();
		
		while(iterator.hasNext()){
			WebElement rowElement=(WebElement)iterator.next();
			String getTitle=rowElement.findElement(By.cssSelector("td:nth-child(2)")).getAttribute("title");
			
			if(getTitle.equals(usercode)){	
				
				break;
			}
			rowcount++;
			
		}
		GlobalContant.selectRow=rowcount;
	}

}
