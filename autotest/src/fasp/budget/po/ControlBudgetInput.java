package fasp.budget.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.po.BasePage;


/**
 * 
 *@ClassName:ZhiBiaoAdd
 *@Description:年初控制数录入描述类
 *@author:付有翔
 *@date:2017年5月18日
 *
 */
public class ControlBudgetInput  extends BasePage {
	
	public ControlBudgetInput(){
		super();
	}
	
	//指标管理的模块
	@FindBy(className="pull-right-container")
	//@FindBy(xpath=".//*[@id='_sidebar_menu']/li[2]/a")
	private WebElement ZhiBiaoGuanLi;
	
	//左上角收起和拉开按钮
	@FindBy(id="sidebar-btn")
	private WebElement sidebar_Button;
	
	//指标管理的模块-年初控制数录入
	//className="add_recent_work_menu"
	@FindBy(linkText="年初控制数录入")
	private WebElement Add_Control_Button;
	
	
	//指标管理的模块-年初控制数录入-年初数录入
	@FindBy(id="btn-add")
	private WebElement ControlBudgetInputButton;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板
	@FindBy(xpath="html/body/div[2]/div/div/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/button[2]")
	private WebElement newmodule;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-模板名称
	@FindBy(id="controlNewModuleName")
	private WebElement controlNewModuleName;
	
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-预算单位
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[1]/div/span[2]/button")
	private WebElement YuSuanDanWei;
	@FindBy(css="#noChi-data-tree_1_switch")
	private WebElement YuSuanDanWei2;
	@FindBy(css="#noChi-data-tree_2_check")
	private WebElement YuSuanDanWei3;
	
	
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-预算项目
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[2]/div/span[2]/button")
	private WebElement YuSuanXiangMu;
	@FindBy(id="radio-data-tree_1_span")
	private WebElement YuSuanXiangMu2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-项目分类
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[3]/div/span[2]/button")
	private WebElement XiangMuFenLei;
	@FindBy(id="radio-data-tree_1_span")
	private WebElement XiangMuFenLei2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-功能分类
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[4]/div/span[2]/button")
	private WebElement GongNengFenLei;
	@FindBy(id="radio-data-tree_1_switch")
	private WebElement GongNengFenLei2;
	@FindBy(id="radio-data-tree_2_switch")
	private WebElement GongNengFenLei3;
	@FindBy(id="radio-data-tree_3_span")
	private WebElement GongNengFenLei4;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-业务处室
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[5]/div/span[2]/button")
	private WebElement YeWuChuShi;
	@FindBy(id="radio-data-tree_1_span")
	private WebElement YeWuChuShi2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-金额
	@FindBy(id="aboutMoneyNew")
	private WebElement aboutMoneyNew;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-指标来源
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[7]/div/span[2]/button")
	private WebElement ZhiBiaoLaiYuan;
	@FindBy(id="radio-data-tree_2_span")
	private WebElement ZhiBiaoLaiYuan2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-指标流向
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[8]/div/span[2]/button")
	private WebElement ZhiBiaoLiuXiang;
	@FindBy(id="radio-data-tree_1_span")
	private WebElement ZhiBiaoLiuXiang2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-支付方式
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[9]/div/span[2]/button")
	private WebElement ZhiFuFangShi;
	@FindBy(id="radio-data-tree_1_span")
	private WebElement ZhiFuFangShi2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-预算类型
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[10]/div/span[2]/button")
	private WebElement YuSuanLeiXing;
	@FindBy(id="radio-data-tree_2_span")
	private WebElement YuSuanLeiXing2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-经济分类
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[11]/div/span[2]/button")
	private WebElement JingJiFenLei;
	@FindBy(id="radio-data-tree_1_switch")
	private WebElement JingJiFenLei2;
	@FindBy(id="radio-data-tree_2_span")
	private WebElement JingJiFenLei3;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-资金性质
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[12]/div/span[2]/button")
	private WebElement ZiJinXingZhi;
	@FindBy(id="radio-data-tree_1_span")
	private WebElement ZiJinXingZhi2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-工资标识
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[13]/div/span[2]/button")
	private WebElement GongZiBiaoShi;
	@FindBy(id="radio-data-tree_1_span")
	private WebElement GongZiBiaoShi2;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-政府采购
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[14]/div/span[2]/button")
	private WebElement ZhengFuCaiGou;
	@FindBy(id="radio-data-tree_1_span")
	private WebElement ZhengFuCaiGou2;
	
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-各字段保存
	//@FindBy(id="sur-child-data-tree")
	//@FindBy(xpath=".//*[@id='sur-radio-data-tree']")
	@FindBy(name="btnSure")
	private WebElement DataChooseSave;
	
	//指标管理的模块-年初控制数录入-年初数录入-新增模板-保存模板
	@FindBy(xpath=".//*[@id='modulepage-new']/div[4]/button[1]")
	private WebElement NewModuleSave;
	
	//指标管理的模块-年初控制数录入-年初数录入-选择模板
	@FindBy(id="ctrlTypeinSel")
	private WebElement ChooseModule;
	
	//指标管理的模块-年初控制数录入-年初数录入-选择模板-指标文号
	@FindBy(xpath=".//*[@id='inputinfo']/div[1]/div/span[2]/button")
	private WebElement ZhiBiaoWenHao;
	//专项指标录入_模板补充_指标文号
	@FindBy(xpath=".//*[@id='radio-data-tree_5_span']")
	private WebElement ZhiBiaoWenHao2;	
	//专项指标录入_模板补充_数据保存
	@FindBy(id="sur-radio-data-tree")
	private WebElement ChooseModuleSave;
	
	
	//指标管理的模块-年初控制数录入-年初数录入-选择模板-发文时间
	@FindBy(xpath=".//*[@id='inputinfo']/div[2]/div/span[2]")
	private WebElement FaWenShiJian;
	//指标管理的模块-年初控制数录入-年初数录入-选择模板-发文时间
	@FindBy(xpath="html/body/div[6]/div[3]/table/tbody/tr[3]/td[3]")
	private WebElement FaWenShiJian2;
	
	
	//指标管理的模块-年初控制数录入-年初数录入-选择模板-摘要
	@FindBy(id="simpcontent")
	private WebElement ZhaiYao;
	
	
	//指标管理的模块-年初控制数录入-年初数录入-选择模板-加号
	@FindBy(xpath=".//*[@id='controlMyModal']/div/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/a")
	//@FindBy(className="iconmenu icon-input")
	private WebElement JiaHao;
	
	
	//指标管理的模块-年初控制数录入-年初数录入-选择模板-保存
	@FindBy(xpath=".//*[@id='controlMyModal']/div/div/div[3]/button[3]")
	//@FindBy(className="btn btn-primary")
	private WebElement ZhiBiaoSave;

	
	//主界面——批量送审按钮
	@FindBy(id="btn-send")
	private WebElement MoreZhiBiaoSongShen;
	
	
	//主界面——全选框
	@FindBy(xpath=".//*[@id='7E2B492A-093B-11DE-B123-9630330D75F9_header_multi_input']/span")
	private WebElement AllZhiBiao;
	
	//主界面——第一条数据送审按钮
	@FindBy(xpath="html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div[1]/div[1]/span/span")		   
	private WebElement ZhiBiaoSongShen_1;
	
	//定位
	@FindBy(xpath=".//*[@id='controlMyModal']/div/div/div[1]")
	private WebElement dingwei;
	
	//定位
	@FindBy(xpath=".//*[@id='myModalLabel']")
	private WebElement dingwei2;
	
	
	/**
	 * 
	 *@Method:
	 *@Description:定位
	 *@author:付有翔
	 *@date:2017年8月1日
	 *
	 */	
	public void dingwei(){
		dingwei.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:等待3s
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void Waittime10() throws InterruptedException{		
        Thread.sleep(1000); 
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:等待2s
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void Waittime2() throws InterruptedException{		
        Thread.sleep(200); 
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:收起拉开
	 *@author:付有翔
	 *@date:2017年5月18日
	 *
	 */	
	public void sidebarButton(){
		//sidebar_Button.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//隐式等待：总共等待5秒， 如果5秒后，元素还不存在，就会抛出异常  org.openqa.selenium.NoSuchElementException		 
		sidebar_Button.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理
	 *@author:付有翔
	 *@date:2017年5月18日
	 *
	 */	
	public void GuanLiButton(){
		//调用Actions中的鼠标指针停留方法
		Actions action = new Actions(driver); 
		action.moveToElement(ZhiBiaoGuanLi).perform();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:点击年初控制数录入菜单
	 *@author:付有翔
	 *@date:2017年5月18日
	 *
	 */	
	public void ClikAddButton(){
		Add_Control_Button.click();
		sidebar_Button.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:年初控制数录入-点击年初数录入
	 *@author:付有翔
	 *@date:2017年5月18日
	 *
	 */	
	public void ControlBudgetInputButton(){
		ControlBudgetInputButton.click();
	}
	

	/**
	 * 
	 *@Method:
	 *@Description:定位到iframe界面，参数值可以是id或name，因为中间页面是用iframe嵌入的
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void menuFrame(){
		WebElement iframe=driver.findElement(By.xpath(".//*[@id='iframe_box']/div[2]/iframe"));
		driver.switchTo().frame(iframe);
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-年初数录入-新增模板
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void newmodule(){
		newmodule.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-年初数录入-新增模板-数据选择
	 *@author:付有翔
	 * @throws InterruptedException 
	 *@date:2017年5月19日
	 *
	 */	
	public void NewModuleData(String ModuleName,String ModuleMoney){
		
		controlNewModuleName.sendKeys(ModuleName);
		

		
		YuSuanXiangMu.click();
		YuSuanXiangMu2.click();
		DataChooseSave.click();
		
		XiangMuFenLei.click();
		XiangMuFenLei2.click();
		DataChooseSave.click();		
		
		GongNengFenLei.click();
		GongNengFenLei2.click();
		GongNengFenLei3.click();
		GongNengFenLei4.click();
		DataChooseSave.click();
		
		YeWuChuShi.click();
		YeWuChuShi2.click();
		DataChooseSave.click();
		
		aboutMoneyNew.sendKeys(ModuleMoney);
		
		ZhiBiaoLaiYuan.click();
		ZhiBiaoLaiYuan2.click();
		DataChooseSave.click();	
		
		ZhiBiaoLiuXiang.click();
		ZhiBiaoLiuXiang2.click();
		DataChooseSave.click();	
		
		ZhiFuFangShi.click();
		ZhiFuFangShi2.click();
		DataChooseSave.click();	
		
		YuSuanLeiXing.click();
		YuSuanLeiXing2.click();
		DataChooseSave.click();	
		
		JingJiFenLei.click();
		JingJiFenLei2.click();
		JingJiFenLei3.click();
		DataChooseSave.click();	
		
		ZiJinXingZhi.click();
		ZiJinXingZhi2.click();
		DataChooseSave.click();	
		
		GongZiBiaoShi.click();
		GongZiBiaoShi2.click();
		DataChooseSave.click();	
		
		ZhengFuCaiGou.click();
		ZhengFuCaiGou2.click();
		DataChooseSave.click();
		
		YuSuanDanWei.click();
		YuSuanDanWei2.click();
		YuSuanDanWei3.click();
		DataChooseSave.click();
		
		NewModuleSave.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-年初数录入-选择模板
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void ChooseModule(String ModuleName){
		//实例化Select
		Select sel = new Select(ChooseModule);
		//选择第二项选项：index从 0 开始
		sel.selectByVisibleText(ModuleName);
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-年初数录入-选择模板-数据补充
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void ChooseModule_Data(){
		ZhiBiaoWenHao.click();
		ZhiBiaoWenHao2.click();
		ChooseModuleSave.click();
		
		//FaWenShiJian.click();
		//FaWenShiJian2.click();
		
		ZhaiYao.sendKeys("摘要");;
		
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-年初数录入-添加操作（加号）
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void AddControlBudgetData(){
		
		JiaHao.click();
		
		
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-年初数录入-保存操作
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void ControlBudgetDataSave(){
		
		ZhiBiaoSave.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-送审第一条数据
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void ZhiBiaoSongShen_1(){
		
		ZhiBiaoSongShen_1.click();
		MoreZhiBiaoSongShen.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-全部勾选
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void AllZhiBiao(){
		
		AllZhiBiao.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:指标管理的模块-年初控制数录入-批量送审操作
	 *@author:付有翔
	 *@date:2017年5月19日
	 *
	 */	
	public void MoreZhiBiaoSongShen(){
		
		MoreZhiBiaoSongShen.click();
	}
	
}
