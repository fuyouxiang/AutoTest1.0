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
 *@ClassName:CardItemEditPage
 *@Description:资产管理-信息项管理编辑页面（新增和修改界面）
 *@author:邓泽芳
 *@date:2017年2月23日
 *
 */
public class CardItemEditPage extends BasePage{

	public CardItemEditPage(){
		super();
	}

	@FindBy(xpath="//input[@class='u-input']")
	private WebElement cardItemAdd_Code;
	
	@FindBy(xpath="//dt[contains(text(),'信息项名称')]/ancestor::dl/dd/input")
	private WebElement cardItemAdd_Name;
	
	
	@FindBy(xpath="//dt[contains(text(),'最大长度')]/ancestor::dl/dd/input")
	private WebElement cardItemAdd_Maxlen;
	
	@FindBy(id="cardItemDlg_saveButton")
	private WebElement cardItemAdd_Savebt;
	
	int rowcount=1;
	/**
	 * 
	 *@Method:cardItemAdd_Save
	 *@Description:信息项管理编辑界面，输入信息项基本信息，点击保存按钮
	 *@param code
	 *@param name
	 *@param maxlen
	 * @throws InterruptedException 
	 *
	 */
	public void cardItemAdd_Save(String code,String name,String maxlen) throws InterruptedException{
		cardItemAdd_Code.clear();
		cardItemAdd_Code.sendKeys(code);
		cardItemAdd_Name.clear();
		cardItemAdd_Name.sendKeys(name);
		cardItemAdd_Maxlen.clear();
		cardItemAdd_Maxlen.sendKeys(maxlen);
		cardItemAdd_Savebt.click();
		
		Thread.sleep(500);
		
		WebDriverWait wait=new WebDriverWait(InitTest.instance.driver,GlobalContant.TIMEOUT);
		List<WebElement> rowsElement=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("tbody#cardItem_grid_content_tbody>tr")));
		
//		List<WebElement> rowsElement=InitTest.instance.driver.findElements(By.cssSelector("tbody#sysUserGrid_content_tbody>tr"));
		
		Iterator<WebElement> iterator=rowsElement.iterator();
		
		while(iterator.hasNext()){
			WebElement rowElement=(WebElement)iterator.next();
			String getTitle=rowElement.findElement(By.cssSelector("td:nth-child(1)")).getAttribute("title");
			if(getTitle.equals(code)){	
				break;
			}
			rowcount++; 	
		}
		GlobalContant.selectRow=rowcount;
	}
	
	
}
