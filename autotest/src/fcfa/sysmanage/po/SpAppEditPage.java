package fcfa.sysmanage.po;

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
 *@ClassName:SpAppEditPage
 *@Description:系统管理-业务模块管理编辑页面
 *@author:邓泽芳
 *@date:2017年2月24日
 *
 */
public class SpAppEditPage extends BasePage{
	public SpAppEditPage(){
		super();
	}

	@FindBy(xpath="//input[@placeholder='请输入模块编码']")
	private WebElement spAppAdd_Code;
	
	@FindBy(xpath="//input[@placeholder='请输入版本号']")
	private WebElement spAppAdd_Version;
	
	@FindBy(xpath="//input[@placeholder='请输入模块名称']")
	private WebElement spAppAdd_Name;
		
	@FindBy(xpath="//input[@placeholder='请输入开发商名称']")
	private WebElement spAppAdd_Developer;
	
	@FindBy(xpath="//input[@placeholder='请选择注册日期']")
	private WebElement spAppAdd_inputdate;
	
	@FindBy(xpath="//div[@class='u-date-cell current']")
	private WebElement date_current;
	
	@FindBy(xpath="//button[@class='card-btn2']")
	private WebElement save_Btn;
	
	int rowcount=1;
	
	/**
	 * 
	 *@Method:spAppAdd_Save
	 *@Description:业务模块管理编辑界面，输入业务模块基本信息，点击保存按钮
	 *@param spApp_code
	 *@param spApp_version
	 *@param spApp_name
	 *@param spApp_developer
	 * @throws InterruptedException 
	 *
	 */
	public void spAppAdd_Save(String spApp_code,String spApp_version,String spApp_name,String spApp_developer) throws InterruptedException{
		spAppAdd_Code.clear();
		spAppAdd_Code.sendKeys(spApp_code);
		spAppAdd_Version.clear();
		spAppAdd_Version.sendKeys(spApp_version);
		spAppAdd_Name.clear();
		spAppAdd_Name.sendKeys(spApp_name);
		spAppAdd_Developer.clear();
		spAppAdd_Developer.sendKeys(spApp_developer);
		spAppAdd_inputdate.click();
		date_current.click();
		save_Btn.click();
		
		Thread.sleep(500);
		
		WebDriverWait wait=new WebDriverWait(InitTest.instance.driver,GlobalContant.TIMEOUT);
		List<WebElement> rowsElement=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("tbody#apAppGrid_content_tbody>tr")));
		
		Iterator<WebElement> iterator=rowsElement.iterator();
		
		while(iterator.hasNext()){
			WebElement rowElement=(WebElement)iterator.next();
			String getTitle=rowElement.findElement(By.cssSelector("td:nth-child(1)")).getAttribute("title");
			
			if(getTitle.equals(spApp_code)){	
				
				break;
			}
			rowcount++;
			
		}
		GlobalContant.selectRow=rowcount;
		
	}
}
