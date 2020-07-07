package zc80.common.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import fasp.PayAccredit.po.PuTongZhuanZhangInput;
import zc80.common.po.ZiChanPeiZhi;



/**
 * 
 *@ClassName:LoginPageTest
 *@Description:登录页面测试类
 *@author:付有翔
 *@date:2017年5月15日
 *
 */
public class ZiChanPeiZhiTest {

	public WebDriver driver;
	public ZiChanPeiZhi peizhi;
	

	@BeforeClass
	public void setup(){
		peizhi=new ZiChanPeiZhi();
	}
	
	//点击拉伸按钮
	@Test
	public void LaShenTest(){
		peizhi.LaShen();
		
	}

	//线程睡眠
	@Test
	public void Sleep5(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(5000);
			System.out.println("----10秒睡眠完成！----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	
	//资产管理悬浮
	@Test
	public void GuanLiButton(){
		peizhi.GuanLiButton();
		
	}
	
	//点击拉伸按钮
	@Test
	public void ZiChanPeiZhiAdd(){
		peizhi.ZiChanPeiZhiAdd();
		
	}
	 
	
}
