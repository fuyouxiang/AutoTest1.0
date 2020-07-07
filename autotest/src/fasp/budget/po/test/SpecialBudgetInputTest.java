package fasp.budget.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fasp.budget.po.SpecialBudgetInput;






/**
 * 
 *@ClassName:ZhiBiaoAddTest
 *@Description:专项指标录入测试类
 *@author:付有翔
 *@date:2017年5月15日
 *
 */
public class SpecialBudgetInputTest {
	
	public SpecialBudgetInput zhibiao;
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup(){
		zhibiao=new SpecialBudgetInput();
	}
	 
	//指标管理
	@Test
	public void GuanLiButton(){
		zhibiao.GuanLiButton();
	}
	//点击操作
	@Test
	public void ClikAddButton_Zhuanxiang() throws InterruptedException{
		zhibiao.Waittime10();
		//菜单栏拉伸，测试是否成功
		zhibiao.sidebarButton();
		//鼠标悬浮于指标管理
		zhibiao.GuanLiButton();
		//点击专项指标录入
		zhibiao.ClikAddButton();
		zhibiao.Waittime5();
	}
	
	//点击录入按钮
	@Test
	public void ClickAddButton(){
		zhibiao.Add_Button();
	}
	
	//新增模板
	@Parameters({"ModuleName","ModuleMoney"})
	@Test
	public void NewModule(String ModuleName,String ModuleMoney){
		zhibiao.Newmodule(ModuleName,ModuleMoney);
	}
	
	//选择模板添加指标
	@Parameters("ModuleName")
	@Test
	public void Choosemodule(String ModuleName){		
		zhibiao.Choosemodule(ModuleName);
	}
	
	 
	//送审第一条数据
	@Test
	public void ZhiBiaoSubmit_One(){
		zhibiao.ZhiBiaoSubmit_One();
	}
	
	//全选批量送审	
	@Test
	public void AllSubmit(){
		
		zhibiao.AllSubmit();

		

	}

	//复制指标
	public void CopyZhiBiao(){	
		//zhibiao.CopyZhiBiao();
	}
}
