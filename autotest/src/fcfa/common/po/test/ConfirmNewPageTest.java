package fcfa.common.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.common.po.ConfirmNewPage;

/**
 * 
 *@ClassName:ConfirmNewPage
 *@Description:确认提示新界面测试类
 *@author:邓泽芳
 *@date:2017年3月8日
 *
 */
public class ConfirmNewPageTest {
	
	public ConfirmNewPage confirmNewPage;
	public WebDriver driver;

	@BeforeClass
	public void setup(){
		confirmNewPage=new ConfirmNewPage();
	}
	
	@Parameters("expectedMsg")
	@Test
	public void testAssertEquals(String expectedMsg){
		Assert.assertEquals(confirmNewPage.getMsgContent(), expectedMsg);
	}
	
}
