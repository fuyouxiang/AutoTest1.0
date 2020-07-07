package fcfa.assetmanage.po;

import java.util.Iterator;
import java.util.List;

import main.po.BasePage;
import main.po.InitTest;
import main.util.GlobalContant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 *@ClassName:AssetSplitPage
 *@Description:资产管理-资产拆分页面
 *@author:邓泽芳
 *@date:2017年3月27日
 *
 */
public class AssetSplitPage extends BasePage {

	@FindBy(css="li[data-bind$='splitSelecet']")
	private WebElement splitBtn;
	
	@FindBy(css=".u-grid-checkbox-tick-outline")
	private List<WebElement> rows;
	
	
	@FindBy(id="assetSplit_AddCard")
	private WebElement addBtn;
	
	@FindBy(css=".assetSplit-detail.clearfix>input")
	private List<WebElement> numbers;
	
	@FindBy(css=".card-btn1")
	private WebElement saveBtn;
	
	public void save(String assetCode){ //,int num,long value
		int rowcount=1;
		List<WebElement> rowsElement=InitTest.instance.driver.findElements(By.cssSelector("tbody#assetSplit_grid_content_tbody>tr"));
		Iterator<WebElement> iterator=rowsElement.iterator();
		
		while(iterator.hasNext()){
			WebElement rowElement=(WebElement)iterator.next();
			String getTitle=rowElement.findElement(By.cssSelector("td:nth-child(1)")).getAttribute("title");
			
			if(getTitle.equals(assetCode)){	
				
				break;
			}
			rowcount++;
			
		}
		
		WebElement row=rows.get(rowcount);
		row.click();
		splitBtn.click();
		addBtn.click();
		addBtn.click();
		
		numbers.get(0).sendKeys("1"); 
		numbers.get(1).sendKeys("0"); 
		numbers.get(2).sendKeys("10");
		numbers.get(3).sendKeys("0");
//		numbers.get(2).sendKeys(String.valueOf(num-1)); 
//		numbers.get(3).sendKeys(String.valueOf(value-1)); 
		
		saveBtn.click();
		
		
	
	}
}