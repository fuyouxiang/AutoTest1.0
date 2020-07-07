package fcfa.common.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.common.po.ConfirmPage;
import fcfa.common.po.IndexPage;

/**
 * 
 *@ClassName:ConfirmPageTest
 *@Description:确认提示页面测试类
 *@author:邓泽芳
 *@date:2017年2月23日
 *
 */
//@Listeners({TestNGListener.class})
public class ConfirmPageTest {
	public ConfirmPage confirmPage;
	public WebDriver driver;
	
	@BeforeClass
	public void setup(){
		confirmPage=new ConfirmPage();
	}
	
	@Parameters("expectedMsg")
	@Test
	public void testAssertEquals(String expectedMsg){
	//	System.out.println(confirmPage.getMsgContent());
		Assert.assertEquals(confirmPage.getMsgContent(), expectedMsg);
	}
	

	@Test
	public void testclickConfirmBtn() throws InterruptedException{
		confirmPage.clickConfirmBtn();
	}
	
	
//	@AfterClass
	public void close(){	
		driver.close();
	}

}
