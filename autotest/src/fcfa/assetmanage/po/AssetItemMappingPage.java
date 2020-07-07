package fcfa.assetmanage.po;

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
 *@ClassName:AssetItemMappingPage
 *@Description:资产管理-资产必填项页面
 *@author:邓泽芳
 *@date:2017年4月6日
 *
 */
public class AssetItemMappingPage extends BasePage {

	@FindBy(css="ul#assetItemMapping_assetType>li:nth-child(1)>a")
	private WebElement assetType;
	
	
	
	@FindBy(css=".card-btn1")
	private WebElement saveBtn;
	
	@FindBy(css="#assetItemMapping_dialggGrid_content_multiSelect>div:nth-child(1)>span")
	private WebElement multiSelect;
	
	int rowcount=1;
	
	public void selectType(){
		assetType.click();

	}
	
	public void addSave() throws InterruptedException{
			
		multiSelect.click();
		WebElement selectCodeElement=InitTest.instance.driver.findElement(By.cssSelector("tbody#assetItemMapping_dialggGrid_content_tbody>tr:nth-child(1)>td:nth-child(1)"));
		String selectCode=selectCodeElement.getAttribute("title");
		
		
		saveBtn.click();
		
		
		
		Thread.sleep(500);
		
		WebDriverWait wait=new WebDriverWait(InitTest.instance.driver,GlobalContant.TIMEOUT);
		List<WebElement> rowsElement=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("tbody#assetItemMapping_grid_content_tbody>tr")));
		
		Iterator<WebElement> iterator=rowsElement.iterator();
		
		while(iterator.hasNext()){
			WebElement rowElement=(WebElement)iterator.next();
			String getTitle=rowElement.findElement(By.cssSelector("td:nth-child(1)")).getAttribute("title");
			
			if(getTitle.equals(selectCode)){	
				
				break;
			}
			rowcount++;
			
		}
		GlobalContant.selectRow=rowcount;
	}
}
