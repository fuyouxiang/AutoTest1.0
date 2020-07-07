package fasp.PayAccredit.po.test;

import java.text.DecimalFormat;

import main.po.BasePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
public class XianJinYeWuInputTest {
	
	public XianJinYeWuInput XianJinYeWu;
	
	public WebDriver driver;

	
	@BeforeClass
	public void setup(){
		XianJinYeWu=new XianJinYeWuInput();
	}
	
	
	//我要支付
	@Test
	public void IWantPayButton(){
		XianJinYeWu.IWantPayButton();
	}
	
	//现金业务录入
	@Test
	public void XianJinYeWuButton(){
		XianJinYeWu.XianJinYeWuButton();
	}
	

	//定位到iframe界面
	@Test
	public void menuFrameZhuYe(){
		XianJinYeWu.menuFrameZhuYe();
	}	
	
	//定位到iframe界面-现金业务
	@Test
	public void menuFrameXianJin(){
		XianJinYeWu.menuFrameXianJin();
	}	
	
	//定位到iframe界面-授权支付
	@Test
	public void menuFrameShouQuan(){
		XianJinYeWu.menuFrameShouQuan();
	}	
	
	
	//选取指标录入
	@Test
	public void ZhiBiaoChoose(){
		XianJinYeWu.ZhiBiaoChoose();
	}
	//选取指标录入
	@Test
	public void ZhiBiaoChoose2(){
		XianJinYeWu.ZhiBiaoChoose2();
	}
	//选取指标录入
	@Test
	public void ZhiBiaoChoose3(){
		XianJinYeWu.ZhiBiaoChoose3();
	}
	
	//
	@Test
	public void TestButton(){
		XianJinYeWu.TestButton();
	}
	
	
	//高级查询按钮
	@Test
	public void GaoJiChaXun(){
		XianJinYeWu.GaoJiChaXun();
	}

	
	
	//跳出frame
	@Test
	public void JumpmenuFrame(){
		XianJinYeWu.JumpmenuFrame();
	}
	
	//线程睡眠
	@Test
	public void Sleep7(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(7000);
			System.out.println("----7秒睡眠完成！----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	
	//线程睡眠
	@Test
	public void Sleep5(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(5000);
			System.out.println("----5秒睡眠完成！----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	
	//线程睡眠
	@Test
	public void Sleep3(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(3000);
			System.out.println("----3秒睡眠完成！----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	
	//第二步-录入信息
	@Parameters({"paymoney","ZhiPiaoHao","ZhaiYao"})
	@Test
	public void inputMessage(String paymoney,String ZhiPiaoHao,String ZhaiYao){
		XianJinYeWu.inputmoney(paymoney);
		XianJinYeWu.inputZhiPiaoHao(ZhiPiaoHao);
		XianJinYeWu.inputZhaiYao(ZhaiYao);

	}
	
	
	//第二步-保存按钮
	@Test
	public void SaveButton(){

			XianJinYeWu.SaveButton();

	}
	
	
	//第二步-批量保存
	@Parameters({"PayNumber","paymoney","ZhiPiaoHao","ZhaiYao"})
	@Test
	public void ContinuitySaveButton(Integer PayNumber,Double paymoney,String ZhiPiaoHao,String ZhaiYao){		
		for(int i=1;i <= PayNumber; i++){
			for(Double n=paymoney;n<=99999.99;n+=0.1){	
				DecimalFormat df = new DecimalFormat("######0.00");
				XianJinYeWu.inputmoney(df.format(n));
			
			//XianJinYeWu.JinJiFenLeiButton();
			//XianJinYeWu.JinJiFenLeiChoose();
			//XianJinYeWu.JinJiFenLeiChoose2();
			//XianJinYeWu.JinJiFenLeiGo();			
			XianJinYeWu.inputZhiPiaoHao(ZhiPiaoHao);
			XianJinYeWu.inputZhaiYao(ZhaiYao);
			XianJinYeWu.SaveButton();
			try {				
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( "------user1成功添加金额为"+ df.format(n) +"元的现金数据！-------");
			}
		}
		
	}
	
	
	private String FormatFloat(String string, Double n) {
		// TODO Auto-generated method stub
		return null;
	}


	//我的单据
	@Test
	public void MyBill(){
		XianJinYeWu.MyBill();;
	}
	
	//我的单据-经办-第一条
	@Test
	public void MyBillJBFirst(){
		XianJinYeWu.MyBillJBFirst();;
	}
	
	//我的单据-经办未签章-签章
	@Test
	public void MyBillJBStamp(){
		XianJinYeWu.MyBillJBStamp();;
	}
	
	
	//右上角退出按钮
	@Test
	public void OutButton(){
		XianJinYeWu.OutButton();;
	}
	
	//右上角退出确认按钮
	@Test
	public void OutConfirmButton(){
		XianJinYeWu.OutConfirmButton();
	}
	
	//右上角退出确认按钮
	@Test
	public void Driver(){
		driver.get("http://192.168.10.11:5004");
	}
	
	//登录操作
	@Parameters({"username","password"})
	@Test
	public void testLogin(String username,String password){
		XianJinYeWu.login(username, password);
		
	}
	
	//连续录入
	@Test
	public void ContinuityinputButton(){
		XianJinYeWu.ContinuityinputButton();
	}
	

	
}
