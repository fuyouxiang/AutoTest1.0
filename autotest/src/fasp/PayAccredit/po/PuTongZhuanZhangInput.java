package fasp.PayAccredit.po;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.po.BasePage;


/**
 * 
 *@ClassName:XianJinYeWuInput
 *@Description:现金业务录入描述类
 *@author:付有翔
 *@date:2017年10月11日
 *
 */
public class PuTongZhuanZhangInput  extends BasePage {
	
	
	public PuTongZhuanZhangInput(){
		super();
	}
	
	
	//用户名
	@FindBy(id="username")
	private WebElement login_username;
	
	//密码
	@FindBy(id="password")
	private WebElement login_password;
	
	//登录按钮
	@FindBy(id="login-btn")
	private WebElement login_button;
	
	
	//我要支付                                          
	@FindBy(xpath=".//*[@id='top']/div/ul/li[2]")
	private WebElement IWantPay;
	
	//现金业务
	@FindBy(linkText="普通转账")
	private WebElement XianJinYeWuButton;
	
	//高级查询按钮，用来定位
	@FindBy(xpath=".//*[@id='operate-container1']/div[2]/div/div[2]/span[2]/button")
	private WebElement GaoJiChaXun;
	
	//选择指标
	//@FindBy(xpath="html/body/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div/div/div[3]/div[2]/table/tbody/tr[1]/td/div/div/a[1]")
	@FindBy(xpath="html/body/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div/div/div[3]/div[2]/table/tbody/tr[6]/td/div/div/a[1]")
	private WebElement ZhiBiaoChoose;
	
	//选择指标
	@FindBy(xpath="html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/div[3]/div[3]/table/tbody/tr/td[2]/div啊啊啊")
	private WebElement ZhiBiaoChoose2;
	public void ZhiBiaoChoose2(){
		ZhiBiaoChoose2.click();
	}
	//选择指标
	@FindBy(xpath="html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/div[3]/div[3]/table/tbody/tr/td[4]/div/p")
	private WebElement ZhiBiaoChoose3;
	public void ZhiBiaoChoose3(){
		ZhiBiaoChoose3.click();
		
	}
	
	

	//第一步-录入按钮
	@FindBy(xpath=".//*[@id='operate-container1']/div[1]/div/span[1]")
	private WebElement LuRuButton;
	
	//测试按钮
	@FindBy(id="payProgressRefreshGaoji")
	private WebElement TestButton;
	
	//空白处
	@FindBy(xpath="html/body/div[2]/div[1]/div[1]/div")
	private WebElement TestButton2;
	
	//第二步-录入信息-经济分类按钮
	@FindBy(id="EXPECO-payinputinfoshow-btn")
	private WebElement JinJiFenLeiButton;
	
	//第二步-录入信息-经济分类选择
	@FindBy(id="ip-open-all")
	private WebElement JinJiFenLeiChoose;
	@FindBy(id="radio-data-tree_2_span")
	private WebElement JinJiFenLeiChoose2;
	
	//第二步-录入信息-经济分类确定
	@FindBy(id="sur-radio-data-tree")
	private WebElement JinJiFenLeiGo;
	
	//第二步-录入信息-申请金额
	@FindBy(id="inputmoney")
	private WebElement inputmoney;
	
	//第二步-录入信息-支票号
	@FindBy(id="inputcheckno")
	private WebElement inputZhiPiaoHao;
	
	//第二步-录入信息-摘要
	@FindBy(id="PAY_SUMMARY-inputremark")
	private WebElement inputZhaiYao;
	
	//第二步-录入信息-收款人名称
	@FindBy(id="payee-account-name")
	private WebElement pay_account_name;
	
	//第二步-录入信息-收款人账号
	@FindBy(id="payee-account-no")
	private WebElement pay_account_no;
	
	//第二步-录入信息-收款人银行
	@FindBy(id="PB-payee-account-bank")
	private WebElement pay_account_bank;
	
	
	
	//第二步-录入信息-保存
	@FindBy(xpath="html/body/div[2]/div[1]/div[5]/div[1]/div/div/div[2]/div[2]/button[2]")
	private WebElement SaveButton;
	
	
	//第二步-录入信息-连续录入
	@FindBy(id="checkinput")
	private WebElement ContinuityinputButton;
	
	
	//我的单据
	@FindBy(xpath=".//*[@id='topDanju']/img")
	private WebElement MyBill;
	
	//我的单据-经办未签私章-第一条 
	@FindBy(xpath="html/body/div[3]/div[2]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[3]/div[1]/div[1]/span/span")
	private WebElement MyBillJBFirst;
	
	//我的单据-经办未签私章-全部
	@FindBy(className="u-grid-checkbox-tick-outline")
	private WebElement myBillAllcheckbox;
	
	
	//我的单据-经办未签私章-签章
	@FindBy(id="btn-stamp")
	private WebElement MyBillJBStamp;
	
	//右上角-退出按钮
	@FindBy(className="dropdown-toggle")
	private WebElement OutButton;
	
	//右上角-退出按钮-确认按钮
	@FindBy(xpath=".//*[@id='layui-layer1']/div[3]/a[1]")
	private WebElement OutConfirmButton;
	
	//返回首页
	@FindBy(id="backMywork")
	private WebElement backmywork;
	
	
	//审核未签公章
	@FindBy(linkText="审核未签公章")
	private WebElement gongzhang;
	
	//保存并签章
	@FindBy(xpath=".//*[@id='ptModal1']/div/div/div[2]/div[2]/button[2]")
	private WebElement saveSendButton;
	
	//保存并签章
	@FindBy(id="iframe_first_id")
	private WebElement shouye;
	
	//授权支付凭证回单自动签收
	@FindBy(partialLinkText="授权支付凭证回单自动签收")
	private WebElement zidongqianshou;
	
	//授权支付划款凭证回单签收
	@FindBy(partialLinkText="授权支付划款回单签收")
	private WebElement huakuanqianshou;

	//授权支付划款凭证回单登记
	@FindBy(partialLinkText="授权支付划款凭证回单登记")
	private WebElement huakuandengji;
	
	//授权支付凭证回单自动签收第一列       
	@FindBy(xpath="html/body/div[3]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div[1]/div[1]/span/span")
	private WebElement menuFirstLie;
	
	//授权支付划款回单签收第一列                   html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div[1]/div/span/span
	@FindBy(xpath="html/body/div[3]/div/div[2]/div[2]/div[1]/div/div/div[3]/div[1]/div[1]/span/span")
	private WebElement menuFirstLie2;
	
	//授权支付划款回单登记-第一列                      
	@FindBy(xpath="html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div[1]/div/span/span")
	private WebElement menuFirstLie3;
	
	
	//手工签收  btn-bat-confirm
	@FindBy(id="btn-hand-receive")
	private WebElement btnHand;
	
	//手工登记
	@FindBy(id="btn-bat-confirm")
	private WebElement btnconfirm;
	
	//提示框关闭                        
	@FindBy(xpath=".//*[@id='info-notice']/div[1]/button")
	private WebElement closeMessage;
	
	//提示框关闭                        
	@FindBy(id="checkinput")
	private WebElement LianXu;
	
		
	
	
	
	
	
	/**
	 * 
	 *@Method:授权支付划款回单登记-登记
	 *@Description:
	 *@author:付有翔
	 *@date:2017年11月07日
	 *
	 */	
	public void btnConfirm(){
		btnconfirm.click();
	}

	
	/**
	 * 
	 *@Method:授权支付划款回单登记-第一列    
	 *@Description:
	 *@author:付有翔
	 *@date:2017年11月07日
	 *
	 */	
	public void MenuFirstLie3(){
		menuFirstLie3.click();
	}

	
	/**
	 * 
	 *@Method:授权支付划款凭证回单登记
	 *@Description:
	 *@author:付有翔
	 *@date:2017年11月07日
	 *
	 */	
	public void Huakuandengji(){
		huakuandengji.click();
	}
	
	
	/**
	 * 
	 *@Method:授权支付划款回单签收
	 *@Description:
	 *@author:付有翔
	 *@date:2017年11月07日
	 *
	 */	
	public void MenuFirstLie2(){
		menuFirstLie2.click();
	}
	
	
	
	/**
	 * 
	 *@Method:授权支付划款回单签收
	 *@Description:
	 *@author:付有翔
	 *@date:2017年11月07日
	 *
	 */	
	public void Huakuanqianshou(){
		huakuanqianshou.click();
	}
	
	
	
	/**
	 * 
	 *@Method:
	 *@Description:提示框关闭
	 *@author:付有翔
	 *@date:2017年11月07日
	 *
	 */	
	public void CloseMessage(){
		closeMessage.click();
	}
	
	
	
	
	/**
	 * 
	 *@Method:
	 *@Description:手工签收
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void BtnHand(){
		btnHand.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:菜单第一列
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void MenuFirstLie(){
		menuFirstLie.click();
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:授权支付凭证回单自动签收
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void Zidongqianshou(){
		zidongqianshou.click();
	}
	
	
	
	/**
	 * 
	 *@Method:
	 *@Description:去签章
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void ShouYe(){
		shouye.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:去签章
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void SaveSendButton(){
		saveSendButton.click();
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:去签章
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void Gongzhang(){
		gongzhang.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:去签章
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void backMywork(){
		backmywork.click();
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:我要支付
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void IWantPayButton(){
		//调用Actions中的鼠标指针停留方法
		Actions action = new Actions(driver); 
		action.moveToElement(IWantPay).perform();
		//IWantPay.click();
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:现金业务录入按钮
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void XianJinYeWuButton(){
		XianJinYeWuButton.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:定位到iframe界面，参数值可以是id或name，因为中间页面是用iframe嵌入的
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void menuFrameXianJin(){
		WebElement iframe2=driver.findElement(By.name("普通转账"));
		driver.switchTo().frame(iframe2);
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:定位到iframe界面，参数值可以是id或name，因为中间页面是用iframe嵌入的
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void menuFrameShouQuan(){
		WebElement iframe3=driver.findElement(By.name("授权支付"));
		driver.switchTo().frame(iframe3);
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:定位到iframe界面，参数值可以是id或name，因为中间页面是用iframe嵌入的
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void menuFrameZidongQS(){
		WebElement iframe=driver.findElement(By.name("授权支付凭证回单自动签收"));
		driver.switchTo().frame(iframe);
		
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:定位到iframe界面，参数值可以是id或name，因为中间页面是用iframe嵌入的
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void menuFrameHuakuanQS(){
		WebElement iframe=driver.findElement(By.name("授权支付划款回单签收"));
		driver.switchTo().frame(iframe);
		
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:定位到iframe界面，参数值可以是id或name，因为中间页面是用iframe嵌入的
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void menuFrameHuakuanDJ(){
		WebElement iframe=driver.findElement(By.name("授权支付划款凭证回单登记"));
		driver.switchTo().frame(iframe);
		
	}
	
	
	
	/**
	 * 
	 *@Method:
	 *@Description:定位到iframe界面，参数值可以是id或name，因为中间页面是用iframe嵌入的
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void menuFrameZhuYe(){
		WebElement iframe=driver.findElement(By.id("iframeDashboard"));
		driver.switchTo().frame(iframe);
		
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:跳出frame
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void JumpmenuFrame(){
		driver.switchTo().defaultContent();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:高级查询
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void GaoJiChaXun(){
		GaoJiChaXun.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:选择指标-录入
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void ZhiBiaoChoose(){
		ZhiBiaoChoose.click();
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:测试按钮
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void TestButton(){
		TestButton.click();
	}
	

	/**
	 * 
	 *@Method:
	 *@Description:申请金额
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void inputmoney(String paymoney){
		inputmoney.sendKeys(paymoney);
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:z支票号
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void inputZhiPiaoHao(String ZhiPiaoHao){
		inputZhiPiaoHao.clear();
		inputZhiPiaoHao.sendKeys(ZhiPiaoHao);
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:摘要
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void inputZhaiYao(String ZhaiYao){
		inputZhaiYao.clear();
		inputZhaiYao.sendKeys(ZhaiYao);
	}
	/**
	 * 
	 *@Method:
	 *@Description:收款人名称
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void PayAccountName(String payAccountName){
		pay_account_name.clear();
		pay_account_name.sendKeys(payAccountName);
	}
	/**
	 * 
	 *@Method:
	 *@Description:收款人编号
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void PayAccountNo(String payAccountNo){
		pay_account_no.clear();
		pay_account_no.sendKeys(payAccountNo);
	}	/**
	 * 
	 *@Method:
	 *@Description:收款人银行
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void PayAccountBank(String payAccountBank){
		pay_account_bank.clear();
		pay_account_bank.sendKeys(payAccountBank);
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:保存按钮
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void SaveButton(){
		SaveButton.click();

		
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:我的单据
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void MyBill(){
		MyBill.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:我的单据-经办未签章-第一条
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void MyBillJBFirst(){
		MyBillJBFirst.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:我的单据-经办未签章-签章
	 *@author:付有翔
	 *@date:2017年10月11日
	 *
	 */	
	public void MyBillJBStamp(){
		MyBillJBStamp.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:右上角退出按钮
	 *@author:付有翔
	 *@date:2017年10月12日
	 *
	 */	
	public void OutButton(){
		OutButton.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:右上角退出确认按钮
	 *@author:付有翔
	 *@date:2017年10月12日
	 *
	 */	
	public void OutConfirmButton(){
		OutConfirmButton.click();
	}
	
	/**
	 * 
	 *@Method:login
	 *@Description:输入用户名和密码，点击登录按钮
	 *@param username
	 *@param password
	 *@author:付有翔
	 *@date:2017年10月12日
	 *
	 */
	public void login(String username,String password){
		//刷新页面
		driver.navigate().refresh();
		login_username.clear();
		login_username.sendKeys(username);
		login_password.clear();
		login_password.sendKeys(password);
		login_button.click();
		
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:连续录入
	 *@author:付有翔
	 *@date:2017年10月13日
	 *
	 */	
	public void ContinuityinputButton(){
		ContinuityinputButton.click();
	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:经济分类
	 *@author:付有翔
	 *@date:2017年10月16日
	 *
	 */	
	public void JinJiFenLeiButton(){
		JinJiFenLeiButton.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:经济分类选择
	 *@author:付有翔
	 *@date:2017年10月16日
	 *
	 */	
	public void JinJiFenLeiChoose(){
		JinJiFenLeiChoose.click();

	}
	
	/**
	 * 
	 *@Method:
	 *@Description:经济分类选择2
	 *@author:付有翔
	 *@date:2017年10月16日
	 *
	 */	
	public void JinJiFenLeiChoose2(){
		JinJiFenLeiChoose2.click();

	}
	
	
	/**
	 * 
	 *@Method:
	 *@Description:经济分类确定
	 *@author:付有翔
	 *@date:2017年10月16日
	 *
	 */	
	public void JinJiFenLeiGo(){
		JinJiFenLeiGo.click();
	}
	
	/**
	 * 
	 *@Method:
	 *@Description:连续录入
	 *@author:付有翔
	 *@date:2018年11月27日
	 *
	 */	
	public void LianXuButton(){
		LianXu.click();
	}
	
	
	
	/**
	 * 
	 *@Method:
	 *@Description:我的单据全选框
	 *@author:付有翔
	 *@date:2017年10月16日
	 *
	 */	
	public void MyBillAllcheckbox(){

	}
	


		
}
