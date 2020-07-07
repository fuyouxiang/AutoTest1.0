package fasp.PayAccredit.po.test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import main.po.BasePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fasp.PayAccredit.po.PuTongZhuanZhangInput;
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
public class PuTongZhuanZhangInputTest {
	
	public PuTongZhuanZhangInput XianJinYeWu;
	
	public WebDriver driver;
	
	
	@BeforeClass
	public void setup(){
		XianJinYeWu=new PuTongZhuanZhangInput();
	}
	
	public String DateTime() {
		  Date nowTime = new Date(System.currentTimeMillis());
		  SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss     ");
		  String DateTime = sdFormatter.format(nowTime);
		  return DateTime;
	}
	
	//我要支付
	@Test
	public void IWantPayButton(){
		XianJinYeWu.IWantPayButton();
		System.out.println(DateTime()+ "点击  我要支付  ！");
	}
	
	//现金业务录入
	@Test
	public void XianJinYeWuButton(){
		XianJinYeWu.XianJinYeWuButton();
		System.out.println(DateTime() + "点击  普通转账  ！");
	}
	

	//定位到iframe界面
	@Test
	public void menuFrameZhuYe(){
		XianJinYeWu.menuFrameZhuYe();
		System.out.println(DateTime() + "定位主页成功！");
	}	
	
	//定位到iframe界面-现金业务
	@Test
	public void menuFrameXianJin(){
		XianJinYeWu.menuFrameXianJin();
		System.out.println(DateTime() + "定位普通转账成功！");
	}	
	
	//定位到iframe界面-授权支付
	@Test
	public void menuFrameShouQuan(){
		XianJinYeWu.menuFrameShouQuan();
	}	
	
	//授权支付划款凭证回单登记
	@Test
	public void Huakuandengji(){
		XianJinYeWu.Huakuandengji();
	}	
	
	
	//选取指标录入
	@Test
	public void ZhiBiaoChoose(){
		XianJinYeWu.ZhiBiaoChoose();
		System.out.println(DateTime() + "选取指标成功！");
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
	
	//审核签公章
	@Test
	public void Gongzhang(){
		XianJinYeWu.Gongzhang();
	}
	
	//签章并送审
	@Test
	public void SaveSendButton(){
		XianJinYeWu.SaveSendButton();
	}

	//首页
	@Test
	public void ShouYe(){
		XianJinYeWu.ShouYe();
	}
	
	//授权支付凭证回单自动签收
	@Test
	public void Zidongqianshou(){
		XianJinYeWu.Zidongqianshou();
	}
	
	//授权支付凭证回单自动签收
	@Test
	public void menuFrameZidongQS(){
		XianJinYeWu.menuFrameZidongQS();
	}
	
	//授权支付划款回单签收
	@Test
	public void menuFrameHuakuanQS(){
		XianJinYeWu.menuFrameHuakuanQS();
	}
	
	//授权支付划款回单签收
	@Test
	public void MenuFirstLie2(){
		XianJinYeWu.MenuFirstLie2();
	}
	
	
	
	//菜单第一列
	@Test
	public void MenuFirstLie(){
		XianJinYeWu.MenuFirstLie();
	}
	
	//手工签收
	@Test
	public void BtnHand(){
		XianJinYeWu.BtnHand();
	}
	
	
	//跳出frame
	@Test
	public void JumpmenuFrame(){
		XianJinYeWu.JumpmenuFrame();
		System.out.println(DateTime() +"跳出当前iFrame!");
	}
	
	//线程睡眠
	@Test
	public void Sleep10(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(10000);
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
	public void Sleep20(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(20000);
			System.out.println("----20秒睡眠完成！----");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
	}
	
	//线程睡眠
	@Test
	public void Sleep80(){
		try {
			System.out.println("----线程睡眠中----");
			Thread.sleep(80000);
			System.out.println("----80秒睡眠完成！----");
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
	@Parameters({"PayNumber","paymoney","ZhaiYao","payAccountName","payAccountNo","payAccountBank"})
	@Test
	public void inputMessage(Integer PayNumber,String paymoney,String ZhaiYao,String payAccountName,String payAccountNo,String payAccountBank){		

		for(int i=1;i<=10000;i++){
			XianJinYeWu.inputmoney(paymoney);
			XianJinYeWu.PayAccountName(payAccountName);
			XianJinYeWu.PayAccountNo(payAccountNo);
			XianJinYeWu.PayAccountBank(payAccountBank);
			XianJinYeWu.inputZhaiYao(ZhaiYao);
			XianJinYeWu.SaveButton();
			try {
				System.out.println("----线程睡眠中----");
				Thread.sleep(3000);
				System.out.println("----4秒睡眠完成！----");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
			}
			System.out.println( "------普通转账：成功录入"+ i +"条的数据！-------");
		}
			
		
	}
	
	//第二步-保存按钮
	@Test
	public void SaveButton(){

			XianJinYeWu.SaveButton();
			System.out.println( "------保存成功！-------");

	}
	
	//；连续录入按钮
	@Test
	public void LianXunButton(){

			XianJinYeWu.LianXuButton();
			System.out.println( "------连续录入-------");

	}
	
	
	//第二步-批量保存
	@Parameters({"PayNumber","paymoney","ZhaiYao","payAccountName","payAccountNo","payAccountBank"})
	@Test
	public void ContinuitySaveButton(Integer PayNumber,Double paymoney,String ZhaiYao,String payAccountName,String payAccountNo,String payAccountBank){		
		for(int i=1;i <= PayNumber; i++){
			for(Double n=paymoney;n<=99999.99;n+=1){	
				DecimalFormat df = new DecimalFormat("######0.00");
				XianJinYeWu.inputmoney(df.format(n));
			
			//XianJinYeWu.JinJiFenLeiButton();
			//XianJinYeWu.JinJiFenLeiChoose();
			//XianJinYeWu.JinJiFenLeiChoose2();
			//XianJinYeWu.JinJiFenLeiGo();
				
			//XianJinYeWu.inputZhiPiaoHao(ZhiPiaoHao);
			XianJinYeWu.PayAccountName(payAccountName);
			XianJinYeWu.PayAccountNo(payAccountNo);
			XianJinYeWu.PayAccountBank(payAccountBank);
			XianJinYeWu.inputZhaiYao(ZhaiYao);
			XianJinYeWu.SaveButton();
			//XianJinYeWu.CloseMessage();
			try {				
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(DateTime() + "普通转账：成功添加金额为"+ df.format(n) +"元的数据！-------");
			}
		}
		
	}
	
	
	private String FormatFloat(String string, Double n) {
		// TODO Auto-generated method stub
		return null;
	}


	//第二步保存
	@Test
	public void SaveButton2(){
		XianJinYeWu.SaveButton();
	}
	
	//我的单据
	@Test
	public void MyBill(){
		XianJinYeWu.MyBill();
		System.out.println("----进入我的单据!----");
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
	
	//我的单据-经办未签章-全部签章
	@Test
	public void MyBillAllJBStamp(){
		for(int i=1;i <= 10000; i++){
			XianJinYeWu.MyBillAllcheckbox();
			XianJinYeWu.MyBillJBStamp();
			try {
				System.out.println("----线程睡眠中----");
				Thread.sleep(80000);
				System.out.println("----80秒睡眠完成！----");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
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
		System.out.println(DateTime()+"勾选连续录入按钮成功！");
	}
	
	//全部勾选
	@Test
	public void MyBillAllcheckbox(){
		XianJinYeWu.MyBillAllcheckbox();
	}
	
	//去签章
	@Test
	public void backMywork(){
		XianJinYeWu.backMywork();
	}
	
	//提示框关闭
	@Test
	public void CloseMessage(){
		XianJinYeWu.CloseMessage();
	}
	
	//授权支付划款回单签收
	@Test
	public void Huakuanqianshou(){
		XianJinYeWu.Huakuanqianshou();
	}
	
	
	//授权支付划款凭证回单登记
	@Test
	public void menuFrameHuakuanDJ(){
		XianJinYeWu.menuFrameHuakuanDJ();
	}
	
	//授权支付划款回单登记-登记
	@Test
	public void btnConfirm(){
		XianJinYeWu.btnConfirm();
	}
	

}
