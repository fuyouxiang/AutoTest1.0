package fcfa.assetmanage.po.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fcfa.assetmanage.po.CardItemEditPage;

/**
 * 
 *@ClassName:CardItemEditPageTest
 *@Description:资产管理-信息项管理编辑页面测试类
 *@author:邓泽芳
 *@date:2017年2月23日
 *
 */
//@Listeners({TestNGListener.class})
public class CardItemEditPageTest {

	public CardItemEditPage cardItemEditPage;
	public WebDriver driver;

	
	@BeforeClass
	public void setup(){
		cardItemEditPage=new CardItemEditPage();
	}
	
	
	@Parameters({"code","name","maxlen"})
	@Test
	public void testClickCardItemAdd(String code,String name,String maxlen) throws InterruptedException{
		
		cardItemEditPage.cardItemAdd_Save(code, name, maxlen);
		
	}
	
		
	//@AfterClass
	public void quit(){
		driver.quit();
	}
	
}
