package fasp.PayAccredit.po.test;

import main.po.BasePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fasp.PayAccredit.po.PayAccreditCommon;
import fasp.PayAccredit.po.XianJinYeWuInput;
import fasp.budget.po.ControlBudgetInput;

/**
 * 
 *@ClassName:XianJinYeWuInputTest
 *@Description:现金业务录入测试类
 *@author:付有翔
 *@date:2017年10月11日
 *
 */
public class PayAccreditCommonTest {
	
	public PayAccreditCommon payAccreditCommon;
	
	public WebDriver driver;

	
	@BeforeClass
	public void setup(){
		payAccreditCommon=new PayAccreditCommon();
	}
	
	
	//我的单据
	@Test
	public void MyBill(){
		payAccreditCommon.MyBill();;
	}
	
	//我的单据-经办-第一条
	@Test
	public void MyBillJBFirst(){
		payAccreditCommon.MyBillJBFirst();;
	}
	
	//我的单据-经办未签章-签章
	@Test
	public void MyBillJBStamp(){
		payAccreditCommon.MyBillJBStamp();;
	}
	
	
	//登录操作
	@Parameters({"username","password"})
	@Test
	public void testLogin(String username,String password){
		payAccreditCommon.login(username, password);
		
	}
	
	
}
