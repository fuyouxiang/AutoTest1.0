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
 *@ClassName:SpAppRolePage
 *@Description:系统管理-角色管理页面类
 *@author:邓泽芳
 *@date:2017年3月28日
 *
 */
public class SpAppRolePage extends BasePage {

	
	
	@FindBy(css="input[u-meta*='code']")
	private WebElement roleCode;
	
	@FindBy(css="input[u-meta*='name']")
	private WebElement roleName;
	
	@FindBy(css="textarea[u-meta*='description']")
	private WebElement roleDescription;
	
	@FindBy(css=".card-btn1")
	private WebElement saveBtn;
	
	int rowcount=1;
	
	public void save(String role_code,String role_name,String description) throws InterruptedException{
		roleCode.clear();
		roleCode.sendKeys(role_code);
		roleName.clear();
		roleName.sendKeys(role_name);
		roleDescription.clear();
		roleDescription.sendKeys(description);
		saveBtn.click();
		
		Thread.sleep(500);
		
		WebDriverWait wait=new WebDriverWait(InitTest.instance.driver,GlobalContant.TIMEOUT);
		List<WebElement> rowsElement=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("tbody#spAppRoleGrid_content_tbody>tr")));
		
		Iterator<WebElement> iterator=rowsElement.iterator();
		
		while(iterator.hasNext()){
			WebElement rowElement=(WebElement)iterator.next();
			String getTitle=rowElement.findElement(By.cssSelector("td:nth-child(1)")).getAttribute("title");
			
			if(getTitle.equals(role_code)){	
				
				break;
			}
			rowcount++;
			
		}
		GlobalContant.selectRow=rowcount;
		
	}
}
