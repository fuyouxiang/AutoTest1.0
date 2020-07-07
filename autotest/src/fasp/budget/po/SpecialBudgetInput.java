package fasp.budget.po;

import main.po.BasePage;






import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 *@ClassName:ZhiBiaoAdd
 *@Description:专项指标录入描述类
 *@author:付有翔
 *@date:2017年5月16日
 *
 */
public class SpecialBudgetInput  extends BasePage {
	
	public SpecialBudgetInput(){
		super();
	}
	
	//指标管理的模块
	@FindBy(className="pull-right-container")
	//@FindBy(xpath=".//*[@id='_sidebar_menu']/li[2]/a")
	private WebElement ZhiBiaoGuanLi;
	
	//左上角收起和拉开按钮
	@FindBy(id="sidebar-btn")
	private WebElement sidebar_Button;
	
	//指标管理的模块-专项指标录入
	//className="add_recent_work_menu"
	@FindBy(linkText="专项指标录入")
	private WebElement Add_ZhuanXiang_Button;
	
	//专项指标录入_录入按钮
	@FindBy(id="btn-add")
	private WebElement add_Button;
	
	//专项指标录入_新增模板按钮
	@FindBy(id="newmodule")
	private WebElement New_module_button;
	
	//专项指标录入_新增模板_模板名称
	@FindBy(id="specialBudgetModuleEdit")
	private WebElement ModuleNameText;
	
	//专项指标录入_新增模板_预算单位
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[1]/div/span/button")
	private WebElement DanWeiNameText;
	//专项指标录入_新增模板_预算单位_一级
	@FindBy(xpath=".//*[@id='child-data-tree_1_switch']")
	private WebElement DanWeiNameText2;		
	//专项指标录入_新增模板_预算单位_二级
	@FindBy(xpath=".//*[@id='child-data-tree_2_check']")
	private WebElement DanWeiNameText3;	
	
	
	//专项指标录入_新增模板_预算项目
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[2]/div/span/button")
	private WebElement YuSuanXiangMu;
	//专项指标录入_新增模板_预算项目
	@FindBy(xpath=".//*[@id='radio-data-tree_1_span']")
	private WebElement YuSuanXiangMu2;
	
	
	//专项指标录入_新增模板_项目分类
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[3]/div/span/button")
	private WebElement XiangMuFenLei;
	//专项指标录入_新增模板_项目分类
	@FindBy(xpath=".//*[@id='radio-data-tree_2_span']")
	private WebElement XiangMuFenLei2;
	
	
	
	//专项指标录入_新增模板_功能分类
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[4]/div/span/button")
	private WebElement GongNengFenLei;
	//专项指标录入_新增模板_功能分类
	@FindBy(xpath=".//*[@id='radio-data-tree_1_switch']")
	private WebElement GongNengFenLei2;
	//专项指标录入_新增模板_功能分类
	@FindBy(xpath=".//*[@id='radio-data-tree_2_switch']")
	private WebElement GongNengFenLei3;
	//专项指标录入_新增模板_功能分类
	@FindBy(xpath=".//*[@id='radio-data-tree_3_span']")
	private WebElement GongNengFenLei4;
	
	
	//专项指标录入_新增模板_业务处室
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[5]/div/span/button")
	private WebElement YeWuChuShi;
	//专项指标录入_新增模板_业务处室
	@FindBy(xpath=".//*[@id='radio-data-tree_1_span']")
	private WebElement YeWuChuShi2;
	
	
	//专项指标录入_新增模板_金额
	@FindBy(id="specialBudgetNewMoney")
	private WebElement JinE;
	
	
	//专项指标录入_新增模板_指标来源
	//@FindBy(id="BGTSOURCE-modulepage-new")
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[7]/div/span/button")
	private WebElement ZhiBiaoLaiYuan;
	//专项指标录入_新增模板_指标来源_选项
	@FindBy(xpath=".//*[@id='radio-data-tree_2_span']")
	private WebElement ZhiBiaoLaiYuan2;
	
	
	//专项指标录入_新增模板_指标流向		
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[8]/div/span/button")
	private WebElement ZhiBiaoLiuXiang;
	//专项指标录入_新增模板_指标流向_选项	
	@FindBy(xpath=".//*[@id='radio-data-tree_1_span']")
	private WebElement ZhiBiaoLiuXiang2;
	
	
	//专项指标录入_新增模板_支付方式
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[9]/div/span/button")
	private WebElement ZhiFuFangShi;
	//专项指标录入_新增模板_支付方式_选项
	@FindBy(xpath=".//*[@id='radio-data-tree_1_span']")
	private WebElement ZhiFuFangShi2;	
	
	
	//专项指标录入_新增模板_预算类型
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[10]/div/span/button")
	private WebElement YuSuanLeiXing;
	//专项指标录入_新增模板_预算类型_选项
	@FindBy(xpath=".//*[@id='radio-data-tree_2_span']")
	private WebElement YuSuanLeiXing2;	
	
		
	//专项指标录入_新增模板_经济分类
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[11]/div/span/button")
	private WebElement JinJiFenLei;
	//专项指标录入_新增模板_经济分类——顶级
	@FindBy(xpath=".//*[@id='radio-data-tree_1_switch']")
	private WebElement JinJiFenLei2;
	//专项指标录入_新增模板_经济分类——底级
	@FindBy(xpath=".//*[@id='radio-data-tree_2_span']")
	private WebElement JinJiFenLei3;
		
	
	//专项指标录入_新增模板_资金性质
	@FindBy(xpath=".//*[@id='modulepage-new']/div[3]/div[12]/div/span/button")
	private WebElement ZiJinXingZhi;
	//专项指标录入_新增模板_资金性质
	@FindBy(xpath=".//*[@id='radio-data-tree_2_span']")
	private WebElement ZiJinXingZhi2;
	
	
	//专项指标录入_新增模板_字段选择_保存
	@FindBy(xpath=".//*[@id='sur-child-data-tree']")
	private WebElement ModulXuanXiangSave;
	
	//专项指标录入_新增模板_字段选择_保存
	@FindBy(name="btnSure")
	private WebElement ModulXuanXiangSave2;
	
	
	//专项指标录入_新增模板_保存
	@FindBy(xpath=".//*[@id='modulepage-new']/div[4]/button[1]")
	private WebElement ModuleSave;
	
	//专项指标录入_选择模板
	@FindBy(id="speBudgetModules")
	private WebElement ChooseModule;
	
	
	//专项指标录入_模板补充_指标文号
	@FindBy(xpath=".//*[@id='specialBudgetEdit']/div[1]/div/span/button")
	private WebElement ZhiBiaoWenHao;
	//专项指标录入_模板补充_指标文号
	@FindBy(xpath=".//*[@id='radio-data-tree_4_span']")
	private WebElement ZhiBiaoWenHao2;	
	
	
	//专项指标录入_模板补充_数据保存
	@FindBy(id="sur-radio-data-tree")
	private WebElement ChooseModuleSave;
	
	
	//专项指标录入_模板补充_发文时间
	@FindBy(xpath=".//*[@id='specialBudgetEdit']/div[2]/div/span[2]")
	private WebElement FaWenShiJian;
	//专项指标录入_模板补充_发文时间
	@FindBy(xpath="html/body/div[4]/div[3]/table/tbody/tr[3]/td[3]")
	private WebElement FaWenShiJian2;
	
	
	//专项指标录入_模板补充_摘要
	@FindBy(id="simpcontent")
	private WebElement ZhaiYao;
	
	
	//专项指标录入_模板补充_加号
	@FindBy(xpath=".//*[@id='specialBudModal']/div/div/div[2]/div[2]/div[3]/div[2]/div/a[1]")
	private WebElement JiaHao;
	
	//专项指标录入_指标保存
	@FindBy(xpath=".//*[@id='specialBudModal']/div/div/div[3]/button[2]")
	private WebElement ZhiBiaoSave;
	
	
	  
	//专项指标录入_勾选第一条数据
	@FindBy(xpath="id('checkbox31')/x:span")
	private WebElement checkbox1;
	
	
	//第一行的送审按钮
	//此按钮必须用绝对路径，因为四个按钮的xpath相对路径一模一样
	@FindBy(xpath="html/body/div[1]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div[4]/table/tbody/tr[1]/td/div/div/a[1]")
	private WebElement ZhiBiaoSubmit;
	
	
	//全选框
	@FindBy(xpath=".//*[@id='BA0A1722-0126-11DB-854B-D9CC4D3498D1_header_multi_input']/span")
	private WebElement AllCheckBox;
	
	//批量送审
	@FindBy(xpath=".//*[@id='btn-send']")
	private WebElement MoreSubmit;
	
	
	
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
	 *@Method:
	 *@Description:点击专项指标录入
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void ClikAddButton(){
		
		Add_ZhuanXiang_Button.click();
	}
	/**
	 * 
	 *@Method:
	 *@Description:等待10s
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void Waittime10() throws InterruptedException{		
        Thread.sleep(1500); 
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:等待5s
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void Waittime5() throws InterruptedException{		
        Thread.sleep(1000); 
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:点击新增按钮
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void Add_Button(){
		
		//定位到iframe界面，参数值可以是id或name，因为中间页面是用iframe嵌入的
		//driver.switchTo().frame("menuFrame");
		WebElement iframe=driver.findElement(By.xpath(".//*[@id='iframe_box']/div[2]/iframe"));
		driver.switchTo().frame(iframe);
		
		add_Button.click();
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:新增模板方法
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void Newmodule(String ModuleName,String ModuleMoney){
		//新增模板
		New_module_button.click();
		ModuleNameText.sendKeys(ModuleName);
		
		//预算单位
		DanWeiNameText.click();
		DanWeiNameText2.click();
		DanWeiNameText3.click();
		ModulXuanXiangSave.click();
		
		//预算项目
		YuSuanXiangMu.click();
		YuSuanXiangMu2.click();
		ModulXuanXiangSave2.click();
		
		//项目分类
		XiangMuFenLei.click();
		XiangMuFenLei2.click();
		ModulXuanXiangSave2.click();
		
		//功能分类
		GongNengFenLei.click();
		GongNengFenLei2.click();
		GongNengFenLei3.click();
		GongNengFenLei4.click();
		ModulXuanXiangSave2.click();
		
		//业务处室
		YeWuChuShi.click();
		YeWuChuShi2.click();
		ModulXuanXiangSave2.click();
		
		//金额
		JinE.sendKeys(ModuleMoney);
		
		//指标来源
		ZhiBiaoLaiYuan.click();
		ZhiBiaoLaiYuan2.click();
		ModulXuanXiangSave2.click();
		
		//指标流向
		ZhiBiaoLiuXiang.click();
		ZhiBiaoLiuXiang2.click();
		ModulXuanXiangSave2.click();
		
		//支付方式
		ZhiFuFangShi.click();
		ZhiFuFangShi2.click();
		ModulXuanXiangSave2.click();
		
		//预算类型
		YuSuanLeiXing.click();
		YuSuanLeiXing2.click();
		ModulXuanXiangSave2.click();
		
		//经济分类
		JinJiFenLei.click();
		JinJiFenLei2.click();
		JinJiFenLei3.click();
		ModulXuanXiangSave2.click();
		
		//资金性质
		ZiJinXingZhi.click();
		ZiJinXingZhi2.click();
		ModulXuanXiangSave2.click();

		//保存模板
		ModuleSave.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:选择模板
	 *@author:付有翔
	 *@date:2017年5月16日
	 *
	 */	
	public void Choosemodule(String ModuleName){	
		
		//实例化Select
		Select sel = new Select(ChooseModule);
		//选择第二项选项：index从 0 开始
		sel.selectByVisibleText(ModuleName);
		
		//指标文号
		ZhiBiaoWenHao.click();
		ZhiBiaoWenHao2.click();
		ChooseModuleSave.click();
		
		//发文时间
		FaWenShiJian.click();
		FaWenShiJian2.click();
		
		//摘要
		ZhaiYao.sendKeys("测试摘要");
		
		//添加按钮
		JiaHao.click();
		JiaHao.click();
		JiaHao.click();
		
		//保存按钮
		ZhiBiaoSave.click();
	}
	

	/**
	 * 
	 *@Description:复制一条数据
	 */
	public void CopyZhiBiao(){
		//driver.switchTo().frame("menuFrame");	
		checkbox1.click();
	}
	
	/**
	 * 
	 *@Description:送审第一条数据
	 *@author:付有翔
	 *@date:2017年5月16日
	 */
	public void ZhiBiaoSubmit_One(){
		ZhiBiaoSubmit.click();
	}
	
	/**
	 * 
	 *@Description:全选批量送审
	 *@author:付有翔
	 *@date:2017年5月16日
	 */
	public void AllSubmit(){
		AllCheckBox.click();
		MoreSubmit.click();
		
		///跳出frame,进入default content;
		driver.switchTo().defaultContent();		
	}
	
}
