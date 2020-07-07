package fasp.budget.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fasp.budget.po.SpecialBudgetCheck;



/**
 * 
 *@ClassName:LoginPageTest
 *@Description:指标送审测试类
 *@author:付有翔
 *@date:2017年5月15日
 *
 */
public class SpecialBudgetCheckTest {
	
	public SpecialBudgetCheck zhibiao;
	public WebDriver driver;
	
	@BeforeClass
	public void setup(){
		zhibiao=new SpecialBudgetCheck();
	}
	 
	//指标管理
	@Test
	public void GuanLiButton(){
		zhibiao.sidebarButton();
		zhibiao.GuanLiButton();
	}
	
	
	//首页点击专项指标审核按钮
	@Test
	public void ClikSubmitButton(){
		zhibiao.ClikSubmitButton();
	}
	
	//第一个审核
	@Parameters("suggestion")
	@Test
	public void ZhiBiaoShenHe_One(String suggestion){
		zhibiao.ZhiBiaoShenHe_One(suggestion);
	}
	
	//勾选全部审核
	@Parameters("suggestion")
	@Test
	public void MoreReview(String suggestion){
		zhibiao.MoreReview(suggestion);
	}	
	

	
}
