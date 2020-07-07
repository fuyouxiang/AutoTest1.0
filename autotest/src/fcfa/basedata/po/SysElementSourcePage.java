package fcfa.basedata.po;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.po.BasePage;
import main.po.InitTest;
import main.util.GlobalContant;

//****************************待修改****************************
/**
 * 
 *@ClassName:SysElementSourcePage
 *@Description:基础数据管理-要素代码集定义编辑界面-代码表信息
 *@author:邓泽芳
 *@date:2017年3月23日
 *
 */
public class SysElementSourcePage extends BasePage {
	
	@FindBy(xpath="//input[@id='eleSource']/parent::div/em")
	private WebElement eleSource;
		
//	@FindBy(xpath="//div[@id='sysElementSearchGrid_content']/div[1]/div[2]/span/span")
//	@FindBy(css="div[id='sysElementSearchGrid_content']>div:nth-child(1)>div:nth-child(2)>span>span")
	@FindBy(css="div[id='sysElementSearchGrid_content']>div:nth-child(1)")
	private WebElement multiSelect;
	
	@FindBy(css="li[data-bind$='eleSourceComfirm']")
	private WebElement confirm_btn;
	
	
	
	
	
	@FindBy(xpath="//input[@id='code']/parent::div/em")
	private WebElement code;
	
	@FindBy(css=".card-btn2")
	private WebElement save_btn;
	
	int rowcount=1;
	
	public void save(String row,String eleCode) throws InterruptedException{
		eleSource.click();
		
		WebElement searchRow=multiSelect.findElement(By.cssSelector("div:nth-child("+row+")>span>span"));;
		searchRow.click();
		
		Actions ac=new Actions(InitTest.instance.driver);
//		ac.moveToElement(confirm_btn).perform();
		ac.moveToElement(confirm_btn).clickAndHold();
		ac.moveToElement(confirm_btn).contextClick();
		
		save_btn.click();
		
//		confirm_btn.click();
//		confirm_btn.click();
		
//		code.click();
//		searchRow.click();
	//	confirm_btn.click(); 
		
	//	save_btn.click();
		
		/*
		for(int i=1;i<search_rows.size();i++){
			if(search_rows.get(i+1).isSelected()){
				search_rows.get(i+1).click();
				break;
			}
		}*/
		

		Thread.sleep(500);
		
		WebDriverWait wait=new WebDriverWait(InitTest.instance.driver,GlobalContant.TIMEOUT);
		List<WebElement> rowsElement=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("tbody#sysElement_content_tbody>tr")));
		
		Iterator<WebElement> iterator=rowsElement.iterator();
		
		while(iterator.hasNext()){
			WebElement rowElement=(WebElement)iterator.next();
			String getTitle=rowElement.findElement(By.cssSelector("td:nth-child(1)")).getAttribute("title");
			
			if(getTitle.equals(eleCode)){	
				
				break;
			}
			rowcount++;
			
		}
		GlobalContant.selectRow=rowcount;
		System.out.println(rowcount);
	

	}
}
