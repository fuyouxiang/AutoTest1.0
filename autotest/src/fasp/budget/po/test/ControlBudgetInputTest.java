package fasp.budget.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fasp.budget.po.ControlBudgetInput;

/**
 * 
 *@ClassName:ZhiBiaoAddTest
 *@Description:指标添加类
 *@author:付有翔
 *@date:2017年5月15日
 *
 */
public class ControlBudgetInputTest {
	
	public ControlBudgetInput zhibiao;
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup(){
		zhibiao=new ControlBudgetInput();
	}
	
	
	//等待
	@Test
	public void Waittime10(){
		try {
			zhibiao.Waittime10();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//等待
	@Test
	public void Waittime2(){
		try {
			zhibiao.Waittime2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//拉伸菜单
	@Test
	public void sidebarButton(){
		zhibiao.sidebarButton();
	}
	
	//指标管理
	@Test
	public void GuanLiButton(){
		zhibiao.GuanLiButton();
	}
	
	//点击年初控制数录入菜单
	@Test
	public void ControlBudget(){
		zhibiao.ClikAddButton();
	}
	
	//定位到iframe界面
	@Test
	public void menuFrame(){
		zhibiao.menuFrame();
	}	
	
	//点击年初数录入按钮
	@Test
	public void ControlBudgetInputButton(){
		zhibiao.ControlBudgetInputButton();
	}
	
	//新增模板
	@Test
	public void newmodule(){
		zhibiao.newmodule();
	}
	
	//定位
	@Test
	public void dingwei(){
		zhibiao.dingwei();
	}
	
	//新增模板_数据录入并保存
	@Parameters({"ModuleName","ModuleMoney"})
	@Test
	public void NewModuleData(String ModuleName,String ModuleMoney){
		zhibiao.NewModuleData(ModuleName,ModuleMoney);
	}
	
	//选择模板
	@Parameters("ModuleName")
	@Test
	public void ChooseModule(String ModuleName){		
		zhibiao.ChooseModule(ModuleName);
	}
	
	//指标管理的模块-年初控制数录入-年初数录入-选择模板-数据补充
	@Parameters("ModuleName")
	@Test
	public void ChooseModule_Data(){		
		zhibiao.ChooseModule_Data();
	}
	
	//指标管理的模块-年初控制数录入-年初数录入-添加操作（加号）
	@Test
	public void AddControlBudgetData(){		
		zhibiao.AddControlBudgetData();
	}
	
	//指标管理的模块-年初控制数录入-年初数录入-保存操作
	@Test
	public void ControlBudgetDataSave(){		
		zhibiao.ControlBudgetDataSave();
	}
	
	//指标管理的模块-年初控制数录入-送审第一条数据
	@Test
	public void ZhiBiaoSongShen_1(){		
		zhibiao.ZhiBiaoSongShen_1();
	}
	
	//指标管理的模块-年初控制数录入-全部勾选
	@Test
	public void AllZhiBiao(){		
		zhibiao.AllZhiBiao();
	}
	
	//指标管理的模块-年初控制数录入-批量送审操作
	@Test
	public void MoreZhiBiaoSongShen(){		
		zhibiao.MoreZhiBiaoSongShen();
	}
	
}
