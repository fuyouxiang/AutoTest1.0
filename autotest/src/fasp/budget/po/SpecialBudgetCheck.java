package fasp.budget.po;

import main.po.BasePage;






import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * 
 *@ClassName:ZhiBiaoReview
 *@Description:专项指标审核描述类
 *@author:付有翔
 *@date:2017年5月16日
 *
 */
public class SpecialBudgetCheck  extends BasePage {
	
	public SpecialBudgetCheck(){
		super();
	}
	
	//指标管理的模块
	@FindBy(className="pull-right-container")
	//@FindBy(xpath=".//*[@id='_sidebar_menu']/li[2]/a")
	private WebElement ZhiBiaoGuanLi;
	
	//专项指标审核
	//className="add_recent_work_menu"
	@FindBy(xpath=".//*[@id='_sidebar_menu']/li[2]/div/dl[2]/dd/a[2]")
	private WebElement Submit_ZhuanXiang_Button;
	
	//第一个审核按钮
	@FindBy(xpath="html/body/div[1]/div/div[1]/div[2]/div[2]/div[1]/div/div/div[3]/div[4]/table/tbody/tr[1]/td/div/div/a[1]")
	private WebElement ZhiBiaoShenHe;
	
	//全部勾选框
	@FindBy(xpath=".//*[@id='BA0A1722-0126-11DB-854B-D9CC4D3498D1_header_multi_input']/span")
	private WebElement AllCheckBox;
	
	//批量审核
	@FindBy(xpath=".//*[@id='btn-bataudit']")
	private WebElement MoreReview;
	
	//左上角收起和拉开按钮
	@FindBy(id="sidebar-btn")
	private WebElement sidebar_Button;
		
	//审核意见框
	@FindBy(xpath=".//*[@id='TextArea']")
	private WebElement TextArea;
	
	//审核确定按钮
	@FindBy(xpath=".//*[@id='checkIndexjump']/div/div/div[3]/button[1]")
	private WebElement ReviewSave_Button;
	
	

	/**
	 * 
	 *@Method:
	 *@Description:收起拉开
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void sidebarButton(){
		sidebar_Button.click();
		sidebar_Button.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void GuanLiButton(){
		//调用Actions中的鼠标指针停留方法
		Actions action = new Actions(driver); 
		action.moveToElement(ZhiBiaoGuanLi).perform();
	}
	/**
	 * 
	 *@Method:ClikSubmitButton
	 *@Description:首页点击专项指标审核按钮
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void ClikSubmitButton(){		
		Submit_ZhuanXiang_Button.click();
	}
	/**
	 * 
	 *@Method:ZhiBiaoShenHe_One
	 *@Description:点击第一条数据的审核
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void ZhiBiaoShenHe_One(String suggestion){
		//定位到iframe界面，参数值可以是id或name
		//driver.switchTo().frame("menuFrame");	
		WebElement iframe=driver.findElement(By.xpath(".//*[@id='iframe_box']/div[3]/iframe"));
		driver.switchTo().frame(iframe);
		
		ZhiBiaoShenHe.click();
		MoreReview.click();
		TextArea.clear();
		TextArea.sendKeys(suggestion);
		ReviewSave_Button.click();
	}

	
	/**
	 * 
	 *@Method:MoreReview
	 *@Description:全部批量送审
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void MoreReview(String suggestion){
		//定位到iframe界面，参数值可以是id或name
		//driver.switchTo().frame("menuFrame");	
		//WebElement iframe=driver.findElement(By.xpath(".//*[@id='iframe_box']/div[3]/iframe"));
		//driver.switchTo().frame(iframe);
		
		AllCheckBox.click();
		MoreReview.click();
		TextArea.clear();
		TextArea.sendKeys(suggestion);
		ReviewSave_Button.click();
	}
	
}
